package com.yangzhou.photo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangzhou.photo.mapper.UserMapper;
import com.yangzhou.photo.pojo.User;
import com.yangzhou.photo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean loginValidate(String username, String password) {
		User user = userMapper.selectUserByName(username);
		if(password.equals(user.getUserName())){
			return true;
		}else{
			return false;
		}
	}

}
