package com.hqlquery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Learner")
public class Learner{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int l_id;
	private String l_name;
	private String l_city;
	private String l_phonenum;
	private int l_age;
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getL_city() {
		return l_city;
	}
	public void setL_city(String l_city) {
		this.l_city = l_city;
	}
	public String getL_phonenum() {
		return l_phonenum;
	}
	public void setL_phonenum(String l_phonenum) {
		this.l_phonenum = l_phonenum;
	}
	public int getL_age() {
		return l_age;
	}
	public void setL_age(int l_age) {
		this.l_age = l_age;
	}
	public Learner(String l_name, String l_city, String l_phonenum, int l_age) {
		super();
		this.l_name = l_name;
		this.l_city = l_city;
		this.l_phonenum = l_phonenum;
		this.l_age = l_age;
	}
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}