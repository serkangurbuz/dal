package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.OkulpersonelHibernateDataMapper;
import com.Argeloji.DataMapper.SubeHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulpersonel;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Service.DMRegistry;


public class OkulpersonelManager {

	
private final DMRegistry registry;
	
	
	public OkulpersonelManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OkulpersonelHibernateDataMapper getMapper()
	{

		return registry.get(OkulpersonelHibernateDataMapper.class,Okulpersonel.class);
	}
	
	public void save(Okulpersonel os) throws Exception
	{
		
	getMapper().save(os);
	
	}
	
	public void update(Okulpersonel os) throws Exception{
		
		getMapper().update(os);
		
		
	} 

	
	public void delete(Okulpersonel os)
	{
		getMapper().delete(os);
	}
	
	public ArrayList<Okulpersonel> getListOfOkulpersonel(){
		
		
		return getMapper().getListOfOkulpersonel();
		
	}
	

    public List getOkulpersonelByOkul(Okul okul){		
		
		return getMapper().getOkulpersonelByOkul(okul);
		
	}    
    

    public List getOkulpersonelByPersonel(Personel personel){		
		
		return getMapper().getOkulpersonelByPersonel(personel); 
		
	}  
	
	
}
