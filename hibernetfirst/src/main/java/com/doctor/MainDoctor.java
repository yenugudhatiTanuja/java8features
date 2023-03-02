package com.doctor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	/*Query q1=ses.createQuery(" delete doctor where d_id=:d_id"); 
    	q1.setParameter("d_id", 7);
    	int rs=q1.executeUpdate();
    	System.out.println("success--->"+rs);*/
    	Doctor d=new Doctor("shalini");
    	ses.save(d);
    	Doctor d1=new Doctor("harsha");
    	ses.save(d1);
    	List<Doctor> dl=new ArrayList<Doctor>();
    	dl.add(d);
    	dl.add(d1);
    	System.out.println("Added");
    	/*Query query=ses.getNamedQuery("findDoctorId");
    	query.setInteger("Id1", 2);
    	List<Doctor> li=query.list();
    	for(int i=0;i<li.size();i++)
    	{
    		System.out.println("Id: "+li.get(i).getD_id()+"\n Name: "+li.get(i).getD_name());
    	}
    	if(!li.isEmpty())
    	{
    		Doctor dt=(Doctor)li.get(0);
    		System.out.println(dt);
    	}
    	Query query2=ses.getNamedQuery("select * from Doctor  dt where d_name d");
    	//query.setInteger("Id1", 2);
    	List<Doctor> li=query.list();
    	for(int i=0;i<li.size();i++)
    	{
    		System.out.println("Id: "+li.get(i).getD_id()+"\n Name: "+li.get(i).getD_name());
    	}
    	if(!li.isEmpty())
    	{
    		Doctor dt=(Doctor)li.get(0);
    		System.out.println(dt);
    	}
    	/*Query query1=ses.createQuery("count(dt.d_id) from Doctor dt");
    	Iterator count = query1.iterate();
    	System.out.println("No. of rows : "+count.next()); */

    	tx.commit();
    	ses.close();
	}

}
