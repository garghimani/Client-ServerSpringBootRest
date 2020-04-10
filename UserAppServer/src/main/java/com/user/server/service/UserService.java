package com.user.server.service;

import com.user.db.vo.User;

public interface UserService {

	void addUser(User user);

	User getuser(int id);

	void updateUser(User user);

	void deleteUser(int id);

}