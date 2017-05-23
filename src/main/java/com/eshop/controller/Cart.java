package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CartDao;
import com.eshop.dao.CatDao;
import com.eshop.dao.ProductDao;
import com.eshop.dao.SupDao;
import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;

@Controller
public class Cart {
	@Autowired
	CartDao cde;
	@Autowired
	ProductDao pd;
	
	@RequestMapping(value="/addCart", method=RequestMethod.GET)
	public ModelAndView addcart(@RequestParam("cart")int productId)
	{
		ProductDetails p=pd.getproduct(productId);
		CartDetails c=new CartDetails();
		
		c.setCartUser("venu");
		c.setProId(p.getProductId());
		c.setProName(p.getProductname());
		c.setProPrice(p.getProductPrice());
		c.setTotalPrice(c.getTotalPrice()*1);
		cde.getcart(c);
		
		List l=cde.retrieveCart();
		
    ModelAndView mv= new ModelAndView("cart","CartData",l);
 
	return mv;
}
}
