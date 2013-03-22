package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.KademeDataMapper;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.Dao;


public class KademeHibernateDataMapper  implements KademeDataMapper{

private final Dao dao;
	
	public KademeHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Kademe kademe) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(kademe);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Kademe nesnesini veritabanına ekleyemedi..." +kademe.getKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteKademe(Kademe kademe){
		
		 dao.begin();
	     dao.getSession().delete(kademe);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Kademe> getListOfKademe(){
		
		ArrayList<Kademe> kademeler=null;
		
		 dao.begin();
		 kademeler = (ArrayList) dao.getSession().createQuery("FROM Kademe").list();
	     dao.commit();
	     dao.close();	
		
	     return kademeler;
	
	}
	
	
	public Kademe getKademeByKod(int kod){
		
		
		dao.begin();
		Kademe kademe=(Kademe) dao.getSession().get(Kademe.class, kod);
		dao.commit();
		dao.close();
		
		return kademe;			
	  }
	
	
	public List<Kademe> getKademeByAd(String kademe_ad){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM com.Argeloji.Domain.Kademe k where k.ad=:ad1")
		.setParameter("ad1",kademe_ad).list();
		dao.commit();
		dao.close();
		
	return list;
	}
	
	
	
	public void updateKademe(Kademe kademe){
		
		
		dao.begin();
		Query query= dao.getSession().createQuery("Update Kademe k set k.ad=:kademe_ad where k.kod=:kademe_kod");
		query.setParameter("kademe_kod", kademe.getKod());
		query.setParameter("kademe_ad", kademe.getAd());
		int updateRowNumber= query.executeUpdate();
		dao.commit();
		dao.close();
		
	
		
		
	}
	
	
	
	
}
