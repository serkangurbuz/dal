package com.Argeloji.Service;
import java.util.List;



public class UserHibernateDataMapper  implements UserDataMapper

{
	private final Dao dao;
	
	public UserHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(User user) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(user);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("HATA: Ders nesnesini veritabanına ekleyemedi" +user.getKod(), e);
			// TODO: handle exception
		}
			
		}
	

	public User load(String id) throws Exception{
		
		User user=null;
		try {
		 dao.begin();
	      user=  (User) dao.getSession().load(User.class, Integer.parseInt(id));
	     dao.commit();
	     dao.close();
	     
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("HATA: Ders nesnesini veritabanına ekleyemedi" +id, e);
		// TODO: handle exception
	}
		
		return user;
		
	
	}
	
	public void delete(User user){
		
		 dao.begin();
	     dao.getSession().delete(user);
	     dao.commit();
	     dao.close();
		
		
	
	}
	
	

}