package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.DMRegistry;


public class KademeManager {

	
private final DMRegistry registry;
	
	
	public KademeManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private KademeHibernateDataMapper getMapper()
	{

		return registry.get(KademeHibernateDataMapper.class,Kademe.class);
	}
	
	public void save(Kademe kademe) throws Exception
	{
		
	getMapper().save(kademe);
	
	}
	
	public void updateKademe(Kademe kademe) throws Exception{
		
		getMapper().updateKademe(kademe);
		
		
	} 
	
	

	
	public void delete(Kademe kademe)
	{
		getMapper().deleteKademe(kademe);
	
	}
	
	public ArrayList<Kademe> getListOfKademe(){
		
		
		return getMapper().getListOfKademe();		
		
	}
	
    public Kademe getKademeByKod(int kod){
		
		
		return getMapper().getKademeByKod(kod);
		
	}
    

    public List<Kademe> getKademeByAd(String kademe_ad){		
		
		return getMapper().getKademeByAd(kademe_ad);
		
	}
    
    
    
    
    
    
	
	
}
