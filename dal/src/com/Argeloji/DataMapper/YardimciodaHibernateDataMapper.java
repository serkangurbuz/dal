package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.YardimciodaDataMapper;
import com.Argeloji.Api.OkulDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Faaliyetsinifi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulkademe;
import com.Argeloji.Domain.Yardimcioda;
import com.Argeloji.Service.Dao;

public class YardimciodaHibernateDataMapper implements YardimciodaDataMapper{

	
private final Dao dao;
	
	public YardimciodaHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Yardimcioda oda) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(oda);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Yardimcioda nesnesini veritabanına ekleyemedi..." +oda.getAltyapi().getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Yardimcioda oda){
		
		 dao.begin();
	     dao.getSession().delete(oda);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Yardimcioda> getListOfYardimcioda(){
		
		ArrayList<Yardimcioda> odalar=null;
		
		 dao.begin();
		 odalar = (ArrayList) dao.getSession().createQuery("FROM Yardimcioda").list();
	     dao.commit();
	     dao.close();	
		
	     return odalar;
	
	}
	
	
	public Yardimcioda getYardimciodaByKod(int kod){
		
		
		dao.begin();
		Yardimcioda oda=(Yardimcioda) dao.getSession().get(Yardimcioda.class, kod);
		dao.commit();
		dao.close();
		
		return oda;			
	  }
	
	public Yardimcioda getYardimciodaByAltyapi(Altyapi altyapi)
	{
		dao.begin();
		Yardimcioda oda= (Yardimcioda) dao.getSession().createQuery("FROM Yardimcioda  where altyapi_kod=:altyapiKod")
				.setParameter("altyapiKod",altyapi.getKod());
		dao.commit();
		dao.close();
		return oda;
	}
	
	public void update(Yardimcioda oda) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(oda);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Yardimcioda nesnesini veritabaninda Güncellenemedi..." +oda.getAltyapi().getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

