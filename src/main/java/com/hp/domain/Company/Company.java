package com.hp.domain.Company;

import java.util.List;

import com.hp.domain.Coupon.Coupon;

public interface Company 
{
	public void setName(String name);
	public void setAddress(String address);
	public void setCity(String city);
	public void setStateOrProvince(String stateOrProvince);
	public void setCountry(String country);
	
	public void createCoupon(Coupon coupon);
	public void retrieveCoupon(Coupon coupon); 
	public void updateCoupon(Coupon coupon);
	public void deleteCoupon(Coupon coupon);
	public void retrieveCoupons(List<Coupon> coupons);
	
	public String getName();
	public String getAddress();
	public String getCity();
	public String getStateOrProvince();
	public String getCountry();
	
}
