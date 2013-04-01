package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.KademeDataMapper;
import com.Argeloji.Api.OabDataMapper;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Service.Dao;


public class OabHibernateDataMapper  implements OabDataMapper{

private final Dao dao;
	
	public OabHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Oab oab) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(oab);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Oab nesnesini veritabanına ekleyemedi..." +oab.getKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteOab(Oab oab){
		
		 dao.begin();
	     dao.getSession().delete(oab);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Oab> getListOfOab(){
		
		ArrayList<Oab> oabList=null;
		
		 dao.begin();
		 oabList = (ArrayList) dao.getSession().createQuery("FROM Oab").list();
	     dao.commit();
	     dao.close();	
		
	     return oabList;
	
	}
	
	
	public Oab getOabByKod(int kod){
		
		
		dao.begin();
		Oab oab=(Oab) dao.getSession().get(Oab.class, kod);
		dao.commit();
		dao.close();
		
		return oab;			
	  }
	
	
	public List<Oab> getOabByAd(String ad){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM com.Argeloji.Domain.Oab k where k.ad=:ad1")
		.setParameter("ad1",ad).list();
		dao.commit();
		dao.close();
		
	return list;
	}
	
	
	
	public void updateOab(Oab oab){
		
		
		dao.begin();
		Query query= dao.getSession().createQuery("Update Oab o set o.ad=:oab_ad where o.kod=:oab_kod");
		query.setParameter("oab_kod", oab.getKod());
		query.setParameter("oab_ad", oab.getAd());
		int updateRowNumber= query.executeUpdate();
		dao.commit();
		dao.close();
		
	
		
		
	}
	
	
	
	
}
