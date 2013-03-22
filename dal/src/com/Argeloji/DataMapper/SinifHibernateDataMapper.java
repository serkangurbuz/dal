package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.SinifDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Service.Dao;

public class SinifHibernateDataMapper implements  SinifDataMapper {

	
private final Dao dao;
	
	public SinifHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Sinif sinif) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(sinif);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Sinif nesnesini veritabanına ekleyemedi..." +sinif.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void deleteSinif(Sinif sinif){
		
		 dao.begin();
	     dao.getSession().delete(sinif);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Sinif> getListOfSinif(){
		
		ArrayList<Sinif> siniflar=null;
		
		 dao.begin();
		 siniflar = (ArrayList) dao.getSession().createQuery("FROM Sinif").list();
	     dao.commit();
	     dao.close();	
		
	     return siniflar;
	
	}
	
	
	public Sinif getSinifByKod(int kod){
		
		
		dao.begin();
		Sinif sinif=(Sinif) dao.getSession().get(Sinif.class, kod);
		dao.commit();
		dao.close();
		
		return sinif;			
	  }
	
	
	public List<Sinif> getSinifByAd(String sinif_ad){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Sinif s where s.ad=:sinif_ad")
		.setParameter("sinif_ad",sinif_ad).list();
		dao.commit();
		dao.close();
		
	    return list;	
		
		
	}
	
	
	public void updateSinif(Sinif sinif) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(sinif);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Sinif nesnesini veritabaninda Güncellenemedi..." +sinif.getKod()+"  "+sinif.getAd());
		// TODO: handle exception
	}
		
		
	}
	
	
	
public List<Sinif> getSinifByKademe(Kademe kademe){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Sinif  where kademe_kod=:kademe_kod1")
				.setParameter("kademe_kod1",kademe.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
		
		
	}
	
		
	
		
		

		
}
