package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.KademeDataMapper;
import com.Argeloji.Api.OabDataMapper;
import com.Argeloji.Api.YonetimDataMapper;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Yonetim;
import com.Argeloji.Service.Dao;


public class YonetimHibernateDataMapper  implements YonetimDataMapper{

private final Dao dao;
	
	public YonetimHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Yonetim yonetim) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(yonetim);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Yonetim nesnesini veritabanına ekleyemedi..." +yonetim.getKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteYonetim(Yonetim yonetim){
		
		 dao.begin();
	     dao.getSession().delete(yonetim);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Yonetim> getListOfYonetim(){
		
		ArrayList<Yonetim> yonetimList=null;
		
		 dao.begin();
		 yonetimList = (ArrayList) dao.getSession().createQuery("FROM Yonetim").list();
	     dao.commit();
	     dao.close();	
		
	     return yonetimList;
	
	}
	
	
	public Yonetim getYonetimByKod(int kod){
		
		
		dao.begin();
		Yonetim yonetim=(Yonetim) dao.getSession().get(Yonetim.class, kod);
		dao.commit();
		dao.close();
		
		return yonetim;			
	  }
	
	
	/*public List<Oab> getOabByAd(String ad){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM com.Argeloji.Domain.Oab k where k.ad=:ad1")
		.setParameter("ad1",ad).list();
		dao.commit();
		dao.close();
		
	return list;
	}
	*/
	
	
	public void updateYonetim(Yonetim yonetim){
		
		
		dao.begin();
		Query query= dao.getSession().createQuery("Update Yonetim y set y.giristarih=:yonetim_tarih where y.kod=:yonetim_kod");
		query.setParameter("yonetim_kod", yonetim.getKod());
		query.setParameter("yonetim_tarih", yonetim.getGiristarih());
		int updateRowNumber= query.executeUpdate();
		dao.commit();
		dao.close();
		
	
		
		
	}
	
	
	
	
}
