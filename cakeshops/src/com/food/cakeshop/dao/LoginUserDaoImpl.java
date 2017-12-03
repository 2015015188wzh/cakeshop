package com.food.cakeshop.dao;

import javax.annotation.Resource;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.food.cakeshop.entity.UserLogin;




@Repository
public class LoginUserDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	
	public UserLogin findById(String name){
		return this.sessionFactory.getCurrentSession().get(UserLogin.class, name);
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
