package com.hp.domain.Order;

import com.hp.domain.Coupon.Coupon;
import com.hp.domain.Person.Person;

public interface Order 
{
	public void setOrderNumber(String orderNumber);
	public void setConfirmationCode(String confirmationCode);
	public void setCoupon(Coupon coupon);
	public void setPerson(Person person);
	
	public String getOrderNumber();
	public String getConfirmationCode();
	public Coupon getCoupon();
	public Person getPerson();
}
