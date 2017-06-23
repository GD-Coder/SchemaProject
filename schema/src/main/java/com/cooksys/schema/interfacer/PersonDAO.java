package com.cooksys.schema.interfacer;

import com.cooksys.schema.person.Person;

public interface PersonDAO {	
	
	boolean create(Person person);
	Person findById(Integer id);

}
