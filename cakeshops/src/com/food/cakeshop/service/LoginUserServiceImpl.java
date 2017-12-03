package com.food.cakeshop.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.food.cakeshop.dao.LoginUserDaoImpl;
import com.food.cakeshop.entity.UserLogin;


@Service("loginUserServiceImpl")
@Transactional(readOnly=true)
public class LoginUserServiceImpl {
	@Resource
	private static LoginUserDaoImpl loginUserDaoImpl;
	
	public UserLogin login(String name,String pwd){
		UserLogin lu=this.loginUserDaoImpl.findById(name);
		if(lu!=null){
			if(lu.getPassWord().equals(pwd)){
				return lu;
			}else{
				return null;
			}
		}else{
			return null;
		}
	}


	public LoginUserDaoImpl getLoginUserDaoImpl() {
		return loginUserDaoImpl;
	}

	public void setLoginUserDaoImpl(LoginUserDaoImpl loginUserDaoImpl) {
		this.loginUserDaoImpl = loginUserDaoImpl;
	}
	
	

}
