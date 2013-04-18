package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.AdresDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.Dao;

public class AdresHibernateDataMapper implements AdresDataMapper{

	
private final Dao dao;
	
	public AdresHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Adres adres) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(adres);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Ders nesnesini veritabanına ekleyemedi..." +adres.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Adres adres){
		
		 dao.begin();
	     dao.getSession().delete(adres);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Adres> getListOfAdres(){
		
		ArrayList<Adres> adresler=null;
		
		 dao.begin();
		 adresler = (ArrayList) dao.getSession().createQuery("FROM Adres").list();
	     dao.commit();
	     dao.close();	
		
	     return adresler;
	
	}
	
	
	public Adres getAdresByKod(long kod){
		
		
		dao.begin();
		Adres adres=(Adres) dao.getSession().get(Adres.class, kod);
		dao.commit();
		dao.close();
		
		return adres;			
	  }
	
	
	
	public void update(Adres adres) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(adres);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Adres nesnesini veritabaninda Güncellenemedi..." +adres.getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

