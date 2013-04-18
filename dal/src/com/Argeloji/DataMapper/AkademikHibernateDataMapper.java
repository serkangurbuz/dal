package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Api.AkademikDataMapper;
import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Service.Dao;


public class AkademikHibernateDataMapper  implements AkademikDataMapper{

private final Dao dao;
	
	public AkademikHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Akademik akademik) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(akademik);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Akademik nesnesini veritabanına ekleyemedi..." +akademik.getKullaniciPersonelKod(), e);
			// TODO: handle exception
		}
			
		}
	

	
	
	public void deleteAkademik(Akademik akademik){
		
		 dao.begin();
	     dao.getSession().delete(akademik);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Akademik> getListOfAkademik(){
		
		ArrayList<Akademik> akademikler=null;
		
		 dao.begin();
		 akademikler = (ArrayList) dao.getSession().createQuery("FROM Akademik").list();
	     dao.commit();
	     dao.close();	
		
	     return akademikler;
	
	}
	
	
	public Akademik getAkademikByKod(int kod){
		
		
		dao.begin();
		Akademik akademik=(Akademik) dao.getSession().get(Akademik.class, kod);
		dao.commit();
		dao.close();
		
		return akademik;			
	  }
	
	
	public List<Akademik> getAkademikByPersonel(Personel personel){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Akademik  where kullaniciPersonelKod=:personel_kod")
				.setParameter("personel_kod",personel.getKullaniciKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	}
	
	public List<Akademik> getAkademikByAlan(String alan_adi){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Akademik a where a.alan=:alan_adi")
		.setParameter("alan_adi",alan_adi).list();
		dao.commit();
		dao.close();
		
	    return list;
	}
	
	
	
    public void updateAkademik(Akademik akademik) throws Exception{
		
		try {
		
		dao.begin();		
		dao.getSession().update(akademik);
		dao.commit();
		dao.close();
		
	} catch (Exception e) {
		dao.rollback();
		throw new Exception("...HATA: Akademik nesnesini veritabaninda Güncellenemedi...");
		// TODO: handle exception
	}
		
		
	}
	
	
	
	
}
