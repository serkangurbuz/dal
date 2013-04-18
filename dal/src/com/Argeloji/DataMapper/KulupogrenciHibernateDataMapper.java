package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.KulupogrenciDataMapper;
import com.Argeloji.Domain.Kulup;
import com.Argeloji.Domain.Kulupogrenci;
import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Service.Dao;

public class KulupogrenciHibernateDataMapper implements  KulupogrenciDataMapper {

	
private final Dao dao;
	
	public KulupogrenciHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Kulupogrenci ko) throws Exception
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
	


	
	public void delete(Kulupogrenci ko){
		
		 dao.begin();
	     dao.getSession().delete(ko);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Kulupogrenci> getListOfKulupogrenci(){
		
		ArrayList<Kulupogrenci> kulupler=null;
		
		 dao.begin();
		 kulupler = (ArrayList) dao.getSession().createQuery("FROM Kulupogrenci").list();
	     dao.commit();
	     dao.close();	
		
	     return kulupler;
	
	}

	
	public void update(Kulupogrenci ko) throws Exception{
		
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
	public List getListofKulupogrenciByOgrenci(Ogrenci ogrenci) {
		dao.begin();
		List list= dao.getSession().createQuery("FROM Kulupogrenci  where kullanici_ogrenci_kod=:kullaniciKod")
				.setParameter("kullaniciKod",ogrenci.getKullaniciKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	}

	@Override
	public List getListofKulupogrenciByKulup(Kulup kulup) {
		dao.begin();
		List list= dao.getSession().createQuery("FROM Kulupogrenci  where kulup_kod=:kulupKod")
				.setParameter("kulupKod",kulup.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	}

	
	
	
		
}
