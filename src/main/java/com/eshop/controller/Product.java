package com.eshop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CatDao;
import com.eshop.dao.ProductDao;
import com.eshop.dao.SupDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;
import com.eshop.model.SupplierDetails;
import com.eshop.model.UserDetails;

@Controller
public class Product {
	@Autowired
	CatDao cd;
	@Autowired
	SupDao sd;
	@Autowired
	ProductDao pd;
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public ModelAndView prodcat()
	{
		ProductDetails p=new ProductDetails();
		List l=cd.prodcat();
		/*Iterator i=l.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			CategoryDetails c2=(CategoryDetails)o;
			System.out.println(c2.getCategoryDesignation());	
		}*/
		List l1=sd.prodsup();
		/*Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			Object o1=i1.next();
			SupplierDetails c3=(SupplierDetails)o1;
			System.out.println(c3.getSupplierDescription());	
		}*/
		List l2=pd.product();
		ModelAndView mv=new ModelAndView("pro","ProductDetails",p);
		mv.addObject("catData",l);
		mv.addObject("supData",l1);
		mv.addObject("prodData",l2);
		return mv;
	}
	@RequestMapping(value="/pro", method=RequestMethod.POST)
	public ModelAndView product(@ModelAttribute("ProductDetails")ProductDetails p)
	{
		List l=cd.prodcat();
		List l1=sd.prodsup();
		List l2=pd.product();
		
		pd.insertpro(p);
		ProductDetails p1=new ProductDetails();
	    ModelAndView mv=new ModelAndView("pro","ProductDetails",p1);
	    
	    mv.addObject("catData",l);
		mv.addObject("supData",l1);
		mv.addObject("prodData",l2);
		
		
		String path="D:\\Project\\ekart\\src\\main\\webapp\\resources\\images\\";
		path=path+String.valueOf(p.getProductId()+".jpg");
		MultipartFile filedata=p.getpImage();
		File f=new File(path);
		try {
			FileOutputStream fos=new FileOutputStream(f);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			byte[] b=filedata.getBytes();
			bos.write(b);
			bos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return mv;
		}
	
	
	@RequestMapping("/deleteprod")
	public ModelAndView deleteProduct(@RequestParam("delpid")int pid)
	{
		
		
		List l=cd.prodcat();
		List l1=sd.prodsup();
		List l2=pd.product();
		
		pd.Deleteproduct(pid);
		ProductDetails p1=new ProductDetails();
	    ModelAndView mv=new ModelAndView("pro","ProductDetails",p1);
	    
	    mv.addObject("catData",l);
		mv.addObject("supData",l1);
		mv.addObject("prodData",l2);
		
		System.out.println("delete Successfully");
		return mv;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}