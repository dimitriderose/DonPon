package com.donpon.model.Company;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Testing Company class to make sure the Company DAO is working as expected
 * 
 * @author Dimitri De Rose
 *
 */
//TODO Need to update this class to retrieve information from database
public class CompanyImplTest {
	
	private Company company;
	
	@Before
	public void setUp() {
		company= new CompanyImpl();
	}
	
	@After
	public void releaseResources(){
		company= null;
	}

	@Test
	public void testSetName(){
		StringBuilder name= new StringBuilder("Company Name");
		company.setName(name.toString());
		
		assertEquals(name.toString(),  company.getName());
	}
	
	@Test
	public void testSetAddress(){
		StringBuilder address= new StringBuilder("123 Main Street");
		company.setAddress(address.toString());
		
		assertEquals(address.toString(),  company.getAddress());
	}
	
	@Test
	public void testSetCity(){
		StringBuilder city= new StringBuilder("New York");
		company.setCity(city.toString());
		
		assertEquals(city.toString(),  company.getCity());
	}
	
	@Test
	public void testSetStateOrProvince(){
		StringBuilder stateOrProvince= new StringBuilder("NY");
		company.setStateOrProvince(stateOrProvince.toString());
		
		assertEquals(stateOrProvince.toString(),  company.getStateOrProvince());
	}
	
	@Test
	public void testSetCountry(){
		StringBuilder country= new StringBuilder("United States");
		company.setCountry(country.toString());
		
		assertEquals(country.toString(),  company.getCountry());
	}
	
	@Test
	public void testGetName(){
		StringBuilder name= new StringBuilder("Company Name");
		company.setName(name.toString());
		
		assertEquals(name.toString(),  company.getName());
	}
	
	@Test
	public void testGetAddress(){
		StringBuilder address= new StringBuilder("123 Main Street");
		company.setAddress(address.toString());
		
		assertEquals(address.toString(),  company.getAddress());
	}
	
	@Test
	public void  testGetCity(){
		StringBuilder city= new StringBuilder("New York");
		company.setCity(city.toString());
		
		assertEquals(city.toString(),  company.getCity());
	}
	
	@Test
	public void testGetStateOrProvince(){
		StringBuilder stateOrProvince= new StringBuilder("NY");
		company.setStateOrProvince(stateOrProvince.toString());
		
		assertEquals(stateOrProvince.toString(),  company.getStateOrProvince());
	}
	
	@Test
	public void testGetCountry(){
		StringBuilder country= new StringBuilder("United States");
		company.setCountry(country.toString());
		
		assertEquals(country.toString(),  company.getCountry());
	}
	
	@Test
	public void testGetId() {
		//TODO create testcase once Graph Database is up and running
	}
	
//Will Create CompanyService class to run this methods
// to send and retrieve data from 	database
	public void testCreateCoupon(){
		fail("Not yet implemented");
	}
	
	
	public void testRetrieveCoupon(){
		
	}
	
	
	public void testUpdateCoupon(){
		fail("Not yet implemented");
	}
	
	
	public void testDeleteCoupon(){
		fail("Not yet implemented");
	}
	
	public void testRetrieveCoupons(){
		fail("Not yet implemented");
	}
	
	
	
	
}
