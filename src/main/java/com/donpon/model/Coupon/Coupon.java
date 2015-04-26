package com.donpon.model.Coupon;

import java.util.Calendar;

public interface Coupon
{
	public void setCouponNumber(String couponNumber);
	public void setCouponStartDate(Calendar couponStartDate);
	public void setCouponExpirationDate(Calendar couponExpirationDate);
	public String getCouponNumber();
	public Calendar getCouponExpirationDate();
	public Calendar getCouponStartDate();
	public Long getId();
}
