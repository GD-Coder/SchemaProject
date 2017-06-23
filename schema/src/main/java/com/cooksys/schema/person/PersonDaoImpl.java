package com.cooksys.schema.person;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cooksys.schema.interfacer.PersonDAO;

public class PersonDaoImpl implements PersonDAO {
	
	JDBCDriver drive = new JDBCDriver();
	ArrayList<Person> people = new ArrayList<Person>();
	
	
	@Override
	public List<Person> findById(Integer id) {
		String selectTableSQL = "SELECT person_id, f_name, l_name, location, age FROM schema_design.\"Person\" WHERE person_id = "+ id +";";
		try {
			Statement statement = drive.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(selectTableSQL);
			 
			
			while (rs.next()) {
				String userid = rs.getString("person_id");
				String username = rs.getString("f_name");
				String lname = rs.getString("l_name");
				String location = rs.getString("location");
				String age = rs.getString("age");
				System.out.println(userid + " " + username + " " + lname + " " + location + " " + age);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e.toString());

		}
		return null;
	}

	@Override
	public boolean create(Person person) {
		String fn = person.getFirstName();
		String ln = person.getLastName();
		Integer loc = person.getLocation();
		Long age = person.getAge();
		
		String insertTableSQL = "INSERT INTO schema_design.\"Person\"(person_id, f_name, l_name, location, age) "				
				+ "VALUES('"+ fn +"', '"+ ln +"', "+ loc +", "+ age  +");";
		try {
			Statement statement = drive.getConnection().createStatement();			
			statement.executeUpdate(insertTableSQL);
				return true;

		} catch (Exception e) {
			System.out.println(e.toString());
			return false;

		}

		
//	}
//		System.out.println(insertTableSQL);
//		return true;
	}	
}
