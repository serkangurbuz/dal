package com.Argeloji.DataMapper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.Argeloji.Api.OkulpersonelDataMapper;
import com.Argeloji.Domain.Okulpersonel;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Service.Dao;

public class OkulpersonelHibernateDataMapper implements OkulpersonelDataMapper{

	
private final Dao dao;
	
	public OkulpersonelHibernateDataMapper(Dao dao)
	{
		this.dao = dao;
	}
	
	public void save(Okulpersonel os) throws Exception
	{
		try {
	     dao.begin();
	     dao.getSession().saveOrUpdate(os);
	     dao.commit();
	     dao.close();
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA: Okulpersonel nesnesini veritabanına ekleyemedi..." +os.getOkul().getKod(), e);
			// TODO: handle exception
		}
			
		}
	


	
	public void delete(Okulpersonel os){
		
		 dao.begin();
	     dao.getSession().delete(os);
	     dao.commit();
	     dao.close();	
		
	
	}	
	
	public ArrayList<Okulpersonel> getListOfOkulpersonel(){
		
		ArrayList<Okulpersonel> personeller=null;
		
		 dao.begin();
		 personeller = (ArrayList) dao.getSession().createQuery("FROM Okulpersonel").list();
	     dao.commit();
	     dao.close();	
		
	     return personeller;
	
	}
	
	
	public List getOkulpersonelByOkul(Okul okul){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Okulpersonel  where okul_kod=:okulKod")
				.setParameter("okulKod",okul.getKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	  }
	
	public List getOkulpersonelByPersonel(Personel personel){
		
		
		dao.begin();
		List list= dao.getSession().createQuery("FROM Okulpersonel  where personel_kod=:personelKod")
				.setParameter("personelKod",personel.getKullaniciKod()).list();
		dao.commit();
		dao.close();		
	    return list;	
	  }
	
	
	
	public void update(Okulpersonel os) throws Exception{
		try {
			
			dao.begin();		
			dao.getSession().update(os);
			dao.commit();
			dao.close();
			
		} catch (Exception e) {
			dao.rollback();
			throw new Exception("...HATA:Okulpersonel nesnesini veritabaninda Güncellenemedi..." +os.getOkul().getKod());
			// TODO: handle exception
		
	
		
		}
	}

}

