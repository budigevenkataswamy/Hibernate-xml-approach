package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Validatable;

import beans.Student;

public class Client {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		
		

		
   /* ValidatorFactory vf=validation.buildDefaultValidatorFactory();
    validator v=vf.getValidator();
    
    Set<ConstariantVoilation<Student>> seterror=v.validate(st);*/
		
		Student st=new Student();
		st.setId(111);
		st.setName(" ");
		st.setEmail(" ");
		st.setAddress(" ");
		
		session.save(st);
		t.commit();
		}

}
