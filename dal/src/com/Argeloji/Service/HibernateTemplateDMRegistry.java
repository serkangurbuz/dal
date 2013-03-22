package com.Argeloji.Service;

import com.Argeloji.DataMapper.AdresHibernateDataMapper;
import com.Argeloji.DataMapper.DersHibernateDataMapper;
import com.Argeloji.DataMapper.DersSinifHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Sinif;



public class HibernateTemplateDMRegistry  extends AbstractDMRegistry {

	Dao dao=new Dao();	
    
	
	public HibernateTemplateDMRegistry()
	
	{
		
	add(User.class,new UserHibernateDataMapper(dao));
	add(Kademe.class,new KademeHibernateDataMapper(dao));
	add(Ders.class,new DersHibernateDataMapper(dao));
	add(Sinif.class,new SinifHibernateDataMapper(dao));
	add(DersSinif.class,new DersSinifHibernateDataMapper(dao));
	add(Adres.class,new AdresHibernateDataMapper(dao));

	}

	
}
