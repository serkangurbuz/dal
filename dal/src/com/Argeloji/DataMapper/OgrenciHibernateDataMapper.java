package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Api.OgrenciDataMapper;
import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Service.Dao;


public class OgrenciHibernateDataMapper  implements OgrenciDataMapper{

private final Dao dao;
	
	public OgrenciHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Ogrenci ogrenci) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(ogrenci);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Ogrenci nesnesini veritabanına ekleyemedi..." +ogrenci.getKullaniciKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteOgrenci(Ogrenci ogrenci){
		
		 dao.begin();
	     dao.getSession().delete(ogrenci);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Ogrenci> getListOfOgrenci(){
		
		ArrayList<Ogrenci> ogrenciler=null;
		
		 dao.begin();
		 ogrenciler = (ArrayList) dao.getSession().createQuery("FROM Ogrenci").list();
	     dao.commit();
	     dao.close();	
		
	     return ogrenciler;
	
	}
	
	
	public Ogrenci getOgrenciByKod(int kod){
		
		
		dao.begin();
		Ogrenci ogrenci=(Ogrenci) dao.getSession().get(Ogrenci.class, kod);
		dao.commit();
		dao.close();
		
		return ogrenci;			
	  }
	
	
	public List<Ogrenci> getOgrenciByKullanici(Kullanici kullanici){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Ogrenci  where kullaniciKod=:kullanici_kod")
				.setParameter("kullanici_kod",kullanici.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	}
	
	
	
    public void updateOgrenci(Ogrenci ogrenci) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(ogrenci);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Ogrenci nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	
	
}
