package com.hql;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

public class HqlDelete {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();
        org.hibernate.Session session=factory.openSession();
        
        session.beginTransaction();
        
        String query="delete form Student S where S.name=:n";
     
        org.hibernate.query.Query q=session.createQuery(query);
        q.setParameter("n", "jon");
        
        int r=q.executeUpdate();
        if(r!=0)
        {
        	System.out.println("Deleted");
        }
        
        session.getTransaction().commit();
        
        
        session.close();
        factory.close();
	}
}
