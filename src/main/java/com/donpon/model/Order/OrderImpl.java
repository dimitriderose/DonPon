package com.donpon.model.Order;

import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import com.donpon.model.Coupon.Coupon;
import com.donpon.model.Person.Person;

@NodeEntity
public class OrderImpl implements Order {
	
	@GraphId
	private Long id;
	
	private String orderNumber;
	private String confirmationCode;
	
	@Fetch
	@RelatedTo(type="Coupon")
	private Coupon coupon;
	
	@Fetch
	@RelatedTo(type="Person")
	private Person person;
	

	@Override
	public void setOrderNumber(String orderNumber) {
		this.orderNumber= orderNumber;
	}

	@Override
	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode= confirmationCode;
	}

	@Override
	public void setCoupon(Coupon coupon) {
		this.coupon= coupon;
	}

	@Override
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String getOrderNumber() {
		return this.orderNumber;
	}

	@Override
	public String getConfirmationCode() {
		return this.confirmationCode;
	}

	@Override
	public Coupon getCoupon() {
		return this.coupon;
	}

	@Override
	public Person getPerson() {
		return this.person;
	}
	
	@Override
	public Long getId(){
		return this.id;
	}

}
