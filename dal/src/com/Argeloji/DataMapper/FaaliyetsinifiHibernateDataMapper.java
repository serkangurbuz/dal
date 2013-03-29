package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.FaaliyetsinifiDataMapper;
import com.Argeloji.Api.OkulDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Faaliyetsinifi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulkademe;
import com.Argeloji.Service.Dao;

public class FaaliyetsinifiHibernateDataMapper implements FaaliyetsinifiDataMapper{

	
private final Dao dao;
	
	public FaaliyetsinifiHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Faaliyetsinifi sinif) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(sinif);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Faaliyetsinifi nesnesini veritabanına ekleyemedi..." +sinif.getAltyapi().getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Faaliyetsinifi sinif){
		
		 dao.begin();
	     dao.getSession().delete(sinif);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Faaliyetsinifi> getListOfFaaliyetsinifi(){
		
		ArrayList<Faaliyetsinifi> siniflar=null;
		
		 dao.begin();
		 siniflar = (ArrayList) dao.getSession().createQuery("FROM Faaliyetsinifi").list();
	     dao.commit();
	     dao.close();	
		
	     return siniflar;
	
	}
	
	
	public Faaliyetsinifi getFaaliyetsinifiByKod(int kod){
		
		
		dao.begin();
		Faaliyetsinifi sinif=(Faaliyetsinifi) dao.getSession().get(Faaliyetsinifi.class, kod);
		dao.commit();
		dao.close();
		
		return sinif;			
	  }
	
	public Faaliyetsinifi getFaaliyetsinifiByAltyapi(Altyapi altyapi)
	{
		dao.begin();
		Faaliyetsinifi sinif= (Faaliyetsinifi) dao.getSession().createQuery("FROM Faaliyetsinifi  where altyapi_kod=:altyapiKod")
				.setParameter("altyapiKod",altyapi.getKod());
		dao.commit();
		dao.close();
		return sinif;
	}
	
	public void update(Faaliyetsinifi sinif) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(sinif);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Faaliyetsinifi nesnesini veritabaninda Güncellenemedi..." +sinif.getAltyapi().getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

