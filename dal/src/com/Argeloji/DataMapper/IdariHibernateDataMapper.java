package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Api.IdariDataMapper;
import com.Argeloji.Domain.Idari;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Service.Dao;


public class IdariHibernateDataMapper  implements IdariDataMapper{

private final Dao dao;
	
	public IdariHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Idari idari) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(idari);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Idari nesnesini veritabanına ekleyemedi..." +idari.getKullaniciPersonelKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteIdari(Idari idari){
		
		 dao.begin();
	     dao.getSession().delete(idari);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Idari> getListOfIdari(){
		
		ArrayList<Idari> idariler=null;
		
		 dao.begin();
		 idariler = (ArrayList) dao.getSession().createQuery("FROM Idari").list();
	     dao.commit();
	     dao.close();	
		
	     return idariler;
	
	}
	
	
	public Idari getIdariByKod(int kod){
		
		
		dao.begin();
		Idari idari=(Idari) dao.getSession().get(Idari.class, kod);
		dao.commit();
		dao.close();
		
		return idari;			
	  }
	
	
	public List<Idari> getIdariByPersonel(Personel personel){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Idari  where kullaniciPersonelKod=:personel_kod")
				.setParameter("personel_kod",personel.getKullaniciKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	}
	
	public List<Idari> getIdariByGorev(String gorev){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Idari a where a.gorev=:gorev_adi")
		.setParameter("gorev_adi",gorev).list();
		dao.commit();
		dao.close();
		
	    return list;
	}
	
	
	
    public void updateIdari(Idari idari) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(idari);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Idari nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	
	
}
