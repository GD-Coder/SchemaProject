package com.cooksys.schema;

import com.cooksys.schema.person.*;


public class SchemaApp {
	
	
	public static void main(String[] args) {
		PersonDaoImpl person = new PersonDaoImpl();
		person.findById(1);
	}
	
	
}