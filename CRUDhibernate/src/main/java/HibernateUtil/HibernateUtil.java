package HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory provideSessionFactory() 
	{ 
		Configuration config=new Configuration(); 
		config.configure("hibernet.cfg.xml"); 
		return config.buildSessionFactory(); 
		
	} 
	

}
