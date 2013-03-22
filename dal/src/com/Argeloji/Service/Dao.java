package com.Argeloji.Service;

import java.util.List;
import java.util.logging.Level;

import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration;



public class Dao {
	
	public static final Logger log = Logger.getAnonymousLogger();
	public static final ThreadLocal session = new ThreadLocal();
	//private static final SessionFactory sessionFactory =	new AnnotationConfiguration().configure().buildSessionFactory();
	public static final SessionFactory sessionFactory = buildSessionFactory();
	
	public Dao() {}
	
	public static Session getSession() {
		Session session = (Session) Dao.session.get();
			if (session == null) {
					session = sessionFactory.openSession();
					Dao.session.set(session);
			}
		return session;
		}
	
	public static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
	
	public void begin() {
		getSession().beginTransaction();
		}
	
	public void commit() {
		getSession().getTransaction().commit();
		}
	
	public void rollback() {
		try {
				getSession().getTransaction().rollback();
		} catch( HibernateException e ) {
			log.log(Level.WARNING,"Cannot rollback",e);
		}
		try {
				getSession().close();
		} catch( HibernateException e ) {
			log.log(Level.WARNING,"Cannot close",e);
		}
		
		Dao.session.set(null);
	
	}

	public static void close() {
		getSession().close();
		Dao.session.set(null);
		}
	
}
