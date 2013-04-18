package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.YonetimpersonelDataMapper;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Domain.Yonetim;
import com.Argeloji.Domain.Yonetimpersonel;
import com.Argeloji.Service.Dao;

public class YonetimpersonelHibernateDataMapper implements  YonetimpersonelDataMapper {

	
private final Dao dao;
	
	public YonetimpersonelHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Yonetimpersonel yonetimpersonel) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(yonetimpersonel);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Yonetimpersonel nesnesini veritabanına ekleyemedi..."+e);
			// TODO: handle exception
		}
			
		}
	
	public void updateYonetimpersonel(Yonetimpersonel yonetimpersonel) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(yonetimpersonel);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Yonetimpersonel nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	public void deleteYonetimpersonel(Yonetimpersonel yonetimpersonel){
		
		 dao.begin();
	     dao.getSession().delete(yonetimpersonel);
	     dao.commit();
	     dao.close();			
	
	}	
	
	public ArrayList<Yonetimpersonel> getListOfYonetimpersonel(){
		
		ArrayList<Yonetimpersonel> YonetimpersonelList=null;
		
		 dao.begin();
		 YonetimpersonelList = (ArrayList) dao.getSession().createQuery("FROM Yonetimpersonel").list();		
	     dao.commit();
	     dao.close();	
		
	     return YonetimpersonelList;
	
	}
    public ArrayList<Yonetimpersonel> getYonetimpersonelByYonetim(Yonetim yonetim)
    {
    	ArrayList<Yonetimpersonel> YonetimpersonelList=null;
    	
    	dao.begin();
    	YonetimpersonelList = (ArrayList) dao.getSession().createQuery("FROM Yonetimpersonel where yonetim_kod:=yonetimKod").setParameter("yonetimKod", yonetim.getKod()).list();
		dao.commit();
		dao.close();		
	    return YonetimpersonelList;	
    }
	
    public ArrayList<Yonetimpersonel> getYonetimpersonelByPersonel(Personel personel)
    {
        ArrayList<Yonetimpersonel> YonetimpersonelList=null;
    	dao.begin();
    	YonetimpersonelList = (ArrayList) dao.getSession().createQuery("FROM Yonetimpersonel where kullanici_personel_kod:=personelKod").setParameter("personelKod", personel.getKullaniciKod()).list();
		dao.commit();
		dao.close();		
	    return YonetimpersonelList;	
    }
	
    public ArrayList<Yonetimpersonel> getYonetimpersonelByYonetimKod(int yonetim_kod)
    {
        ArrayList<Yonetimpersonel> YonetimpersonelList=null;
    	
    	dao.begin();
    	//YonetimpersonelList = (ArrayList) dao.getSession().createQuery("FROM Yonetimpersonel").list();
		dao.commit();
		dao.close();		
	    return YonetimpersonelList;	
    }
	
    public ArrayList<Yonetimpersonel> getYonetimpersonelByPersonelKod(int personel_kod)
    {
        ArrayList<Yonetimpersonel> YonetimpersonelList=null;
    	
    	dao.begin();
    	//YonetimpersonelList = (ArrayList) dao.getSession().createQuery("FROM Yonetimpersonel").list();
		dao.commit();
		dao.close();		
	    return YonetimpersonelList;	
    }
	
    public ArrayList<Yonetimpersonel> getYonetimpersonelByYonetimAd(String yonetim_ad)
    {
        ArrayList<Yonetimpersonel> YonetimpersonelList=null;
    	
    	dao.begin();
    	//YonetimpersonelList = (ArrayList) dao.getSession().createQuery("FROM Yonetimpersonel").list();
		dao.commit();
		dao.close();		
	    return YonetimpersonelList;	
    }
	
    public ArrayList<Yonetimpersonel> getYonetimpersonelByPersonelAd(String personel_ad)
    {
       ArrayList<Yonetimpersonel> YonetimpersonelList=null;
    	
    	dao.begin();
    	//YonetimpersonelList = (ArrayList) dao.getSession().createQuery("FROM Yonetimpersonel").list();
		dao.commit();
		dao.close();		
	    return YonetimpersonelList;	
    }
	
    public ArrayList<Yonetimpersonel> getYonetimpersonelByGirisTarih(Date giris_tarih)
    {
        ArrayList<Yonetimpersonel> YonetimpersonelList=null;
    	
    	dao.begin();
    	//YonetimpersonelList = (ArrayList) dao.getSession().createQuery("FROM Yonetimpersonel").list();
		dao.commit();
		dao.close();		
	    return YonetimpersonelList;	
    }

	
	
	
}
