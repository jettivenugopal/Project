package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CatDao;
import com.eshop.model.CategoryDetails;



@Controller
public class Category {
	@Autowired
	CatDao cd;
	
	@RequestMapping(value="/catg", method=RequestMethod.GET)
	public ModelAndView adm()
	{	
	CategoryDetails c=new CategoryDetails();
	ModelAndView mv=new ModelAndView("cat","CategoryDetails", c);
	return mv;
	}
	
	@RequestMapping(value="/cat", method=RequestMethod.POST)
	public ModelAndView adm1(@ModelAttribute("CategoryDetails")CategoryDetails c)
	{	
	//UserDetails u=new UserDetails();
	cd.insertuser(c);	
	ModelAndView mv=new ModelAndView("cat1","CategoryDetails", c);
	return mv;
	}	
}
 