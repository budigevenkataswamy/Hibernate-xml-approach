package test;

import javax.crypto.AEADBadTagException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Admin;
import beans.Employee;
import beans.HEmployee;
import beans.SEmployee;

public class Client {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		 Employee e1=new Employee();
		 e1.setId(1);
		 e1.setName("venkat");
		 e1.setEmail("venkataswamy611@gmail.com");
		 e1.setSalary(35000);
				
		HEmployee h=new HEmployee();
		h.setId(2);
		h.setName("venky");
		h.setEmail("vejebf@gmail.com");
		h.setSalary(50000);
		h.setWh(10);
		
		SEmployee s=new SEmployee();
		s.setId(3);
		s.setName("naresh");
		s.setEmail("naresh@gmail.com");
		s.setSalary(5000);
		s.setTool("hibernate");
		
		Admin a=new Admin();
		a.setId(4);
		a.setName("admin");
		a.setEmail("admin@gmail.com");
		a.setBranchname("HYD");
		a.setSalary(20000);
		
		session.save(e1);
		session.save(h);
		session.save(s);
		session.save(a);
		 
		
		transaction.commit();
		session.close();
		sf.close();
		System.out.println("succussfully inserted");
		
	}
 
}
