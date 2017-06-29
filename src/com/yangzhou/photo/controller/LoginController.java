package com.yangzhou.photo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "123456";
	}
	
	@RequestMapping("/login")
	public ModelAndView loginValidate(){
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
}
