package com.food.cakeshop.dao;

import java.util.List;

import com.food.cakeshop.entity.Pager;
import com.food.cakeshop.entity.User;



public interface UserDao {
	public Boolean add(User user);
	public int updateUser(User user);
	public Pager<User> find();
	public List<User> selectAll();
	public List<String> selectAllName();
	public User selectById(int id);
	public void deleteUser(int id);
	

}
