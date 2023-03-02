package com.hqlquery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLearnerTrainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	/*Learner l1=new Learner("honey","pune","4578912565",24);
    	ses.save(l1);
    	Learner l2=new Learner("vani","Tamilnadu","4578914367",21);
    	ses.save(l2);*/
    	/*Trainer t1=new Trainer("ramu","20000","vijayawada");
    	ses.save(t1);
    	Trainer t2=new Trainer("raji","10000","pune");
    	ses.save(t2);
    	System.out.println("Added");*/
    	
    	tx.commit();
    	ses.close();
	}

}
