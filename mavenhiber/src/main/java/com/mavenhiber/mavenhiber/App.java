package com.mavenhiber.mavenhiber;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernet.pojo.HiberPojo;
import com.hibernet.pojo.SessionFactoryProvider;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernet.pojo.HiberPojo;
import com.hibernet.pojo.SessionFactoryProvider;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        HiberPojo hb=new HiberPojo();
		hb.setName("jisha");
		hb.setage(20);
		hb.setqualification("ece");
		hb.setEmail("jisha123@gmail.com");
		SessionFactory factory=SessionFactoryProvider.provideSessionFactory();
		org.hibernate.Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		//transaction.begin();
		session.save(hb);
		transaction.commit();
		session.close();
		
		
    }
}
