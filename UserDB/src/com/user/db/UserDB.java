package com.user.db;

import com.user.db.repository.UserDAO;
import com.user.db.repository.UserDAOImpl;
import com.user.db.vo.User;

public class UserDB {

	public UserDB() {
		super();
	}

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAOImpl();
		User user = new User();

		userDAO.addUser(user);
		System.out.println("addUser() : "+userDAO.getUser(user.getId()));
		userDAO.getUser(user.getId());
		System.out.println("getUser() : "+userDAO.getUser(user.getId()));
		userDAO.updateUser(user);
		System.out.println("updateUser() : "+userDAO.getUser(user.getId()));
		userDAO.deleteUser(user.getId());
		System.out.println("deleteUser() : "+userDAO.getUser(user.getId()));
	}

}
