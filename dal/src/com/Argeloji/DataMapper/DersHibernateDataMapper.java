package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.DersDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.Dao;

public class DersHibernateDataMapper implements DersDataMapper{

	
private final Dao dao;
	
	public DersHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Ders ders) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(ders);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Ders nesnesini veritabanına ekleyemedi..." +ders.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void deleteDers(Ders ders){
		
		 dao.begin();
	     dao.getSession().delete(ders);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Ders> getListOfDers(){
		
		ArrayList<Ders> dersler=null;
		
		 dao.begin();
		 dersler = (ArrayList) dao.getSession().createQuery("FROM Ders").list();
	     dao.commit();
	     dao.close();	
		
	     return dersler;
	
	}
	
	
	public Ders getDersByKod(int kod){
		
		
		dao.begin();
		Ders ders=(Ders) dao.getSession().get(Ders.class, kod);
		dao.commit();
		dao.close();
		
		return ders;			
	  }
	
	
	public List<Ders> getDersByAd(String ders_ad){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Ders d where d.ad=:ders_ad")
		.setParameter("ders_ad",ders_ad).list();
		dao.commit();
		dao.close();
		
	
		
			return list;	
		
		
	}
	
	
	
	public void updateDers(Ders ders){
		
	
		dao.begin();
		Query query= dao.getSession().createQuery("Update Ders d set d.ad=:ders_ad where d.kod=:ders_kod");
		query.setParameter("kademe_kod", ders.getKod());
		query.setParameter("kademe_ad", ders.getAd());
		int updateRowNumber= query.executeUpdate();
		dao.commit();
		dao.close();
		
	
		
	}
}
