package com.user.db.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.user.db.vo.User;

public class UserUtil {

	private static SessionFactory sessionFactory;

	private static Configuration config;

	// Create the initial SessionFactory from the default configuration files
	static {
		try {
			System.out.println("Inside UserUtil");
			config = new Configuration();
			config.configure("UserHibernate.cfg.xml").addAnnotatedClass(User.class);
			sessionFactory = config.buildSessionFactory();

			/*
			 * ServiceRegistry serviceReg = new
			 * ServiceRegistryBuilder().applySettings(config.getProperties())
			 * .buildServiceRegistry();
			 * 
			 * sessionFactory = config.buildSessionFactory(serviceReg);
			 */

		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
