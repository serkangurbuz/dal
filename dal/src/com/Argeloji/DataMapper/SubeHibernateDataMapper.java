package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.SubeDataMapper;
import com.Argeloji.Domain.Sube;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Service.Dao;

public class SubeHibernateDataMapper implements  SubeDataMapper {

	
private final Dao dao;
	
	public SubeHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Sube sube) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(sube);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Sube nesnesini veritabanına ekleyemedi..." +sube.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Sube sube){
		
		 dao.begin();
	     dao.getSession().delete(sube);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Sube> getListOfSube(){
		
		ArrayList<Sube> subeler=null;
		
		 dao.begin();
		 subeler = (ArrayList) dao.getSession().createQuery("FROM Sube").list();
	     dao.commit();
	     dao.close();	
		
	     return subeler;
	
	}
	
	
	public Sube getSubeByKod(int kod){
		
		
		dao.begin();
		Sube sube=(Sube) dao.getSession().get(Sube.class, kod);
		dao.commit();
		dao.close();
		
		return sube;			
	  }
	
	
	public List<Sube> getSubeByAd(String ad){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Sube s where s.ad=:ad")
		.setParameter("ad",ad).list();
		dao.commit();
		dao.close();
		
	    return list;	
		
		
	}
	
	
	public void update(Sube sube) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(sube);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Sube nesnesini veritabaninda Güncellenemedi..." +sube.getKod()+"  "+sube.getAd());
		// TODO: handle exception
	}
		
		
	}
	
	
	
public List<Sube> getSubeBySinif(Sinif sinif){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Sube  where sinif_kod=:sinifKod")
				.setParameter("sinifKod",sinif.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
		
		
	}
	
		
	
		
		

		
}
