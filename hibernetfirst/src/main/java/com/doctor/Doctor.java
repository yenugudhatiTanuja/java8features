package com.doctor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@NamedQueries({ @NamedQuery(name = "findDoctorId", query = "from Doctor dt where dt.d_id=:Id1") })
@Entity
@Table(name ="doctor")
//@SequenceGenerator(name = "seq",initialValue = 1000)

public class Doctor {
	//@Id
	//@SequenceGenerator(name = "seq",initialValue = 1000)
	//@GeneratedValue(generator="seq",strategy = GenerationType.AUTO) 
	//@SequenceGenerator(name = "seq",initialValue = 1000)
	@Id
    private int d_id;
    private String d_name;
    //private String d_city;
    
	public int getD_id() {
		
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public Doctor(String d_name) {
		super();
		this.d_name = d_name;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
