package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOemployee {

	private SessionFactory session;

	public DAOemployee(SessionFactory session) {
		this.session=session;
	}
//	public boolean save(PojoEmployee py) {
//		boolean flag=false;
//		Session s=session.openSession();
//		Transaction t=s.beginTransaction();
//		int i=(Integer)s.save(py);
//		if(i>0) {
//			flag=true;
//		}
//		t.commit();
//		s.close();
//		
//		return flag;
//		
//	}
}
