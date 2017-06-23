import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriver {
	public static void main(String[] argv) throws SQLException {

		// System.out.println("-------- PostgreSQL "
		// + "JDBC Connection Testing ------------");
		//
		// try {
		//
		// Class.forName("org.postgresql.Driver");
		//
		// } catch (ClassNotFoundException e) {
		//
		// System.out.println("Where is your PostgreSQL JDBC Driver? "
		// + "Include in your library path!");
		// e.printStackTrace();
		// return;
		//
		// }
		//
		// System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
					"bondstone");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		String selectTableSQL = "SELECT person_id, f_name, l_name FROM schema_design.\"Person\";";
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(selectTableSQL);
			while (rs.next()) {
				String userid = rs.getString("person_id");
				String username = rs.getString("f_name");
				String lname = rs.getString("l_name");
				System.out.println(userid + " " + username + " " + lname);
			}
		} catch (Exception e) {
			System.out.println(e.toString());

		}
		finally{
			connection.close();
		}
	}
}
