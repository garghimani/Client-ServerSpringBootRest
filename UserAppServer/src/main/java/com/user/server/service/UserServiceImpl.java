package com.user.server.service;

import org.springframework.stereotype.Service;

import com.user.db.repository.UserDAO;
import com.user.db.repository.UserDAOImpl;
import com.user.db.vo.User;

@Service
public class UserServiceImpl implements UserService {

	UserDAO userDAO = new UserDAOImpl();

	public void addUser(User user) {
		System.out.println("addUser() Service: Start");
		userDAO.addUser(user);
		System.out.println("addUser() Service: End");
	}

	public User getuser(int id) {
		System.out.println("getuser() Service: Start");
		User user = new User();
		user = (User) userDAO.getUser(id);
		System.out.println("getUser() Service: id" + user.getId());
		System.out.println("getuser() Service: End");
		return user;
	}

	public void updateUser(User user) {
		System.out.println("updateUser() Service: Start");
		userDAO.updateUser(user);
		System.out.println("updateUser() Service: End");
	}

	public void deleteUser(int id) {
		System.out.println("deleteUser() Service: Start");
		userDAO.deleteUser(id);
		System.out.println("deleteUser() Service: End");

	}

}
