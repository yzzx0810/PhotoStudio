package com.yangzhou.photo.mapper;

import com.yangzhou.photo.pojo.User;

public interface UserMapper {
	public User selectUserByName(String userName);
}
