package com.onetoonemaping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SetValue {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();
		org.hibernate.Session session=factory.openSession();
		Answer ans=new Answer(121,"Padmanav");
		Question qn=new Question(121,"What is your name", ans);
		session.beginTransaction();
		session.save(qn);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}
}
