package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Student st=new Student();
		st.setId(111);
		st.setName("venkataswamy");
		st.setEmail("venkatswamy611@gmail.com");
		st.setAddress("HYDERABAD");
		
		session.save(st);
		t.commit();
		}

}
