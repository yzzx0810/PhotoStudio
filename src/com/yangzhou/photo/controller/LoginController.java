package com.yangzhou.photo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangzhou.photo.service.UserService;

@Controller
public class LoginController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "123456";
	}
	
	@RequestMapping(value="/login", method={RequestMethod.POST, RequestMethod.GET})
	public String loginValidate(String username, String password){
		boolean result = userService.loginValidate(username, password);
		if(result){
			return "welcome";
		}
		return "login";
	}
}
