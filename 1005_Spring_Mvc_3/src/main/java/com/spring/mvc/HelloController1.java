package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 
{     
	 @RequestMapping("/request1")
     public String hello()
     {
    	 return "springCore.jsp";
     }
}
