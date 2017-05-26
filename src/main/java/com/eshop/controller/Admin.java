package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.AdminDao;
import com.eshop.model.AdminDetails;
import com.eshop.model.UserDetails;

@Controller
public class Admin {
	@Autowired
	AdminDao ad;
	
	@RequestMapping(value="/admn", method=RequestMethod.GET)
	public ModelAndView adm()
	{	
	    AdminDetails a=new AdminDetails();
	    ModelAndView mv=new ModelAndView("admin","AdminDetails", a);
	    return mv;
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public ModelAndView adm1(@ModelAttribute("AdminDetails")AdminDetails a)
	{	
	    //UserDetails u=new UserDetails();
	    ad.insertuser(a);	
	    ModelAndView mv=new ModelAndView("admin","AdminDetails", a);
	    return mv;
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public ModelAndView about()
	{		
	    ModelAndView mv=new ModelAndView("about");
	    return mv;
	}

	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public ModelAndView contact()
	{		
	    ModelAndView mv=new ModelAndView("contact");
	    return mv;
	}
}
