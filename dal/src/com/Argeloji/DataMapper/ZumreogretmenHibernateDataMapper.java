package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.ZumreogretmenDataMapper;
import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.Zumre;
import com.Argeloji.Domain.Zumreogretmen;
import com.Argeloji.Service.Dao;

public class ZumreogretmenHibernateDataMapper implements  ZumreogretmenDataMapper {

	
private final Dao dao;
	
	public ZumreogretmenHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Zumreogretmen zumreogretmen) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(zumreogretmen);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Zumreogretmen nesnesini veritabanına ekleyemedi..."+e);
			// TODO: handle exception
		}
			
		}
	
	public void updateZumreogretmen(Zumreogretmen zumreogretmen) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(zumreogretmen);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Zumreogretmen nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	public void deleteZumreogretmen(Zumreogretmen zumreogretmen){
		
		 dao.begin();
	     dao.getSession().delete(zumreogretmen);
	     dao.commit();
	     dao.close();			
	
	}	
	
	public ArrayList<Zumreogretmen> getListOfZumreogretmen(){
		
		ArrayList<Zumreogretmen> ZumreogretmenList=null;
		
		 dao.begin();
		 ZumreogretmenList = (ArrayList) dao.getSession().createQuery("FROM Zumreogretmen").list();		
	     dao.commit();
	     dao.close();	
		
	     return ZumreogretmenList;
	
	}
    public ArrayList<Zumreogretmen> getZumreogretmenByZumre(Zumre zumre)
    {
    	ArrayList<Zumreogretmen> ZumreogretmenList=null;
    	
    	dao.begin();
    	ZumreogretmenList = (ArrayList) dao.getSession().createQuery("FROM Zumreogretmen where zumre_kod:=zumreKod").setParameter("zumreKod", zumre.getKod()).list();
		dao.commit();
		dao.close();		
	    return ZumreogretmenList;	
    }
	
    public ArrayList<Zumreogretmen> getZumreogretmenByOgretmen(Akademik akademik)
    {
        ArrayList<Zumreogretmen> ZumreogretmenList=null;
    	dao.begin();
    	ZumreogretmenList = (ArrayList) dao.getSession().createQuery("FROM Zumreogretmen where kullanici_personel_kod:=akademik_kod").setParameter("akademik_kod", akademik.getKullaniciPersonelKod()).list();
		dao.commit();
		dao.close();		
	    return ZumreogretmenList;	
    }
	
    public ArrayList<Zumreogretmen> getZumreogretmenByZumreKod(int zumre_kod)
    {
        ArrayList<Zumreogretmen> ZumreogretmenList=null;
    	
    	dao.begin();
    	//ZumreogretmenList = (ArrayList) dao.getSession().createQuery("FROM Zumreogretmen").list();
		dao.commit();
		dao.close();		
	    return ZumreogretmenList;	
    }
	
    public ArrayList<Zumreogretmen> getZumreogretmenByOgretmenKod(int akademik_kod)
    {
        ArrayList<Zumreogretmen> ZumreogretmenList=null;
    	
    	dao.begin();
    	//ZumreogretmenList = (ArrayList) dao.getSession().createQuery("FROM Zumreogretmen").list();
		dao.commit();
		dao.close();		
	    return ZumreogretmenList;	
    }
	
    public ArrayList<Zumreogretmen> getZumreogretmenByZumreAd(String zumre_ad)
    {
        ArrayList<Zumreogretmen> ZumreogretmenList=null;
    	
    	dao.begin();
    	//ZumreogretmenList = (ArrayList) dao.getSession().createQuery("FROM Zumreogretmen").list();
		dao.commit();
		dao.close();		
	    return ZumreogretmenList;	
    }
	
    public ArrayList<Zumreogretmen> getZumreogretmenByOgretmenAd(String akademik_ad)
    {
       ArrayList<Zumreogretmen> ZumreogretmenList=null;
    	
    	dao.begin();
    	//ZumreogretmenList = (ArrayList) dao.getSession().createQuery("FROM Zumreogretmen").list();
		dao.commit();
		dao.close();		
	    return ZumreogretmenList;	
    }
	
    public ArrayList<Zumreogretmen> getZumreogretmenByGirisTarih(Date giris_tarih)
    {
        ArrayList<Zumreogretmen> ZumreogretmenList=null;
    	
    	dao.begin();
    	//ZumreogretmenList = (ArrayList) dao.getSession().createQuery("FROM Zumreogretmen").list();
		dao.commit();
		dao.close();		
	    return ZumreogretmenList;	
    }

	
	
	
}
