package com.asterisc.in.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class Mycontroller 
{
	@RequestMapping("/")
	String myfun()
	{
		return "page.jsp";
	}

}
