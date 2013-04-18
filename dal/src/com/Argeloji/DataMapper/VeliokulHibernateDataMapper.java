package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.DersSinifDataMapper;
import com.Argeloji.Api.OabveliDataMapper;
import com.Argeloji.Api.SinifDataMapper;
import com.Argeloji.Api.VeliokulDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Oabveli;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Domain.Veliokul;
import com.Argeloji.Service.Dao;

public class VeliokulHibernateDataMapper implements  VeliokulDataMapper {

	
private final Dao dao;
	
	public VeliokulHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Veliokul veliokul) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(veliokul);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Veliokul nesnesini veritabanına ekleyemedi..."+e);
			// TODO: handle exception
		}
			
		}
	
	public void updateVeliokul(Veliokul veliokul) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(veliokul);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Veliokul nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	public void deleteVeliokul(Veliokul veliokul){
		
		 dao.begin();
	     dao.getSession().delete(veliokul);
	     dao.commit();
	     dao.close();			
	
	}	
	
	public ArrayList<Veliokul> getListOfVeliokul(){
		
		ArrayList<Veliokul> VeliokulList=null;
		
		 dao.begin();
		 VeliokulList = (ArrayList) dao.getSession().createQuery("FROM Veliokul").list();		
	     dao.commit();
	     dao.close();	
		
	     return VeliokulList;
	
	}
    public ArrayList<Veliokul> getVeliokulByOkul(Okul okul)
    {
    	ArrayList<Veliokul> VeliokulList=null;
    	
    	dao.begin();
    	VeliokulList = (ArrayList) dao.getSession().createQuery("FROM Veliokul where okul_kod:=okulKod").setParameter("okulKod", okul.getKod()).list();
		dao.commit();
		dao.close();		
	    return VeliokulList;	
    }
	
    public ArrayList<Veliokul> getVeliokulByVeli(Veli veli)
    {
        ArrayList<Veliokul> VeliokulList=null;
    	dao.begin();
    	VeliokulList = (ArrayList) dao.getSession().createQuery("FROM Veliokul where kullanici_veli_kod:=veli_kod").setParameter("veli_kod", veli.getKullaniciKod()).list();
		dao.commit();
		dao.close();		
	    return VeliokulList;	
    }
	
    public ArrayList<Veliokul> getVeliokulByVeliKod(int veli_kod)
    {
        ArrayList<Veliokul> VeliokulList=null;
    	
    	dao.begin();
    	//VeliokulList = (ArrayList) dao.getSession().createQuery("FROM Veliokul").list();
		dao.commit();
		dao.close();		
	    return VeliokulList;	
    }
	
    public ArrayList<Veliokul> getVeliokulByOkulKod(int okul_kod)
    {
        ArrayList<Veliokul> VeliokulList=null;
    	
    	dao.begin();
    	//VeliokulList = (ArrayList) dao.getSession().createQuery("FROM Veliokul").list();
		dao.commit();
		dao.close();		
	    return VeliokulList;	
    }
	
    public ArrayList<Veliokul> getVeliokulByVeliAd(String veli_ad)
    {
        ArrayList<Veliokul> VeliokulList=null;
    	
    	dao.begin();
    	//VeliokulList = (ArrayList) dao.getSession().createQuery("FROM Veliokul").list();
		dao.commit();
		dao.close();		
	    return VeliokulList;	
    }
	
    public ArrayList<Veliokul> getVeliokulByOkulAd(String okul_ad)
    {
       ArrayList<Veliokul> VeliokulList=null;
    	
    	dao.begin();
    	//VeliokulList = (ArrayList) dao.getSession().createQuery("FROM Veliokul").list();
		dao.commit();
		dao.close();		
	    return VeliokulList;	
    }
	
    public ArrayList<Veliokul> getVeliokulByGirisTarih(Date giris_tarih)
    {
        ArrayList<Veliokul> VeliokulList=null;
    	
    	dao.begin();
    	//VeliokulList = (ArrayList) dao.getSession().createQuery("FROM Veliokul").list();
		dao.commit();
		dao.close();		
	    return VeliokulList;	
    }

	
	
	
	
}
