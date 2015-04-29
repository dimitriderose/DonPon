package com.donpon.model.Person;

import static org.junit.Assert.*; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
* Testing Person class to make sure the Person DAO is working as expected
* 
* @author Dimitri De Rose
*
*/
//TODO Need to update this class to retrieve information from database
public class PersonImplTest {
	
	private Person person;

	@Before
	public void setUp() {
		person= new PersonImpl();
	}
	
	@After
	public void releaseResources(){
		person= null;
	}

	@Test
	public void testSetFirstName() {
		StringBuilder firstName= new StringBuilder("Sherry");
		person.setFirstName(firstName.toString());
		
		assertEquals(firstName.toString(), person.getFirstName());
	}

	@Test
	public void testSetLastName() {
		StringBuilder lastName= new StringBuilder("Tate");
		person.setLastName(lastName.toString());
		
		assertEquals(lastName.toString(), person.getLastName());
	}

	@Test
	public void testSetEmailAddress() {
		StringBuilder email= new StringBuilder("fun.code@awesome.net");
		person.setEmailAddress(email.toString());
		
		assertEquals(email.toString(), person.getEmailAddress());
	}

	@Test
	public void testGetFirstName() {
		StringBuilder firstName= new StringBuilder("Sherry");
		person.setFirstName(firstName.toString());
		
		assertEquals(firstName.toString(), person.getFirstName());
	}

	@Test
	public void testGetLastName() {
		StringBuilder lastName= new StringBuilder("Tate");
		person.setLastName(lastName.toString());
		
		assertEquals(lastName.toString(), person.getLastName());
	}

	@Test
	public void testGetEmailAddress() {
		StringBuilder email= new StringBuilder("fun.code@awesome.net");
		person.setEmailAddress(email.toString());
		
		assertEquals(email.toString(), person.getEmailAddress());
	}

	@Test
	public void testGetId() {
		//TODO create testcase once Graph Database is up and running
	}

}
