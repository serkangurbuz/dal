package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;



import com.Argeloji.Api.PersonelDataMapper;
import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Service.Dao;


public class PersonelHibernateDataMapper  implements PersonelDataMapper{

private final Dao dao;
	
	public PersonelHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Personel personel) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(personel);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Personel nesnesini veritabanına ekleyemedi..." +personel.getKullaniciKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deletePersonel(Personel personel){
		
		 dao.begin();
	     dao.getSession().delete(personel);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Personel> getListOfPersonel(){
		
		ArrayList<Personel> personeller=null;
		
		 dao.begin();
		 personeller = (ArrayList) dao.getSession().createQuery("FROM Personel").list();
	     dao.commit();
	     dao.close();	
		
	     return personeller;
	
	}
	
	
	public Personel getPersonelByKod(int kod){
		
		
		dao.begin();
		Personel personel=(Personel) dao.getSession().get(Personel.class, kod);
		dao.commit();
		dao.close();
		
		return personel;			
	  }
	
	
	public List<Personel> getPersonelByKullanici(Kullanici kullanici){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Personel  where kullaniciKod=:kullanici_kod")
				.setParameter("kullanici_kod",kullanici.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	}
	
	
	
    public void updatePersonel(Personel personel) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(personel);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Personel nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	
	
}
