package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.AdresHibernateDataMapper;
import com.Argeloji.DataMapper.DersHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.DMRegistry;


public class AdresManager {

	
private final DMRegistry registry;
	
	
	public AdresManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private AdresHibernateDataMapper getMapper()
	{

		return registry.get(AdresHibernateDataMapper.class,Adres.class);
	}
	
	public void save(Adres adres) throws Exception
	{
		
	getMapper().save(adres);
	
	}
	
	
	

	
	public void delete(Ders ders)
	{
		getMapper().deleteDers(ders);
	
	}
	
	public ArrayList<Ders> getListOfDers(){
		
		
		return getMapper().getListOfDers();		
		
	}
	
    public Ders getDersByKod(int kod){
		
		
		return getMapper().getDersByKod(kod);
		
	}
    

    public List<Ders> getDersByAd(String ders_ad){		
		
		return getMapper().getDersByAd(ders_ad);
		
	}
    
    
    
    
    
    
	
	
}
