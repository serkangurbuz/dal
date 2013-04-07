package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.DersSinifDataMapper;
import com.Argeloji.Api.OabveliDataMapper;
import com.Argeloji.Api.OkulogrenciDataMapper;
import com.Argeloji.Api.SinifDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Oabveli;
import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulogrenci;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Service.Dao;

public class OkulogrenciHibernateDataMapper implements  OkulogrenciDataMapper {

	
private final Dao dao;
	
	public OkulogrenciHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Okulogrenci okulogrenci) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(okulogrenci);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Okulogrenci nesnesini veritabanına ekleyemedi..."+e);
			// TODO: handle exception
		}
			
		}
	
	public void updateOkulogrenci(Okulogrenci okulogrenci) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(okulogrenci);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Okulogrenci nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	public void deleteOkulogrenci(Okulogrenci okulogrenci){
		
		 dao.begin();
	     dao.getSession().delete(okulogrenci);
	     dao.commit();
	     dao.close();			
	
	}	
	
	public ArrayList<Okulogrenci> getListOfOkulogrenci(){
		
		ArrayList<Okulogrenci> OkulogrenciList=null;
		
		 dao.begin();
		 OkulogrenciList = (ArrayList) dao.getSession().createQuery("FROM Okulogrenci").list();		
	     dao.commit();
	     dao.close();	
		
	     return OkulogrenciList;
	
	}
    public ArrayList<Okulogrenci> getOkulogrenciByOkul(Okul okul)
    {
    	ArrayList<Okulogrenci> OkulogrenciList=null;
    	
    	dao.begin();
    	OkulogrenciList = (ArrayList) dao.getSession().createQuery("FROM Okulogrenci where okul_kod:=okulKod").setParameter("okulKod", okul.getKod()).list();
		dao.commit();
		dao.close();		
	    return OkulogrenciList;	
    }
	
    public ArrayList<Okulogrenci> getOkulogrenciByOgrenci(Ogrenci ogrenci)
    {
        ArrayList<Okulogrenci> OkulogrenciList=null;
    	dao.begin();
    	OkulogrenciList = (ArrayList) dao.getSession().createQuery("FROM Okulogrenci where kullanici_ogrenci_kod:=ogrenciKod").setParameter("ogrenciKod", ogrenci.getKullaniciKod()).list();
		dao.commit();
		dao.close();		
	    return OkulogrenciList;	
    }
	
    public ArrayList<Okulogrenci> getOkulogrenciByOkulKod(int okul_kod)
    {
        ArrayList<Okulogrenci> OkulogrenciList=null;
    	
    	dao.begin();
    	//OkulogrenciList = (ArrayList) dao.getSession().createQuery("FROM Okulogrenci").list();
		dao.commit();
		dao.close();		
	    return OkulogrenciList;	
    }
	
    public ArrayList<Okulogrenci> getOkulogrenciByOgrenciKod(int ogrenci_kod)
    {
        ArrayList<Okulogrenci> OkulogrenciList=null;
    	
    	dao.begin();
    	//OkulogrenciList = (ArrayList) dao.getSession().createQuery("FROM Okulogrenci").list();
		dao.commit();
		dao.close();		
	    return OkulogrenciList;	
    }
	
    public ArrayList<Okulogrenci> getOkulogrenciByOkulAd(String okul_ad)
    {
        ArrayList<Okulogrenci> OkulogrenciList=null;
    	
    	dao.begin();
    	//OkulogrenciList = (ArrayList) dao.getSession().createQuery("FROM Okulogrenci").list();
		dao.commit();
		dao.close();		
	    return OkulogrenciList;	
    }
	
    public ArrayList<Okulogrenci> getOkulogrenciByOgrenciAd(String ogrenci_ad)
    {
       ArrayList<Okulogrenci> OkulogrenciList=null;
    	
    	dao.begin();
    	//OkulogrenciList = (ArrayList) dao.getSession().createQuery("FROM Okulogrenci").list();
		dao.commit();
		dao.close();		
	    return OkulogrenciList;	
    }
	
    public ArrayList<Okulogrenci> getOkulogrenciByGirisTarih(Date giris_tarih)
    {
        ArrayList<Okulogrenci> OkulogrenciList=null;
    	
    	dao.begin();
    	//OkulogrenciList = (ArrayList) dao.getSession().createQuery("FROM Okulogrenci").list();
		dao.commit();
		dao.close();		
	    return OkulogrenciList;	
    }

	
	
	
}
