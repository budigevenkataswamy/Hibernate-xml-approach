package test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Contract_Employee;
import beans.Employee;
import beans.Regular_Employee;

public class StoreData {
	public static void main(String[] args) {  
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cgf.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
	      
	    Employee e1=new Employee();  
	    e1.setName("sonoo");  
	      
	    Regular_Employee e2=new Regular_Employee();  
	    e2.setName("Vivek Kumar");  
	    e2.setSalary(50000);  
	    e2.setBonus(5);  
	      
	    Contract_Employee e3=new Contract_Employee();  
	    e3.setName("Arjun Kumar");  
	    e3.setPay_per_hour(1000);  
	    e3.setContract_duration("15 hours");  
	      
	    session.persist(e1);  
	    session.persist(e2);  
	    session.persist(e3);  
	      
	    transaction.commit();  
	    session.close();
	    sf.close();
	    System.out.println("success");  
	}  
}
