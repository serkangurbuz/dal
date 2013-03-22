package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.DersSinifDataMapper;
import com.Argeloji.Api.SinifDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Service.Dao;

public class DersSinifHibernateDataMapper implements  DersSinifDataMapper {

	
private final Dao dao;
	
	public DersSinifHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(DersSinif dersSinif) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().save(dersSinif);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: DersSinif nesnesini veritabanına ekleyemedi..."+e);
			// TODO: handle exception
		}
			
		}
	
	public void updateDersSinif(DersSinif dersSinif) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(dersSinif);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: DersSinif nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	public void deleteDersSinif(DersSinif dersSinif){
		
		 dao.begin();
	     dao.getSession().delete(dersSinif);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<DersSinif> getListOfDersSinif(){
		
		ArrayList<DersSinif> dersSiniflar=null;
		
		 dao.begin();
		 dersSiniflar = (ArrayList) dao.getSession().createQuery("FROM DersSinif").list();		
	     dao.commit();
	     dao.close();	
		
	     return dersSiniflar;
	
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

@Override
public ArrayList<DersSinif> getDersSinifByDers(Ders ders) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ArrayList<DersSinif> getDersSinifBySinif(Sinif sinif) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ArrayList<DersSinif> getDersSinifBySinifKod(int sinif_kod) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ArrayList<DersSinif> getDersSinifByDersKod(int ders_kod) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ArrayList<DersSinif> getDersSinifByDersAd(String ders_ad) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ArrayList<DersSinif> getDersSinifByDersKod(String ders_ad) {
	// TODO Auto-generated method stub
	return null;
}
	
		
	
		
		

		
}
