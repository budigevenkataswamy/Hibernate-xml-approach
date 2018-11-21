package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import beans.Employee;

public class AgregateFunctionsUsingProjections {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    
	    Criteria  cr=session.createCriteria(Employee.class);  
	   /* Projection p=Projections.avg("salary");
	    cr.setProjection(p);
	    double avg_salary=(Double)cr.uniqueResult();
	    System.out.println(avg_salary);*/
	    
	    
	    /*Projection p=Projections.max("salary");
	    cr.setProjection(p);
	    int high_salary=(Integer)cr.uniqueResult();
	    System.out.println(high_salary);*/
	    
	    Projection p=Projections.sum("salary");
	    cr.setProjection(p);
	    int sum_ofall=(Integer)cr.uniqueResult();
	    System.out.println(sum_ofall);
	    
	    
	}

}
