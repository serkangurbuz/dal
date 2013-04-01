package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.KullanicigrupDataMapper;
import com.Argeloji.Domain.Kullanicigrup;
import com.Argeloji.Service.Dao;


public class KullanicigrupHibernateDataMapper  implements KullanicigrupDataMapper{

private final Dao dao;
	
	public KullanicigrupHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Kullanicigrup kullanicigrup) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(kullanicigrup);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Kullanicigrup nesnesini veritabanına ekleyemedi..." +kullanicigrup.getKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteKullanicigrup(Kullanicigrup kullanicigrup){
		
		 dao.begin();
	     dao.getSession().delete(kullanicigrup);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Kullanicigrup> getListOfKullanicigrup(){
		
		ArrayList<Kullanicigrup> kullanicigruplar=null;
		
		 dao.begin();
		 kullanicigruplar = (ArrayList) dao.getSession().createQuery("FROM Kullanicigrup").list();
	     dao.commit();
	     dao.close();	
		
	     return kullanicigruplar;
	
	}
	
	
	public Kullanicigrup getKullanicigrupByKod(int kod){
		
		
		dao.begin();
		Kullanicigrup kullanicigrup=(Kullanicigrup) dao.getSession().get(Kullanicigrup.class, kod);
		dao.commit();
		dao.close();
		
		return kullanicigrup;			
	  }
	
	
	public List<Kullanicigrup> getKullanicigrupByTip(String tip){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM com.Argeloji.Domain.Kullanicigrup k where k.tip=:tip1")
		.setParameter("tip1",tip).list();
		dao.commit();
		dao.close();
		
	return list;
	}
	
	
	
	public void updateKullanicigrup(Kullanicigrup kullanicigrup){
		
		
		dao.begin();
		Query query= dao.getSession().createQuery("Update Kullanicigrup k set k.tip=:tip1 where k.kod=:kod1");
		query.setParameter("kod1", kullanicigrup.getKod());
		query.setParameter("tip1", kullanicigrup.getTip());
		int updateRowNumber= query.executeUpdate();
		dao.commit();
		dao.close();
		
	
		
		
	}
	
	
	
	
}
