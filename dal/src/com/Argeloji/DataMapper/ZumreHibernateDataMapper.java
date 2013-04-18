package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.KademeDataMapper;
import com.Argeloji.Api.OabDataMapper;
import com.Argeloji.Api.ZumreDataMapper;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Zumre;
import com.Argeloji.Service.Dao;


public class ZumreHibernateDataMapper  implements ZumreDataMapper{

private final Dao dao;
	
	public ZumreHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Zumre zumre) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(zumre);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Zumre nesnesini veritabanına ekleyemedi..." +zumre.getKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteZumre(Zumre zumre){
		
		 dao.begin();
	     dao.getSession().delete(zumre);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Zumre> getListOfZumre(){
		
		ArrayList<Zumre> zumreList=null;
		
		 dao.begin();
		 zumreList = (ArrayList) dao.getSession().createQuery("FROM Zumre").list();
	     dao.commit();
	     dao.close();	
		
	     return zumreList;
	
	}
	
	
	public Zumre getZumreByKod(int kod){
		
		
		dao.begin();
		Zumre zumre=(Zumre) dao.getSession().get(Zumre.class, kod);
		dao.commit();
		dao.close();
		
		return zumre;			
	  }
	
	
	public List<Zumre> getZumreByAlan(String alan){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM com.Argeloji.Domain.Zumre z where z.alanadi=:alan_adi")
		.setParameter("alan_adi",alan).list();
		dao.commit();
		dao.close();
		
	return list;
	}
	
	
	
	public void updateZumre(Zumre zumre){
		
		
		dao.begin();
		Query query= dao.getSession().createQuery("Update Zumre z set z.alanadi=:alan_adi where z.kod=:zumre_kod");
		query.setParameter("zumre_kod", zumre.getKod());
		query.setParameter("alan_adi", zumre.getAlanadi());
		int updateRowNumber= query.executeUpdate();
		dao.commit();
		dao.close();
		
	
		
		
	}
	
	
	
	
}
