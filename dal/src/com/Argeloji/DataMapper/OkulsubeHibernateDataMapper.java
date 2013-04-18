package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.OkulSubeDataMapper;
import com.Argeloji.Domain.Okulsube;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Sube;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Service.Dao;

public class OkulsubeHibernateDataMapper implements OkulSubeDataMapper{

	
private final Dao dao;
	
	public OkulsubeHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Okulsube os) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(os);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Okulsube nesnesini veritabanına ekleyemedi..." +os.getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Okulsube os){
		
		 dao.begin();
	     dao.getSession().delete(os);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Okulsube> getListOfOkulsube(){
		
		ArrayList<Okulsube> subeler=null;
		
		 dao.begin();
		 subeler = (ArrayList) dao.getSession().createQuery("FROM Okulsube").list();
	     dao.commit();
	     dao.close();	
		
	     return subeler;
	
	}
	
	
	public List getOkulsubeByOkul(Okul okul){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Okulsube  where okul_kod=:okulKod")
				.setParameter("okulKod",okul.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	  }
	
	public Okulsube getOkulsubeByKod(int kod){
		dao.begin();
		Okulsube os=(Okulsube) dao.getSession().get(Okulsube.class, kod);
		dao.commit();
		dao.close();
		
		return os;
	}
	public List getOkulsubeBySube(Sube sube){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Okulsube  where sube_kod=:subeKod")
				.setParameter("subeKod",sube.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	  }
	
	
	
	public void update(Okulsube os) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(os);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Okulsube nesnesini veritabaninda Güncellenemedi..." +os.getKod());
			// TODO: handle exception
		
	
		
		}
	}
}

