package com.example.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.web.model.ProductModel;
import com.example.web.service.ProductService;

@Controller
public class ProductController {
  
	  @Autowired
	  ProductService productService;
		
	  @RequestMapping("/") 
	  public String Index(Model model) { 
		  List<ProductModel> productList = productService.getProduct();
		  
		  model.addAttribute("productList", productList);
		  return "main"; 
	  }
	  @RequestMapping("/list") // URL 주소
	  public String list(Model model) {
		  List<ProductModel> productList = productService.getProduct();
		  
		  model.addAttribute("productList", productList);
		  return "list"; // JSP 파일명		  
	  }
}
