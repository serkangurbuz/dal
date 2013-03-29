package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;


import com.Argeloji.Api.OkulaltyapiDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulaltyapi;
import com.Argeloji.Domain.Okulkademe;
import com.Argeloji.Service.Dao;

public class OkulaltyapiHibernateDataMapper implements OkulaltyapiDataMapper{

	
private final Dao dao;
	
	public OkulaltyapiHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Okulaltyapi oa) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(oa);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Okulaltyapi nesnesini veritabanına ekleyemedi..." +oa.getOkul().getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Okulaltyapi oa){
		
		 dao.begin();
	     dao.getSession().delete(oa);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Okulaltyapi> getListOfOkulaltyapi(){
		
		ArrayList<Okulaltyapi> okullar=null;
		
		 dao.begin();
		 okullar = (ArrayList) dao.getSession().createQuery("FROM Okulaltyapi").list();
	     dao.commit();
	     dao.close();	
		
	     return okullar;
	
	}
	
	public void update(Okulaltyapi oa) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(oa);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Okulaltyapi nesnesini veritabaninda Güncellenemedi..." +oa.getOkul().getKod());
			// TODO: handle exception
		
	
		
		}
	}

	@Override
	public Okulaltyapi getOkulAltyapiByOkul(Okul okul) {

		dao.begin();
		Okulaltyapi okulk= (Okulaltyapi) dao.getSession().createQuery("FROM Okulaltyapi where okul_kod=:okulKod")
				.setParameter("okulKod",okul.getKod());
		dao.commit();
		dao.close();		
	    return okulk;	
	}

	@Override
	public Okulaltyapi getOkulAltyapiByAltyapi(Altyapi altyapi) {
		dao.begin();
		Okulaltyapi okulk= (Okulaltyapi) dao.getSession().createQuery("FROM Okulaltyapi where altyapi_kod=:altyapiKod")
				.setParameter("altyapiKod",altyapi.getKod());
		dao.commit();
		dao.close();		
	    return okulk;
	}

}

