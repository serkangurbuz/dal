package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.OabHibernateDataMapper;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Service.DMRegistry;


public class OabManager {

	
private final DMRegistry registry;
	
	
	public OabManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OabHibernateDataMapper getMapper()
	{

		return registry.get(OabHibernateDataMapper.class,Oab.class);
	}
	
	public void save(Oab oab) throws Exception
	{
		
	getMapper().save(oab);
	
	}
	
	public void updateOab(Oab oab) throws Exception{
		
		getMapper().updateOab(oab);
		
		
	} 
	
	

	
	public void delete(Oab oab)
	{
		getMapper().deleteOab(oab);
	
	}
	
	public ArrayList<Oab> getListOfOab(){
		
		
		return getMapper().getListOfOab();		
		
	}
	
    public Oab getOabByKod(int kod){
		
		
		return getMapper().getOabByKod(kod);
		
	}
    

    public List<Oab> getOabByAd(String ad){		
		
		return getMapper().getOabByAd(ad);
		
	}
    
    
    
    
    
    
	
	
}
