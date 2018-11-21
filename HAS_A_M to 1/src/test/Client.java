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
	 
	    Actor a=new Actor();
	    a.setAid(1);
	    a.setActorname("prabhas"); 
	    
	    Movies m1=new Movies();
	    m1.setMid(1);
	    m1.setMoviename("bahubali");
	    m1.setActor(a);
	    
	    Movies m2=new Movies();
	    m2.setMid(2);
	    m2.setMoviename("dangal");
	    m2.setActor(a);
	     session.save(m1);
	     session.save(m2);
	     session.save(a);
	     t.commit();
	     System.out.println("insertion success");
	     
	     
	    

}
}
