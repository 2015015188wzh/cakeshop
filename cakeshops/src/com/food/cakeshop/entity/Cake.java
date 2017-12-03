package com.food.cakeshop.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cake")
public class Cake {
	private int cakeId;
	private String cakeName;
	private String cakePrice;
	private String cakeDescription;
	private String cakeImgUrl;
	private String cakeType;
	private Set<CakeType> typeSet = new HashSet<CakeType>();
	
	@OneToMany(targetEntity=CakeType.class,cascade=CascadeType.ALL)
	public Set<CakeType> getTypeSet() {
		return typeSet;
	}
	public void setTypeSet(Set<CakeType> typeSet) {
		this.typeSet = typeSet;
	}
	@Id
	public int getCakeId() {
		return cakeId;
	}
	public void setCakeId(int cakeId) {
		this.cakeId = cakeId;
	}
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	public String getCakePrice() {
		return cakePrice;
	}
	public void setCakePrice(String cakePrice) {
		this.cakePrice = cakePrice;
	}
	public String getCakeDescription() {
		return cakeDescription;
	}
	public void setCakeDescription(String cakeDescription) {
		this.cakeDescription = cakeDescription;
	}
	public String getCakeImgUrl() {
		return cakeImgUrl;
	}
	public void setCakeImgUrl(String cakeImgUrl) {
		this.cakeImgUrl = cakeImgUrl;
	}
	public String getCakeType() {
		return cakeType;
	}
	public void setCakeType(String cakeType) {
		this.cakeType = cakeType;
	}
	

}
