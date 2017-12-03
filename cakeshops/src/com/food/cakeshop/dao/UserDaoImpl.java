package com.food.cakeshop.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.food.cakeshop.entity.User;
@Component
public abstract class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		return list;
	}
	
	@Override
	public List<String> selectAllName() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select name from User");
		List<String> list = query.list();
		return list;
	}
	
	@Override
	public Boolean add(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = (Transaction) session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		return true;
	}


	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User where id = ?");
		query.setParameter(0, id);
		User user = (User)query.uniqueResult();
		return user;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//System.out.println(user.getId()+"1");
		Query query = session.createQuery("update User set userName=?,realName=?,userPassword=?,userTelephone=?,userAddress=?,userEmail=? where id=?");
		query.setParameter(0, user.getUserName());
		query.setParameter(1, user.getRealName());
		query.setParameter(2, user.getUserPassword());
		query.setParameter(3, user.getUserTelephone());
		query.setParameter(4, user.getUserAdderss());
		query.setParameter(5, user.getUserEmail());
		query.setParameter(6, user.getId());
		int i = query.executeUpdate();
		tx.commit();
		//System.out.println(user.getUserName()+"2");
		session.close();
		return i;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		User user = session.get(User.class,new Integer(id));
		session.delete(user);
		tx.commit();
		session.close();
	}
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
