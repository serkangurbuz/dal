package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;


import com.Argeloji.Api.OzelOkulDataMapper;
import com.Argeloji.Domain.Ozelokul;

import com.Argeloji.Service.Dao;

public class OzelokulHibernateDataMapper implements OzelOkulDataMapper{

	
private final Dao dao;
	
	public OzelokulHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Ozelokul okul) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(okul);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Özelokul nesnesini veritabanına ekleyemedi..." +okul.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Ozelokul okul){
		
		 dao.begin();
	     dao.getSession().delete(okul);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Ozelokul> getListOfOzelokul(){
		
		ArrayList<Ozelokul> okullar=null;
		
		 dao.begin();
		 okullar = (ArrayList) dao.getSession().createQuery("FROM Ozelokul").list();
	     dao.commit();
	     dao.close();	
		
	     return okullar;
	
	}
	
	
	public Ozelokul getOzelokulByKod(int kod){
		
		
		dao.begin();
		Ozelokul okul=(Ozelokul) dao.getSession().get(Ozelokul.class, kod);
		dao.commit();
		dao.close();
		
		return okul;			
	  }
	
	
	public void update(Ozelokul okul) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(okul);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Ozelokul nesnesini veritabaninda Güncellenemedi..." +okul.getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

