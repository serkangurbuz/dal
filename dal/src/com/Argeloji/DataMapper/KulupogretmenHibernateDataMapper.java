package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.KulupogretmenDataMapper;
import com.Argeloji.Domain.Kulup;
import com.Argeloji.Domain.Kulupogretmen;
import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Service.Dao;

public class KulupogretmenHibernateDataMapper implements  KulupogretmenDataMapper {

	
private final Dao dao;
	
	public KulupogretmenHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Kulupogretmen ko) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(ko);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Kulupogretmen nesnesini veritabanına ekleyemedi..." +ko.getOkulkulup().getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Kulupogretmen ko){
		
		 dao.begin();
	     dao.getSession().delete(ko);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Kulupogretmen> getListOfKulupogretmen(){
		
		ArrayList<Kulupogretmen> kulupler=null;
		
		 dao.begin();
		 kulupler = (ArrayList) dao.getSession().createQuery("FROM Kulupogretmen").list();
	     dao.commit();
	     dao.close();	
		
	     return kulupler;
	
	}
	
	
	public List getOkulkulupByOkul(Okul okul){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Okulkulup  where okul_kod=:okulKod")
				.setParameter("okulKod",okul.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	  }
	
	
	public void update(Kulupogretmen ko) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(ko);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Kulupogretmen nesnesini veritabaninda Güncellenemedi..." +ko.getOkulkulup().getKod());
		// TODO: handle exception
	}
		
		
	}

	@Override
	public List getListofKulupOgretmenByOgretmen(Akademik akademik) {
		dao.begin();
		List list= dao.getSession().createQuery("FROM Kulupogretmen  where kullanici_personel_kod=:kullaniciKod")
				.setParameter("kullaniciKod",akademik.getKullaniciPersonelKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	}

	@Override
	public List getListofKulupOgretmenByKulup(Kulup kulup) {
		dao.begin();
		List list= dao.getSession().createQuery("FROM Kulupogretmen  where kulup_kod=:kulupKod")
				.setParameter("kulupKod",kulup.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	}
	
	
		
}
