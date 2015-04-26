package com.donpon.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/coupon")
public class CouponController 
{
	@RequestMapping(method=RequestMethod.GET)
	public String couponWelcome(ModelMap model)
	{
		model.addAttribute("message", "Thank you for stopping at DonPon ");
		return "welcome";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String getCoupon(ModelMap model)
	{
		model.addAttribute("message", "Hello World");
		return "coupon";
	}
	
	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(CouponController.class, args);
	    }
}
