package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Admin;
import beans.HEmployee;
import beans.SEmployee;

public class Client {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		SEmployee se=new SEmployee();
		se.setId(1);
		se.setName("venkat");
		se.setEmail("vesjsj@gmail.com");
		se.setSalary(45000);
		se.setTool("java");
		HEmployee he=new HEmployee();
		he.setId(2);
		he.setName("suresh");
		he.setEmail("fgfgfg@gmail.com");
		he.setSalary(4000);
		he.setWh(10);
		Admin ad=new Admin();
		ad.setId(3);
		ad.setName("ghgh");
		ad.setEmail("dddhd@gmail.com");
		ad.setSalary(450000);
		ad.setBranchname("hyderabad");
		
		session.save(se);
		session.save(he);
		session.save(ad);
		transaction.commit();
		session.close();
		sf.close();
		System.out.println("succussfully inserted");
		
	}
 
}
