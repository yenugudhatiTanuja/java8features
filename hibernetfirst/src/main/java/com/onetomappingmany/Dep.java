package com.onetomappingmany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.onetomanymapping.Employee;


@Entity
@Table(name = "dep")
public class Dep {
	@Id
	private int d_id;
	private String d_name;
	@OneToMany(mappedBy = "ob")
    private List<Emp> emp;
	
	public Dep(int i, String string) {
		super();
		// TODO Auto-generated constructor stub
		this.d_id=d_id;
		this.d_name=d_name;
	}

	public Dep(int d_id, String d_name, List<Emp> emp) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.emp = emp;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

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

}
