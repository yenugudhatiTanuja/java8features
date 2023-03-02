package com.onetomappingmany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.onetomanymapping.Department;
//import com.onetomanymapping.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	Dep d=new Dep(101,"cse");
       // d.setD_id(102);
        //d.setD_name("Electrical science");
    	Emp e=new Emp(2,"tanuja","hyderabad","242428",d);
    	Emp e1=new Emp(3,"tanvi","pune","242426",d);

    	//e.setE_id(2);
    	//e.setE_name("vanaja");
    	//e.setE_address("hyderabad");
    	//e.setE_phonenumber("9685743622");
    
    	
    	/*Employee e1=new Employee();
    	e1.setE_id(3);
    	e1.setE_name("harini");
    	e1.setE_address("Banglore");
    	e1.setE_phonenumber("9685743642");*/
    	//List<Emp> li=new ArrayList<Emp>(); 
    	//li.add(e);
    	//li.add(e1);
    //	d.setEmp(li);
    	//.e.setDep(d);
    	ses.save(d);
    	ses.save(e);
    	System.out.println("Added");
    	tx.commit();
    	ses.close();
	}

}
