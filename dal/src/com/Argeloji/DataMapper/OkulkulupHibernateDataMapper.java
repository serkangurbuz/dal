package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.AdresDataMapper;
import com.Argeloji.Api.OkulDataMapper;
import com.Argeloji.Api.OkulkulupDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulkulup;
import com.Argeloji.Domain.Sube;
import com.Argeloji.Service.Dao;

public class OkulkulupHibernateDataMapper implements OkulkulupDataMapper{

	
private final Dao dao;
	
	public OkulkulupHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Okulkulup ok) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(ok);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Okulkulup nesnesini veritabanına ekleyemedi..." +ok.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Okulkulup ok){
		
		 dao.begin();
	     dao.getSession().delete(ok);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Okulkulup> getListOfOkulkulup(){
		
		ArrayList<Okulkulup> okullar=null;
		
		 dao.begin();
		 okullar = (ArrayList) dao.getSession().createQuery("FROM Okulkulup").list();
	     dao.commit();
	     dao.close();	
		
	     return okullar;
	
	}
	
	
	public Okulkulup getOkulkulupByKod(int kod){
		
		
		dao.begin();
		Okulkulup okul=(Okulkulup) dao.getSession().get(Okulkulup.class, kod);
		dao.commit();
		dao.close();
		
		return okul;			
	  }
	
	public void update(Okulkulup ok) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(ok);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Okulkulup nesnesini veritabaninda Güncellenemedi..." +ok.getKod());
			// TODO: handle exception
		}
	}
	public Okulkulup getOkulByOkul(Okul okul)
	{
		
		dao.begin();
		Okulkulup kulup= (Okulkulup) dao.getSession().createQuery("FROM Okulkulup  where okul_kod=:okulKod")
				.setParameter("okulKod",okul.getKod()).list();
		dao.commit();
		dao.close();		
	    return kulup;
	}

}

