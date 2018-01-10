package com.cnss.demo.service;

import com.cnss.demo.domain.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
