package com.cooksys.schema.interfacer;

import java.util.List;

import com.cooksys.schema.person.Interests;
import com.cooksys.schema.person.Location;
import com.cooksys.schema.person.Person;

public interface PersonDAO {	
	
	boolean create(Person person);
	Person findById(Integer id);
	List<Person> findInterestGroup(Interests interest, Location location);
}
