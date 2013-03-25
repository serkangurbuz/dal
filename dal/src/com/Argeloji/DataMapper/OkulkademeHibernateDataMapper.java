package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.AdresDataMapper;
import com.Argeloji.Api.OkulKademeDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulgrubu;
import com.Argeloji.Domain.Okulkademe;
import com.Argeloji.Service.Dao;

public class OkulkademeHibernateDataMapper implements OkulKademeDataMapper{

	
private final Dao dao;
	
	public OkulkademeHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Okulkademe ok) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(ok);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Okulkademe nesnesini veritabanına ekleyemedi..." +ok.getOkul().getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Okulkademe ok){
		
		 dao.begin();
	     dao.getSession().delete(ok);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Okulkademe> getListOfOkulkademe(){
		
		ArrayList<Okulkademe> okullar=null;
		
		 dao.begin();
		 okullar = (ArrayList) dao.getSession().createQuery("FROM Okulkademe").list();
	     dao.commit();
	     dao.close();	
		
	     return okullar;
	
	}
	
	
	public Okulkademe getOkulkademeByOkul(Okul okul){
		
		
		dao.begin();
		Okulkademe okulk= (Okulkademe) dao.getSession().createQuery("FROM Okulkademe  where okul_kod=:okulKod")
				.setParameter("okulKod",okul.getKod());
		dao.commit();
		dao.close();		
	    return okulk;			
	  }
	
	public Okulkademe getOkulkademeByKademe(Kademe kademe){
		dao.begin();
		Okulkademe okulk= (Okulkademe) dao.getSession().createQuery("FROM Okulkademe  where kademe_kod=:kademeKod")
				.setParameter("kademeKod",kademe.getKod());
		dao.commit();
		dao.close();
		return okulk;
	}
	
	public void update(Okulkademe okulkademe) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(okulkademe);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Okulkademe nesnesini veritabaninda Güncellenemedi..." +okulkademe.getOkul().getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

