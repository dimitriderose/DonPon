package com.donpon.model.Coupon;

import static org.junit.Assert.*; 

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
* Testing Coupon class to make sure the Coupon DAO is working as expected
* 
* @author Dimitri De Rose
*
*/
//TODO Need to update this class to retrieve information from database
public class CouponImplTest {
	
	private Coupon coupon;

	@Before
	public void setUp() {
		coupon= new CouponImpl();
	}
	
	@After
	public void releaseResources(){
		coupon= null;
	}

	@Test
	public void testSetCouponStartDate() {
		Calendar couponStartDate= this.createCalendarObject(2015, 3, 29);
		coupon.setCouponStartDate(couponStartDate);
		
		assertEquals(couponStartDate, coupon.getCouponStartDate());
	}
	
	@Test
	public void testSetCouponExpirationDate() {
		Calendar couponExpirationDate= this.createCalendarObject(2015, 3, 29);
		coupon.setCouponExpirationDate(couponExpirationDate);
		
		assertEquals(couponExpirationDate, coupon.getCouponExpirationDate());
	}
	
	@Test
	public void testSetCouponNumber() {
		StringBuilder couponNumber= new StringBuilder("001");
		coupon.setCouponNumber(couponNumber.toString());
		
		assertEquals(couponNumber.toString(), coupon.getCouponNumber());
	}

	@Test
	public void testGetCouponStartDate() {
		Calendar couponStartDate= this.createCalendarObject(2015, 3, 29);
		coupon.setCouponStartDate(couponStartDate);
		
		assertEquals(couponStartDate, coupon.getCouponStartDate());
	}

	
	@Test
	public void testGetCouponExpirationDate() {
		Calendar couponExpirationDate= this.createCalendarObject(2015, 3, 29);
		coupon.setCouponExpirationDate(couponExpirationDate);
		
		assertEquals(couponExpirationDate, coupon.getCouponExpirationDate());
	}

	@Test
	public void testGetCouponNumber() {
		StringBuilder couponNumber= new StringBuilder("001");
		coupon.setCouponNumber(couponNumber.toString());
		assertEquals(couponNumber.toString(), coupon.getCouponNumber());
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
