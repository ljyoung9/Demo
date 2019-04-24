package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	
	  @RequestMapping("/") 
	  public String Index() { 
		  return "main"; 
	   }
	 
//	  @RequestMapping("/main") 
//	  public @ResponseBody String index() { 
//		  return "j"; 
//	   }

}
