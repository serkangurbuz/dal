package com.Argeloji.Manager;
import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.OkulaltyapiHibernateDataMapper;

import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okulaltyapi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Service.DMRegistry;


public class OkulaltyapiManager {

private final DMRegistry registry;
	
	
	public OkulaltyapiManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OkulaltyapiHibernateDataMapper getMapper()
	{

		return registry.get(OkulaltyapiHibernateDataMapper.class,Okulaltyapi.class);
	}
	
	public void save(Okulaltyapi oa) throws Exception
	{
		
	getMapper().save(oa);
	
	}
	
	public void update(Okulaltyapi oa) throws Exception{
		
		getMapper().update(oa);
		
		
	} 
	
	public void delete(Okulaltyapi oa)
	{
		getMapper().delete(oa);
	
	}
	
	public ArrayList<Okulaltyapi> getListOfOkulaltyapi(){
		
		
		return getMapper().getListOfOkulaltyapi();		
		
	}
	
    public Okulaltyapi getOkulaltyapiByOkul(Okul okul){
		
		
		return getMapper().getOkulAltyapiByOkul(okul);
		
	}
    

    public Okulaltyapi getOkulaltyapiByAltyapi(Altyapi altyapi){
		
		
		return getMapper().getOkulAltyapiByAltyapi(altyapi);
		
	}
    
    
    
    
    
}
