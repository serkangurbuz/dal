package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.LabratuarDataMapper;
import com.Argeloji.Api.OkulDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Labratuar;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulkademe;
import com.Argeloji.Service.Dao;

public class LabratuarHibernateDataMapper implements LabratuarDataMapper{

	
private final Dao dao;
	
	public LabratuarHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Labratuar lab) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(lab);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Lab nesnesini veritabanına ekleyemedi..." +lab.getAltyapi().getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Labratuar lab){
		
		 dao.begin();
	     dao.getSession().delete(lab);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Labratuar> getListOfLabratuar(){
		
		ArrayList<Labratuar> lablar=null;
		
		 dao.begin();
		 lablar = (ArrayList) dao.getSession().createQuery("FROM Labratuar").list();
	     dao.commit();
	     dao.close();	
		
	     return lablar;
	
	}
	
	
	public Labratuar getLabratuarByKod(int kod){
		
		
		dao.begin();
		Labratuar lab=(Labratuar) dao.getSession().get(Labratuar.class, kod);
		dao.commit();
		dao.close();
		
		return lab;			
	  }
	
	public Labratuar getLabratuarByAltyapi(Altyapi altyapi)
	{
		dao.begin();
		Labratuar lab= (Labratuar) dao.getSession().createQuery("FROM Labratuar  where altyapi_kod=:altyapiKod")
				.setParameter("altyapiKod",altyapi.getKod());
		dao.commit();
		dao.close();
		return lab;
	}
	
	public void update(Labratuar lab) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(lab);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Lab nesnesini veritabaninda Güncellenemedi..." +lab.getAltyapi().getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

