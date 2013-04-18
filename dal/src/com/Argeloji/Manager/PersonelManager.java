package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.PersonelHibernateDataMapper;

import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Service.DMRegistry;


public class PersonelManager {

	
private final DMRegistry registry;
	
	
	public PersonelManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private PersonelHibernateDataMapper getMapper()
	{

		return registry.get(PersonelHibernateDataMapper.class,Personel.class);
	}
	
	public void save(Personel personel) throws Exception
	{
		
	getMapper().save(personel);
	
	}
	
	public void updatePersonel(Personel personel) throws Exception{
		
		getMapper().updatePersonel(personel);
	
	} 
	
	public void delete(Personel personel)
	{
		getMapper().deletePersonel(personel);
	
	}
	
	public ArrayList<Personel> getListOfPersonel(){
		
		
		return getMapper().getListOfPersonel();		
		
	}
	
    public Personel getPersonelByKod(int kod){
		
		
		return getMapper().getPersonelByKod(kod);
		
	}
    

    public List<Personel> getPersonelByKullanici(Kullanici kullanici){		
		
		return getMapper().getPersonelByKullanici(kullanici);
		
	}
    
    
    
    
    
    
	
	
}
