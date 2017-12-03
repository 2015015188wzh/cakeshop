package com.food.cakeshop.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.food.cakeshop.entity.User;
import com.food.cakeshop.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/userlist")
	public String selectAll(Model model) {
		List<User> list = userService.selectAll();
		model.addAttribute("userlist", list);
		return "user/user_list";
	}
	
	@RequestMapping("/username")
	public void selectAllName( Model model) {
		List<String> list = userService.selectAllName();
		model.addAttribute("username", list);
	}
	
	
	@RequestMapping("/preupdateuser")
	public String selectById(Model model,int id) {
		User user = userService.selectById(id);
		model.addAttribute("user", user);
		model.addAttribute("sexs", new String[] {"ÄÐ","Å®"} );
		return "user/user_update";
	}
	
	@RequestMapping("/updateuser")
	public String updateUser(User user) {
		int i = userService.updateUser(user);
		if(i >  0) {
			return "succeed";
		}
		return "error";
	}
	
	@RequestMapping("/deleteuser")
	public String deleteUser(int id) {
		userService.deleteUser(id);
		return "succeed";
	}
	
	public UserService getUserService() {
		return userService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
