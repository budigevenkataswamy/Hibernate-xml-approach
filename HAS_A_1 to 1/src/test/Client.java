package test;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.vote;
import beans.voter;

public class Client {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();	
	 
	    voter vtr1=new voter();
	    vtr1.setVid(111);
	    vtr1.setVname("abc");
	    vtr1.setVage(25);
	    
	    voter vtr2=new voter();
	    vtr2.setVid(222);
	    vtr2.setVname("abc");
	    vtr2.setVage(25);
	    
	    vote vt1=new vote();
	    vt1.setPname("Cngs");
	    vt1.setCdate(new Date());
	    vt1.setVoter(vtr1);
	     
	    vote vt2=new vote();
	    vt2.setPname("BJP");
	    vt2.setCdate(new Date());
	    vt2.setVoter(vtr2);
	    
	     session.save(vtr1);
	     session.save(vtr2);
	     session.save(vt1);
	     session.save(vt2);
	     session.beginTransaction().commit();
	     session.close();
	     sf.close();
	     System.out.println("insertion success");
	     
	     
	    

}
}
