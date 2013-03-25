package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;


import com.Argeloji.Api.OkulDataMapper;
import com.Argeloji.Api.OkulgrubuDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulgrubu;
import com.Argeloji.Domain.Ozelokul;
import com.Argeloji.Service.Dao;

public class OkulgrubuHibernateDataMapper implements OkulgrubuDataMapper{

	
private final Dao dao;
	
	public OkulgrubuHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Okulgrubu og) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(og);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Okulgrubu nesnesini veritabanına ekleyemedi..." +og.getOkul().getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Okulgrubu og){
		
		 dao.begin();
	     dao.getSession().delete(og);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Okulgrubu> getListOfOkulgrubu(){
		
		ArrayList<Okulgrubu> okullar=null;
		
		 dao.begin();
		 okullar = (ArrayList) dao.getSession().createQuery("FROM Okulgrubu").list();
	     dao.commit();
	     dao.close();	
		
	     return okullar;
	
	}
	
	
	public Okulgrubu getOkulgrubuByOkul(Okul okul){
		
		dao.begin();
		Okulgrubu og= (Okulgrubu) dao.getSession().createQuery("FROM Okulgrubu  where okul_kod=:okulKod")
				.setParameter("okulKod",okul.getKod());
		dao.commit();
		dao.close();		
	    return og;			
	  }
	public Okulgrubu getOkulgrubuByOzelokul(Ozelokul oo){
		
		dao.begin();
		Okulgrubu og= (Okulgrubu) dao.getSession().createQuery("FROM Okulgrubu  where ozelokul_kod=:ozelokulKod")
				.setParameter("ozelokulKod",oo.getKod());
		dao.commit();
		dao.close();		
	    return og;			
	  }
	public void update(Okulgrubu og) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(og);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Okulgrubu nesnesini veritabaninda Güncellenemedi..." +og.getOkul().getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

