package com.sole.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
@Scope("prototype")  
public class MyController {
	 //hello world  
    @RequestMapping(value="/hello")  
    public String hello(){  
        System.out.println("spring mvc hello");  
        return "index";  
    } 
    
    
    @RequestMapping(value="/ok")  
    public String ok123(){  
        System.out.println("spring mvc hello");  
        return "index";  
    } 
}
