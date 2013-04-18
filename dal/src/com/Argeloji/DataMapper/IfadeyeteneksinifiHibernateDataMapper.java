package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.IfadeyeteneksinifiDataMapper;
import com.Argeloji.Api.OkulDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Ifadeyeteneksinifi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulkademe;
import com.Argeloji.Service.Dao;

public class IfadeyeteneksinifiHibernateDataMapper implements IfadeyeteneksinifiDataMapper{

	
private final Dao dao;
	
	public IfadeyeteneksinifiHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Ifadeyeteneksinifi sinif) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(sinif);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Ifadeyeteneksinifi nesnesini veritabanına ekleyemedi..." +sinif.getAltyapi().getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Ifadeyeteneksinifi sinif){
		
		 dao.begin();
	     dao.getSession().delete(sinif);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Ifadeyeteneksinifi> getListOfIfadeyeteneksinifi(){
		
		ArrayList<Ifadeyeteneksinifi> siniflar=null;
		
		 dao.begin();
		 siniflar = (ArrayList) dao.getSession().createQuery("FROM Ifadeyeteneksinifi").list();
	     dao.commit();
	     dao.close();	
		
	     return siniflar;
	
	}
	
	
	public Ifadeyeteneksinifi getIfadeyeteneksinifiByKod(int kod){
		
		
		dao.begin();
		Ifadeyeteneksinifi sinif=(Ifadeyeteneksinifi) dao.getSession().get(Ifadeyeteneksinifi.class, kod);
		dao.commit();
		dao.close();
		
		return sinif;			
	  }
	
	public Ifadeyeteneksinifi getIfadeyeteneksinifiByAltyapi(Altyapi altyapi)
	{
		dao.begin();
		Ifadeyeteneksinifi sinif= (Ifadeyeteneksinifi) dao.getSession().createQuery("FROM Ifadeyeteneksinifi  where altyapi_kod=:altyapiKod")
				.setParameter("altyapiKod",altyapi.getKod());
		dao.commit();
		dao.close();
		return sinif;
	}
	
	public void update(Ifadeyeteneksinifi sinif) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(sinif);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Ifadeyeneteksinifi nesnesini veritabaninda Güncellenemedi..." +sinif.getAltyapi().getKod());
			// TODO: handle exception
		
	
		
		}
	}

}

