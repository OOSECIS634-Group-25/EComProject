package com.ecom.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.ecom.Daoimpl.ProductDaoImpl;
//import com.ecom.model.Products;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestParam;

//import com.ecom.Daoimpl.CategoryDaoImpl;

//import com.ecom.Daoimpl.SupplierDaoImpl;



	@Controller
	public class UserProductController {
		
		//@Autowired
		//SupplierDaoImpl supplierDaoImpl;
		
		@Autowired
		//CategoryDaoImpl categoryDaoImpl;
		
		//@Autowired
		//ProductDaoImpl productDaoImpl;
		public UserProductController() {
			
		}
		@RequestMapping("/showproduct")
		public ModelAndView goToShowProduct()
		{
			ModelAndView modelandview=new ModelAndView("usershowproducts");
			   //List<Products> listProduct = productDaoImpl.retrieveAllProduct();
			 
			  //modelandview.addObject("prolist", listProduct);
			return modelandview;
		}
		@RequestMapping("/vd")
		public ModelAndView ViewProduct(@RequestParam("proid")int productid)
		   {
			   System.out.println("Product Id="+productid);
			  
			  // Products product=productDaoImpl.getProduct(productid);
		
		 
			   ModelAndView modelandview=new ModelAndView("productdetails");
			   
			 // modelandview.addObject("pr",product);
			
			 
			   return modelandview;
		   }
	}