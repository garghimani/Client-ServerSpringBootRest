package com.user.db.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.user.db.util.UserUtil;
import com.user.db.vo.User;

public class UserDAOImpl implements UserDAO {

	public UserDAOImpl() {
		super();
	}

	User user = null;

	@Override
	public void addUser(User user) {
		System.out.println("addUser() Repository: Start");
		Session session = UserUtil.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		System.out.println(user.getFirstName());
		tx.begin();
		session.save(user);
		tx.commit();
		session.close();
		System.out.println("addUser() Repository: End");

	}

	@Override
	public User getUser(int id) {
		System.out.println("getUser() Repository: Start");
		Session session = UserUtil.getSessionFactory().openSession();
		user = (User) session.get(User.class, id);
		session.close();
		System.out.println("getUser() Repository: End");
		return user;
	}

	@Override
	public void updateUser(User user) {
		System.out.println("updateUser() : Start");
		Session session = UserUtil.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		session.update(user);
		tx.commit();
		session.close();
		System.out.println("updateUser() : End");
	}

	@Override
	public void deleteUser(int id) {
		System.out.println("deleteUser() : Start");
		Session session = UserUtil.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		user = (User) session.get(User.class, id);
		session.delete(user);
		tx.commit();
		session.close();
		System.out.println("deleteUser() : End");
	}

}
