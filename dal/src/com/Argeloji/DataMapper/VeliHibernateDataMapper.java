package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Api.VeliDataMapper;
import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Service.Dao;


public class VeliHibernateDataMapper  implements VeliDataMapper{

private final Dao dao;
	
	public VeliHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Veli veli) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(veli);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Veli nesnesini veritabanına ekleyemedi..." +veli.getKullaniciKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteVeli(Veli veli){
		
		 dao.begin();
	     dao.getSession().delete(veli);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Veli> getListOfVeli(){
		
		ArrayList<Veli> veliler=null;
		
		 dao.begin();
		 veliler = (ArrayList) dao.getSession().createQuery("FROM Veli").list();
	     dao.commit();
	     dao.close();	
		
	     return veliler;
	
	}
	
	
	public Veli getVeliByKod(int kod){
		
		
		dao.begin();
		Veli veli=(Veli) dao.getSession().get(Veli.class, kod);
		dao.commit();
		dao.close();
		
		return veli;			
	  }
	
	
	public List<Veli> getVeliByKullanici(Kullanici kullanici){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Veli  where kullaniciKod=:kullanici_kod")
				.setParameter("kullanici_kod",kullanici.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	}
	
	
	
    public void updateVeli(Veli veli) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(veli);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Veli nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	
	
}
