package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CatDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;

@Controller
public class Category {
	@Autowired
	CatDao cd;
	
	@RequestMapping(value="/category", method=RequestMethod.GET)
	public ModelAndView adm()
	{		
	  
	   CategoryDetails c=new CategoryDetails();
	   ModelAndView mv=new ModelAndView("cat","CategoryDetails", c);
	   List l=cd.prodcat();	
	   mv.addObject("catData",l);
	   mv.addObject("bname","AddCategory");
	   return mv;
	}
	
	@RequestMapping(value="/cat", method=RequestMethod.POST)
	public ModelAndView adm1(@ModelAttribute("CategoryDetails")CategoryDetails c)
	{
	   cd.insertuser(c);
	   CategoryDetails c1=new CategoryDetails();
	   ModelAndView mv=new ModelAndView("cat","CategoryDetails", c1);
	   List l=cd.prodcat();
	   mv.addObject("catData",l);
	   mv.addObject("bname","AddCategory");
	   return mv;
	}
	
	@RequestMapping("/deletecat")
	public ModelAndView deleteCategory(@RequestParam("catid")int cid)
	{
		
		cd.Deletecategory(cid);
		CategoryDetails c2=new CategoryDetails();
	    ModelAndView mv=new ModelAndView("cat","CategoryDetails",c2);
	    List l1=cd.prodcat();
	    mv.addObject("catData",l1);
	    mv.addObject("bname","AddCategory");
		System.out.println("delete Successfully");
		return mv;
    }

	@RequestMapping(value="/updatecat", method=RequestMethod.GET)
	ModelAndView Editcategory(@RequestParam("catid")int id)
	{		
	   CategoryDetails c=cd.getcategory(id);
	  // CategoryDetails c=new CategoryDetails();
	   ModelAndView mv=new ModelAndView("cat","CategoryDetails", c);
	   List l=cd.prodcat();	
	   mv.addObject("catData",l);
	   mv.addObject("bname","UpdateCategory");
	   return mv;
	}
}
 