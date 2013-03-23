package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.KulupDataMapper;
import com.Argeloji.Domain.Kulup;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.Dao;

public class KulupHibernateDataMapper implements  KulupDataMapper {

	
private final Dao dao;
	
	public KulupHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Kulup kulup) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(kulup);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Kulup nesnesini veritabanına ekleyemedi..." +kulup.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Kulup kulup){
		
		 dao.begin();
	     dao.getSession().delete(kulup);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Kulup> getListOfKulup(){
		
		ArrayList<Kulup> kulupler=null;
		
		 dao.begin();
		 kulupler = (ArrayList) dao.getSession().createQuery("FROM Kulup").list();
	     dao.commit();
	     dao.close();	
		
	     return kulupler;
	
	}
	
	
	public Kulup getKulupByKod(int kod){
		
		
		dao.begin();
		Kulup kulup=(Kulup) dao.getSession().get(Kulup.class, kod);
		dao.commit();
		dao.close();
		
		return kulup;			
	  }
	
	
	public Kulup getKulupByAd(String ad){
		
		
		dao.begin();
		Kulup kulup=(Kulup) dao.getSession().get(Kulup.class, ad);
		dao.commit();
		dao.close();
		
		return kulup;
	}
	
	
	public void update(Kulup kulup) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(kulup);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Kulup nesnesini veritabaninda Güncellenemedi..." +kulup.getKod()+"  "+kulup.getAd());
		// TODO: handle exception
	}
		
		
	}
	
	
	
public List getListofKulupByKademe(Kademe kademe){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Kulup  where kademe_kod=:kademeKod")
				.setParameter("kademeKod",kademe.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
		
		
	}
	
		
	
		
		

		
}
