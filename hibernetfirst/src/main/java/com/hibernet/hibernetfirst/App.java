package com.hibernet.hibernetfirst;

import java.util.ArrayList;

//import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	//Student item1=new Student();
    	/*item1.setId(1);
    	item1.setName("mohan");
    	item1.setCity("Vijayawada");*/
    	/*Student item2=new Student();
    	item2.setId(2);
    	item2.setName("harini");
    	item2.setCity("Bangolore");
    	List<Student> li=new ArrayList<Student>();
    	li.add(item1);
    	li.add(item2);
    	
    	ses.save(item1);
    	ses.save(item2);
    	System.out.println("items added");
    	tx.commit();
    	Query query=ses.createQuery("from Student");
    	List<Student> arr=query.list();
    	for(Student s:arr)
    	{
    		System.out.println("id: "+s.getId()+" Name: "+s.getName()+" city: "+s.getCity());
    	}
    	
    	//tx.commit();*/
    	/*Student s=new Student();
    	s.setId(6);
        ses.delete(s);
    	//ses.remove(s);
        System.out.println("Record deleted successfully");*/
    	/*Student st=new Student();
    	st.setId(4);
    	st.setCity("pun");
    	//st.setName("hari");
    	ses.update(st);
        System.out.println("Record updated successfully");*/
        /*Student s = (Student) ses.load(Student.class, 4);
        s.setName("puja");
        System.out.println("Record 4 is updated by name successfully");*/
       /* Student student = (Student)ses.load(Student.class, 4);
        ses.delete(student);
        System.out.println("Deleted Successfully");*/

    	/*Query query=ses.createQuery("update Student set city=  :city"+" where id= :id");
    	query.setParameter(2, "maharastra");
    	System.out.println("Record updated");   */ 	
    	tx.commit();
    	ses.close();    
    }
}
