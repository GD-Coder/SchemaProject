package com.cooksys.schema;

import com.cooksys.schema.person.*;


public class SchemaApp {
	
	
	public static void main(String[] args) {
		Person human = new Person();
		PersonDaoImpl person = new PersonDaoImpl();
		person.findById(5);
		human.setFirstName("James");
		human.setLastName("Dean");
		human.setLocation(2);
		human.setAge(Long.valueOf(55));
		
		if(person.create(human)) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Something stupid happened...");
		}
	}
	
	
}