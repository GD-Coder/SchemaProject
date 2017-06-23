package com.cooksys.schema.person;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cooksys.schema.interfacer.PersonDAO;

public class PersonDaoImpl implements PersonDAO {

	JDBCDriver drive = new JDBCDriver();
	ArrayList<Person> people = new ArrayList<Person>();
	ArrayList<Interests> interests = new ArrayList<Interests>();

	@Override
	public Person findById(Integer id) {
		 String selectTableSQL = "SELECT person_id, f_name, l_name, location, age FROM schema_design.\"Person\" WHERE person_id = "
		 + id + ";";
//		String selectTableSQL = "SELECT person_id, f_name, l_name, age, schema_design.\"Location\".city "
//				+ "FROM schema_design.\"Person\" JOIN schema_design.\"Location\" "
//				+ "ON schema_design.\"Person\".location = schema_design.\"Location\".loca_id " + "WHERE person_id = "
//				+ id + ";";
		Person human = new Person();
		try {
			Statement statement = drive.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(selectTableSQL);

			while (rs.next()) {
				human.setId(Integer.valueOf(rs.getString("person_id")));
				human.setFirstName(rs.getString("f_name"));
				human.setLastName(rs.getString("l_name"));
				human.setLocation(Integer.valueOf(rs.getString("location")));
				human.setAge(Long.valueOf(rs.getString("age")));
				System.out.println(human.getFirstName() + " " + human.getLastName() + " " + human.getLocation() + " "
						+ human.getAge());
			}
			rs.close();
			return human;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}

	}

	@Override
	public boolean create(Person person) {
		String fn = person.getFirstName();
		String ln = person.getLastName();
		Integer loc = person.getLocation();
		Long age = person.getAge();

		String insertTableSQL = "INSERT INTO schema_design.\"Person\"(f_name, l_name, location, age) " + "VALUES('" + fn
				+ "', '" + ln + "', " + loc + ", " + age + ");";
		try {
			Statement statement = drive.getConnection().createStatement();
			statement.executeUpdate(insertTableSQL);
			return true;

		} catch (Exception e) {
			System.out.println(e.toString());
			return false;

		}

	}

	@Override
	public List<Person> findInterestGroup(Interests interest, Location location) {
		
		return null;
	}
}
