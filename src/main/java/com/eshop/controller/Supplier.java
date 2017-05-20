package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.SupDao;
import com.eshop.model.CategoryDetails;
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
	    List l=sd.prodsup();
	    mv.addObject("supData",l);
	    mv.addObject("bname","AddCategory");
	    return mv;
	}
	
	@RequestMapping(value="/sup", method=RequestMethod.POST)
	public ModelAndView adm1(@ModelAttribute("SupplierDetails")SupplierDetails s)
	{
		
		sd.insertuser(s);
		SupplierDetails s1=new SupplierDetails();	
	    ModelAndView mv=new ModelAndView("sup","SupplierDetails", s1);
	    List l=sd.prodsup();
	    mv.addObject("supData",l);
	    mv.addObject("bname","AddCategory");
	    return mv;
	}
	
	@RequestMapping("/deletesup")
	public ModelAndView deleteProduct(@RequestParam("supid")int sid)
	{
		sd.Deletesupplier(sid);
		SupplierDetails s2=new SupplierDetails();
	    ModelAndView mv=new ModelAndView("sup","SupplierDetails",s2);
	    List l1=sd.prodsup();
	    mv.addObject("supData",l1);
	    mv.addObject("bname","AddCategory");
		System.out.println("delete Successfully");
		return mv;
    }
	
	@RequestMapping(value="/updatesup", method=RequestMethod.GET)
	ModelAndView Editcategory(@RequestParam("supid")int id)
	{		
	   SupplierDetails s=sd.getsupplier(id);
	  // CategoryDetails c=new CategoryDetails();
	   ModelAndView mv=new ModelAndView("sup","SupplierDetails", s);
	   List l=sd.prodsup();	
	   mv.addObject("supData",l);
	   mv.addObject("bname","UpdateCategory");
	   return mv;
	}
}
