package com.donpon.model.Credentials;

import static org.junit.Assert.*; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.donpon.model.Person.Person;
import com.donpon.model.Person.PersonImpl;

/**
* Testing Credentials class to make sure the Credentials DAO is working as expected
* 
* @author Dimitri De Rose
*
*/
//TODO Need to update this class to retrieve information from database
public class CredentialsImplTest {

	private Credentials credentials;
	private Person person;

	@Before
	public void setUp() {
		credentials= new CredentialsImpl();
		
		person= new PersonImpl();
		person.setFirstName("Bill");
		person.setLastName("Hancock");
		person.setEmailAddress("bill.hancock@donate.org");
	}
	
	@After
	public void releaseResources(){
		credentials= null;
		person= null;
	}
	@Test
	public void testSetLoginName() {
		StringBuilder loginName = new StringBuilder("aw3som3User!!!");
		credentials.setLoginName(loginName.toString());
		
		assertEquals(loginName.toString(), credentials.getLoginName());
	}
	
	@Test
	public void testSetPassword() {
		StringBuilder password= new StringBuilder("haRdP@55w0Rd");
		credentials.setPassword(password.toString());
		
		assertEquals(password.toString(), credentials.getPassword());
	}
	
	@Test
	public void testSetPerson() {
		credentials.setPerson(person);
		
		assertEquals(person, credentials.getPerson());
	}
	
	@Test
	public void testGetLoginName() {
		StringBuilder loginName = new StringBuilder("aw3som3User!!!");
		credentials.setLoginName(loginName.toString());
		
		assertEquals(loginName.toString(), credentials.getLoginName());
	}
	
	@Test
	public void testGetPassword() {
		StringBuilder password= new StringBuilder("haRdP@55w0Rd");
		credentials.setPassword(password.toString());
		
		assertEquals(password.toString(), credentials.getPassword());
	}
	
	@Test
	public void testGetPerson(){
		credentials.setPerson(person);
		
		assertEquals(person, credentials.getPerson());
	}

	@Test
	public void testGetId() {
		//TODO create testcase once Graph Database is up and running
	}
}
