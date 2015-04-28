package com.donpon.model.Company;

import java.util.List; 

import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import com.donpon.model.Coupon.Coupon;

@NodeEntity
public class CompanyImpl implements Company {
	@GraphId
	private Long id;
	
	@Indexed(unique=true)
	private String name;
	private String address;
	private String city;
	private String stateOrProvince;
	private String country;
	
	@Fetch
	@RelatedTo(type="Coupon")
	private Coupon coupon;

	@Override
	public void createCoupon(Coupon coupon) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retrieveCoupon(Coupon coupon) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCoupon(Coupon coupon) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCoupon(Coupon coupon) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retrieveCoupons(List<Coupon> coupons) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void setName(String name) {
		this.name= name;
	}

	@Override
	public void setAddress(String address) {
		this.address= address;
	}

	@Override
	public void setCity(String city) {
		this.city= city;
	}

	@Override
	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince= stateOrProvince;
	}

	@Override
	public void setCountry(String country) {
		this.country= country;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getAddress() {
		return this.address;
	}

	@Override
	public String getCity() {
		return this.city;
	}

	@Override
	public String getStateOrProvince() {
		return this.stateOrProvince;
	}

	@Override
	public String getCountry() {
		return this.country;
	}
	
	@Override
	public Long getId(){
		return this.id;
	}

}
