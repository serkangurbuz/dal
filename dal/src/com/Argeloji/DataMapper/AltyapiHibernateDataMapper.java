package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.AltyapiDataMapper;
import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Service.Dao;

public class AltyapiHibernateDataMapper implements AltyapiDataMapper{

	
private final Dao dao;
	
	public AltyapiHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Altyapi altyapi) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(altyapi);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Alt yapi nesnesini veritabanına ekleyemedi..." +altyapi.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Altyapi altyapi){
		
		 dao.begin();
	     dao.getSession().delete(altyapi);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Altyapi> getListOfAltyapi(){
		
		ArrayList<Altyapi> altyapi=null;
		
		 dao.begin();
		 altyapi = (ArrayList) dao.getSession().createQuery("FROM Altyapi").list();
	     dao.commit();
	     dao.close();	
		
	     return altyapi;
	
	}
	
	
	public Altyapi getAltyapiByKod(int kod){
		
		
		dao.begin();
		Altyapi altyapi=(Altyapi) dao.getSession().get(Altyapi.class, kod);
		dao.commit();
		dao.close();
		
		return altyapi;			
	  }
	
	
	
	public void update(Altyapi altyapi) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(altyapi);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Altyapi nesnesini veritabaninda Güncellenemedi..." +altyapi.getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

