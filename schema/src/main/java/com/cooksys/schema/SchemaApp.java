package com.cooksys.schema;

import com.cooksys.schema.person.*;


public class SchemaApp {
	
	
	public static void main(String[] args) {
		Person human = new Person();
		PersonDaoImpl person = new PersonDaoImpl();
		person.findById(5);
//		human.setFirstName("Albert");
//		human.setLastName("Einstien");
//		human.setLocation(1);
//		human.setAge(Long.valueOf(150));
//		
//		if(person.create(human)) {
//			System.out.println("Inserted");
//		}
//		else {
//			System.out.println("Something stupid happened...");
//		}
	}
	
	
}