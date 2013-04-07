package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.DersSinifDataMapper;
import com.Argeloji.Api.OabveliDataMapper;
import com.Argeloji.Api.SinifDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Oabveli;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Service.Dao;

public class OabveliHibernateDataMapper implements  OabveliDataMapper {

	
private final Dao dao;
	
	public OabveliHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Oabveli oabveli) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(oabveli);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Oabveli nesnesini veritabanına ekleyemedi..."+e);
			// TODO: handle exception
		}
			
		}
	
	public void updateOabveli(Oabveli oabveli) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(oabveli);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Oabveli nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	public void deleteOabveli(Oabveli oabveli){
		
		 dao.begin();
	     dao.getSession().delete(oabveli);
	     dao.commit();
	     dao.close();			
	
	}	
	
	public ArrayList<Oabveli> getListOfOabveli(){
		
		ArrayList<Oabveli> OabveliList=null;
		
		 dao.begin();
		 OabveliList = (ArrayList) dao.getSession().createQuery("FROM Oabveli").list();		
	     dao.commit();
	     dao.close();	
		
	     return OabveliList;
	
	}
    public ArrayList<Oabveli> getOabveliByOab(Oab oab)
    {
    	ArrayList<Oabveli> OabveliList=null;
    	
    	dao.begin();
    	OabveliList = (ArrayList) dao.getSession().createQuery("FROM Oabveli where oab_oabkod:=oab_kod").setParameter("oab_kod", oab.getKod()).list();
		dao.commit();
		dao.close();		
	    return OabveliList;	
    }
	
    public ArrayList<Oabveli> getOabveliByVeli(Veli veli)
    {
        ArrayList<Oabveli> OabveliList=null;
    	dao.begin();
    	OabveliList = (ArrayList) dao.getSession().createQuery("FROM Oabveli where kullanici_veli_kod:=veli_kod").setParameter("veli_kod", veli.getKullaniciKod()).list();
		dao.commit();
		dao.close();		
	    return OabveliList;	
    }
	
    public ArrayList<Oabveli> getOabveliByVeliKod(int veli_kod)
    {
        ArrayList<Oabveli> OabveliList=null;
    	
    	dao.begin();
    	//OabveliList = (ArrayList) dao.getSession().createQuery("FROM Oabveli").list();
		dao.commit();
		dao.close();		
	    return OabveliList;	
    }
	
    public ArrayList<Oabveli> getOabveliByOabKod(int oab_kod)
    {
        ArrayList<Oabveli> OabveliList=null;
    	
    	dao.begin();
    	//OabveliList = (ArrayList) dao.getSession().createQuery("FROM Oabveli").list();
		dao.commit();
		dao.close();		
	    return OabveliList;	
    }
	
    public ArrayList<Oabveli> getOabveliByVeliAd(String veli_ad)
    {
        ArrayList<Oabveli> OabveliList=null;
    	
    	dao.begin();
    	//OabveliList = (ArrayList) dao.getSession().createQuery("FROM Oabveli").list();
		dao.commit();
		dao.close();		
	    return OabveliList;	
    }
	
    public ArrayList<Oabveli> getOabveliByOabAd(String oab_ad)
    {
       ArrayList<Oabveli> OabveliList=null;
    	
    	dao.begin();
    	//OabveliList = (ArrayList) dao.getSession().createQuery("FROM Oabveli").list();
		dao.commit();
		dao.close();		
	    return OabveliList;	
    }
	
    public ArrayList<Oabveli> getOabveliByGirisTarih(Date giris_tarih)
    {
        ArrayList<Oabveli> OabveliList=null;
    	
    	dao.begin();
    	//OabveliList = (ArrayList) dao.getSession().createQuery("FROM Oabveli").list();
		dao.commit();
		dao.close();		
	    return OabveliList;	
    }

	
	
	
}
