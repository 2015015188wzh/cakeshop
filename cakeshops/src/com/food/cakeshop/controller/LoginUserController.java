package com.food.cakeshop.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.food.cakeshop.entity.UserLogin;
import com.food.cakeshop.service.LoginUserServiceImpl;


@Controller
@RequestMapping("/userlogin")
public class LoginUserController {
	
	@Resource
	private LoginUserServiceImpl loginUserServiceImpl;

	@RequestMapping("/login")
	public String login(@RequestParam("userName") String name,
			@RequestParam("passWord") String pwd,
			HttpSession session,Model model){
		UserLogin lu=this.loginUserServiceImpl.login(name, pwd);
		if(lu!=null){
			session.setAttribute("lu", lu);
			return "main";
		}else{
			model.addAttribute("erroinfo", "您的账号密码不正确！");
			return "index";
		}
	}
}