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
		
		
		SEmployee se=new SEmployee(333,"abc","venkat@gmail.com",50000,"hibrenate");
		HEmployee he=new HEmployee(444,"lmn","lmnt@gmail.com",30000,10);
		Admin ad=new Admin(555, "suresh","suresh@gmail.com",40000,"SRNAGAR");
		
		session.save(se);
		session.save(he);
		session.save(ad);
		transaction.commit();
		session.close();
		sf.close();
		System.out.println("succussfully inserted");
		
	}
 
}
