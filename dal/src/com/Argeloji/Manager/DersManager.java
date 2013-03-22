package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.DersHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.DMRegistry;


public class DersManager {

	
private final DMRegistry registry;
	
	
	public DersManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private DersHibernateDataMapper getMapper()
	{

		return registry.get(DersHibernateDataMapper.class,Ders.class);
	}
	
	public void save(Ders ders) throws Exception
	{
		
	getMapper().save(ders);
	
	}
	
	public void updateDers(Ders ders) throws Exception{
		
		getMapper().updateDers(ders);
		
		
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
