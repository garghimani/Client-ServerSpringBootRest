package com.user.db.repository;

import com.user.db.vo.User;

public interface UserDAO {

	void addUser(User user);

	User getUser(int id);

	void updateUser(User user);

	void deleteUser(int id);

}