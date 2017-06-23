package com.cooksys.schema;

import com.cooksys.schema.person.*;


public class SchemaApp {
	
	
	public static void main(String[] args) {
		Person human = new Person();
		PersonDaoImpl person = new PersonDaoImpl();
		person.findById(10);
//		human.setFirstName("Dawn");
//		human.setLastName("Huey");
//		human.setLocation(3);
//		human.setAge(Long.valueOf(36));
//		
//		if(person.create(human)) {
//			System.out.println("Inserted");
//		}
//		else {
//			System.out.println("Something stupid happened...");
//		}
	}
	
	
}