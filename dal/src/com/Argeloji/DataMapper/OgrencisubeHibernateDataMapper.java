package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;


import com.Argeloji.Api.OgrencisubeDataMapper;
import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Domain.Ogrencisube;
import com.Argeloji.Domain.Okulsube;
import com.Argeloji.Service.Dao;

public class OgrencisubeHibernateDataMapper implements  OgrencisubeDataMapper {

	
private final Dao dao;
	
	public OgrencisubeHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Ogrencisube ogrencisube) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(ogrencisube);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Ogrencisube nesnesini veritabanına ekleyemedi..."+e);
			// TODO: handle exception
		}
			
		}
	
	public void updateOgrencisube(Ogrencisube ogrencisube) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(ogrencisube);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Ogrencisube nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	public void deleteOgrencisube(Ogrencisube ogrencisube){
		
		 dao.begin();
	     dao.getSession().delete(ogrencisube);
	     dao.commit();
	     dao.close();			
	
	}	
	
	public ArrayList<Ogrencisube> getListOfOgrencisube(){
		
		ArrayList<Ogrencisube> OgrencisubeList=null;
		
		 dao.begin();
		 OgrencisubeList = (ArrayList) dao.getSession().createQuery("FROM Ogrencisube").list();		
	     dao.commit();
	     dao.close();	
		
	     return OgrencisubeList;
	
	}
    public ArrayList<Ogrencisube> getOgrencisubeByOgrenci(Ogrenci ogrenci)
    {
    	ArrayList<Ogrencisube> OgrencisubeList=null;
    	
    	dao.begin();
    	OgrencisubeList = (ArrayList) dao.getSession().createQuery("FROM Ogrencisube where kullanici_ogrenci_kod:=ogrenciKod").setParameter("ogrenciKod", ogrenci.getKullaniciKod()).list();
		dao.commit();
		dao.close();		
	    return OgrencisubeList;	
    }
	
    public ArrayList<Ogrencisube> getOgrencisubeByOkulSube(Okulsube okulsube)
    {
        ArrayList<Ogrencisube> OgrencisubeList=null;
    	dao.begin();
    	OgrencisubeList = (ArrayList) dao.getSession().createQuery("FROM Ogrencisube where okulsube_kod:=kod").setParameter("kod", okulsube.getKod()).list();
		dao.commit();
		dao.close();		
	    return OgrencisubeList;	
    }
	
    public ArrayList<Ogrencisube> getOgrencisubeByOgrenciKod(int ogrenci_kod)
    {
        ArrayList<Ogrencisube> OgrencisubeList=null;
    	
    	dao.begin();
    	//OgrencisubeList = (ArrayList) dao.getSession().createQuery("FROM Ogrencisube").list();
		dao.commit();
		dao.close();		
	    return OgrencisubeList;	
    }
	
    public ArrayList<Ogrencisube> getOgrencisubeByOkulSubeKod(int okulsube_kod)
    {
        ArrayList<Ogrencisube> OgrencisubeList=null;
    	
    	dao.begin();
    	//OgrencisubeList = (ArrayList) dao.getSession().createQuery("FROM Ogrencisube").list();
		dao.commit();
		dao.close();		
	    return OgrencisubeList;	
    }
	
    public ArrayList<Ogrencisube> getOgrencisubeByOgrenciAd(String ogrenci_ad)
    {
        ArrayList<Ogrencisube> OgrencisubeList=null;
    	
    	dao.begin();
    	//OgrencisubeList = (ArrayList) dao.getSession().createQuery("FROM Ogrencisube").list();
		dao.commit();
		dao.close();		
	    return OgrencisubeList;	
    }
	
    public ArrayList<Ogrencisube> getOgrencisubeByOkulSubeAd(String okul_ad,String sube_ad)
    {
       ArrayList<Ogrencisube> OgrencisubeList=null;
    	
    	dao.begin();
    	//OgrencisubeList = (ArrayList) dao.getSession().createQuery("FROM Ogrencisube").list();
		dao.commit();
		dao.close();		
	    return OgrencisubeList;	
    }
	
    public ArrayList<Ogrencisube> getOgrencisubeByGirisTarih(Date giris_tarih)
    {
        ArrayList<Ogrencisube> OgrencisubeList=null;
    	
    	dao.begin();
    	//OgrencisubeList = (ArrayList) dao.getSession().createQuery("FROM Oabveli").list();
		dao.commit();
		dao.close();		
	    return OgrencisubeList;	
    }


	
	
	
}
