package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.AdresDataMapper;
import com.Argeloji.Api.OkulDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Service.Dao;

public class OkulHibernateDataMapper implements OkulDataMapper{

	
private final Dao dao;
	
	public OkulHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Okul okul) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(okul);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Okul nesnesini veritabanına ekleyemedi..." +okul.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Okul okul){
		
		 dao.begin();
	     dao.getSession().delete(okul);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Okul> getListOfOkul(){
		
		ArrayList<Okul> okullar=null;
		
		 dao.begin();
		 okullar = (ArrayList) dao.getSession().createQuery("FROM Okul").list();
	     dao.commit();
	     dao.close();	
		
	     return okullar;
	
	}
	
	
	public Okul getOkulByKod(int kod){
		
		
		dao.begin();
		Okul okul=(Okul) dao.getSession().get(Okul.class, kod);
		dao.commit();
		dao.close();
		
		return okul;			
	  }
	
	public Okul getOkulByAd(String ad){
		dao.begin();
		Okul okul=(Okul) dao.getSession().get(Okul.class, ad);
		dao.commit();
		dao.close();
		return okul;
	}
	
	public void update(Okul okul) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(okul);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Okul nesnesini veritabaninda Güncellenemedi..." +okul.getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

