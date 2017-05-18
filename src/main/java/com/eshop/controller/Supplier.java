package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.SupDao;
import com.eshop.model.SupplierDetails;

@Controller
public class Supplier  {
	@Autowired
	SupDao sd;
	
	@RequestMapping(value="/supplier", method=RequestMethod.GET)
	public ModelAndView adm()
	{	
	SupplierDetails s=new SupplierDetails();
	ModelAndView mv=new ModelAndView("sup","SupplierDetails", s);
	return mv;
	}
	
	@RequestMapping(value="/sup", method=RequestMethod.POST)
	public ModelAndView adm1(@ModelAttribute("SupplierDetails")SupplierDetails s)
	{	
	//UserDetails u=new UserDetails();
	sd.insertSupp(s);	
	ModelAndView mv=new ModelAndView("sup1","SupplierDetails", s);
	return mv;
	}

}
