package com.donpon.model.Coupon;

import java.util.Calendar;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.stereotype.Component;

@NodeEntity
public class CouponImpl implements Coupon {

	@GraphId
	private Long id;
	
	
	private String couponNumber;
	
	private Calendar couponStartDate;
	
	private Calendar couponExpirationDate;
	
	
	@Override
	public void setCouponNumber(String couponNumber) {
	this.couponNumber= couponNumber;

	}

	@Override
	public String getCouponNumber() {
		return this.couponNumber;
	}
	
	@Override
	public Calendar getCouponStartDate() {
		return couponStartDate;
	}

	@Override
	public void setCouponStartDate(Calendar couponStartDate) {
		this.couponStartDate = couponStartDate;
	}

	@Override
	public Calendar getCouponExpirationDate() {
		return couponExpirationDate;
	}

	@Override
	public void setCouponExpirationDate(Calendar couponExpirationDate) {
		this.couponExpirationDate = couponExpirationDate;
	}

	@Override
	public Long getId(){
		return this.id;
	}

}
