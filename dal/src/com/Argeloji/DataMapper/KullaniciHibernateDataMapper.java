package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.KullaniciDataMapper;
import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Service.Dao;


public class KullaniciHibernateDataMapper  implements KullaniciDataMapper{

private final Dao dao;
	
	public KullaniciHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Kullanici kullanici) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(kullanici);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Kullanici nesnesini veritabanına ekleyemedi..." +kullanici.getKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteKullanici(Kullanici kullanici){
		
		 dao.begin();
	     dao.getSession().delete(kullanici);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Kullanici> getListOfKullanici(){
		
		ArrayList<Kullanici> kullanicilar=null;
		
		 dao.begin();
		 kullanicilar = (ArrayList) dao.getSession().createQuery("FROM Kullanici").list();
	     dao.commit();
	     dao.close();	
		
	     return kullanicilar;
	
	}
	
	
	public Kullanici getKullaniciByKod(int kod){
		
		
		dao.begin();
		Kullanici kullanici=(Kullanici) dao.getSession().get(Kullanici.class, kod);
		dao.commit();
		dao.close();
		
		return kullanici;			
	  }
	
	
	public List<Kullanici> getKullaniciByAd(String kullanici_ad){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM com.Argeloji.Domain.Kullanici k where k.ad=:ad1")
		.setParameter("ad1",kullanici_ad).list();
		dao.commit();
		dao.close();
		
	return list;
	}
	
	
	
	public void updateKullanici(Kullanici kullanici){
		
		
		dao.begin();
		Query query= dao.getSession().createQuery("Update Kullanici k set k.ad=:kullanici_ad where k.kod=:kullanici_kod");
		query.setParameter("kullanici_kod", kullanici.getKod());
		query.setParameter("kullanici_ad", kullanici.getAd());
		int updateRowNumber= query.executeUpdate();
		dao.commit();
		dao.close();
		
	
		
		
	}
	
	
	
	
}
