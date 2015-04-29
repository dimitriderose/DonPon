package com.donpon.model.Order;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.donpon.model.Coupon.Coupon;
import com.donpon.model.Coupon.CouponImpl;
import com.donpon.model.Person.Person;
import com.donpon.model.Person.PersonImpl;

/**
* Testing Order class to make sure the Order DAO is working as expected
* 
* @author Dimitri De Rose
*
*/
//TODO Need to update this class to retrieve information from database
public class OrderImplTest {

	private Order order;
	private Coupon coupon;
	private Person person;

	@Before
	public void setUp() {
		order= new OrderImpl();
		
		coupon= new CouponImpl();
		coupon.setCouponStartDate(this.createCalendarObject(2015, 3, 12));
		coupon.setCouponExpirationDate(this.createCalendarObject(2015, 4, 15));
		coupon.setCouponNumber("010");
		
		person= new PersonImpl();
		person.setFirstName("Sally");
		person.setLastName("Peters");
		person.setEmailAddress("sally.peters@amazing.com");
	}
	
	@After
	public void releaseResources(){
		order= null;
		coupon= null;
		person= null;
	}
	
	@Test
	public void testSetOrderNumber(){
		StringBuilder orderNumber= new StringBuilder("2102");
		order.setOrderNumber(orderNumber.toString());
		
		assertEquals(orderNumber.toString(),order.getOrderNumber());
	}
	
	@Test
	public void testSetConfirmationCode(){
		StringBuilder confirmationCode= new StringBuilder("1DC23");
		order.setConfirmationCode(confirmationCode.toString());
		
		assertEquals(confirmationCode.toString(), order.getConfirmationCode());
	}
	
	@Test
	public void testSetCoupon(){
		order.setCoupon(coupon);
		
		assertEquals(coupon, order.getCoupon());
	}
	
	@Test
	public void testSetPerson(){
		order.setPerson(person);
		
		assertEquals(person, order.getPerson());
	}
	
	@Test
	public void testGetOrderNumber(){
		StringBuilder orderNumber= new StringBuilder("2102");
		order.setOrderNumber(orderNumber.toString());
		
		assertEquals(orderNumber.toString(),order.getOrderNumber());
	}
	
	@Test
	public void testGetConfirmationCode(){
		StringBuilder confirmationCode= new StringBuilder("1DC23");
		order.setConfirmationCode(confirmationCode.toString());
		
		assertEquals(confirmationCode.toString(), order.getConfirmationCode());
	}
	
	@Test
	public void testGetCoupon(){
		order.setCoupon(coupon);
		
		assertEquals(coupon, order.getCoupon());
	}
	
	@Test
	public void testGetPerson(){
		order.setPerson(person);
		
		assertEquals(person, order.getPerson());
	}
	
	@Test
	public void testGetId() {
		//TODO create testcase once Graph Database is up and running
	}
	
	private Calendar createCalendarObject(int year, int month, int dayOfMonth){
		Calendar calendar= new GregorianCalendar(year, month, dayOfMonth);
		return calendar;
	}
 

}
