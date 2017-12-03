package com.food.cakeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.food.cakeshop.entity.User;
import com.food.cakeshop.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> selectAll() {
		List<User> list = userDao.selectAll();
		return list;
	}
	
	public List<String> selectAllName() {
		List<String> list = userDao.selectAllName();
		return list;
	}
	
	public Boolean add(User user) {
		Boolean b = userDao.add(user);
		return b;
	}
	
	public User selectById(int id) {
		User user = userDao.selectById(id);
		return user;
	}
	
	public int updateUser(User user) {
		int i = userDao.updateUser(user);
		return i;
	}
	
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}
	 
}
