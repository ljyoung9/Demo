package com.example.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.web.model.ProductModel;
import com.example.web.service.ProductService;

@Controller
public class ProductController {
  
	  @Autowired
	  ProductService productService;

		
	  @RequestMapping("/") 
	  public ModelAndView Index(Model model) { 
		  ModelAndView mav = new ModelAndView();

		  List<ProductModel> productList = productService.getProduct();
		  mav.setViewName ("main");
		  mav.addObject("productList", productList);
		  mav.addObject("categoryList", GetCategory());
		  return mav;
	  }
	  
	  public List<ProductModel> GetCategory() { 
		  return productService.getCategory();
	  }
	  
	  @RequestMapping(value="/{category_id}",method=RequestMethod.GET)
	  public ModelAndView GetProductByCategory(@PathVariable("category_id") String category_id) throws Exception{
		 
		  ModelAndView mav = new ModelAndView();
		  List<ProductModel> productList = productService.getProductByCaterogy(category_id);
		  mav.setViewName ("main");
		  mav.addObject("productList", productList);
		  mav.addObject("categoryList", GetCategory());
		  
		  return mav;
	  
	  }
	  
	  @RequestMapping(value="/sortBy/{sortType}",method=RequestMethod.GET)
	  public ModelAndView GetProductByPrice(@PathVariable("sortType") String sortType) throws Exception{
		 
		  ModelAndView mav = new ModelAndView();
		  List<ProductModel> productList = productService.getSortByPrice(sortType);
		  mav.setViewName ("main");
		  mav.addObject("productList", productList);
		  mav.addObject("categoryList", GetCategory());
		  
		  return mav;
	  
	  }
	  
	  @RequestMapping(value="/priceUnder/{product_price}",method=RequestMethod.GET)
	  public ModelAndView GetProductByPriceUnder(@PathVariable("product_price") int  product_price) throws Exception{
		 
		  ModelAndView mav = new ModelAndView();
		  List<ProductModel> productList = productService.getProductByPriceUnder(product_price);
		  mav.setViewName ("main");
		  mav.addObject("productList", productList);
		  mav.addObject("categoryList", GetCategory());
		  
		  return mav;
	  
	  }


}
