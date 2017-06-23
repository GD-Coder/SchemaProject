package com.cooksys.schema.interfacer;

import java.util.List;

import com.cooksys.schema.person.Person;

public interface PersonDAO {
	
	
	boolean create(Person person);
	List<Person> findById(Integer id);

}
