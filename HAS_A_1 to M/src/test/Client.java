package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movies;

public class Client {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();	
	 
	    Movies m1=new Movies();
	    m1.setMid(1);
	    m1.setMoviename("bahubali");
	    
	    Movies m2=new Movies();
	    m1.setMid(2);
	    m1.setMoviename("dangal");
	    
	    Actor a=new Actor();
	    a.setAid(1);
	    a.setActorname("prabhas");
	    
	    session.save(m1);
	    session.save(m2);
	    session.save(a);
	    
	    t.commit();
	    session.close();
	    sf.close();
	    System.out.println("success");
	    
	    
}
}
