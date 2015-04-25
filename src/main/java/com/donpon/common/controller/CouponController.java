package com.donpon.common.controller;

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
		model.addAttribute("message", "Thank you for stopping at HP");
		return "welcome";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String getCoupon(ModelMap model)
	{
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "coupon";
	}
}
