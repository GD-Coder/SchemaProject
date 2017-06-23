package com.cooksys.schema.person;

import java.sql.ResultSet;
import java.sql.Statement;

public class Person {

	private Integer id;
	private String firstName;
	private String lastName;
	private Integer location;
	private Long age;
	JDBCDriver driver = new JDBCDriver();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}


}
