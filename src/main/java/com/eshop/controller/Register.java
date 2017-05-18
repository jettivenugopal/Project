package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.UserDetails;

@Controller
public class Register {
	
	@Autowired
	RegDao rd;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String ind()
	{	

	return "index1";
	}
	

	@RequestMapping(value="/reg", method=RequestMethod.GET)
	public ModelAndView reg1()
	{	
	UserDetails u=new UserDetails();
	ModelAndView mv=new ModelAndView("register","UserDetails", u);
	return mv;
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView reg2(@ModelAttribute("UserDetails")UserDetails u)
	{	
	//UserDetails u=new UserDetails();
	rd.insertuser(u);	
	ModelAndView mv=new ModelAndView("register1","UserDetails", u);
	return mv;
	}

	
}
