package com.hibernet.hibernetfirst;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.persistence.NamedQuery;
@NamedQueries({ @NamedQuery(name = "findStudentId", query = "from Student sdt where sdt.id=:Id1") })
import javax.persistence.Table;
@Entity
@Table(name = "Student")
public class Student {
	@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String name;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString()
	{
		return "student id  "+id+" student name " +name+" Student city "+city;
	}
}
