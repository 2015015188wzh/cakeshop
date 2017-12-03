package com.food.cakeshop.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="userlogin")
public class UserLogin {
	private String userName;
	private String passWord;
	private User userInfo;
	private CakeCart cakeCart;
	private Set<Orders> orderSet = new HashSet<Orders>();
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="userName")
	public CakeCart getCakeCart() {
		return cakeCart;
	}
	public void setCakeCart(CakeCart cakeCart) {
		this.cakeCart = cakeCart;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="userName")
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
	@SuppressWarnings("unchecked")
	@OneToMany(targetEntity=Orders.class,cascade=CascadeType.ALL)
	public Set<Orders> getOrderSet() {
		return orderSet;
	}
	public void setOrderSet(Set<Orders> orderSet) {
		this.orderSet = orderSet;
	}
	@Id
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	

}
