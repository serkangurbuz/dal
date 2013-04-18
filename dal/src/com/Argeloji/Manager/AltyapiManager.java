package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.AltyapiHibernateDataMapper;

import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.DMRegistry;


public class AltyapiManager {

	
private final DMRegistry registry;
	
	
	public AltyapiManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private AltyapiHibernateDataMapper getMapper()
	{

		return registry.get(AltyapiHibernateDataMapper.class,Altyapi.class);
	}
	
	public void save(Altyapi altyapi) throws Exception
	{
		
	getMapper().save(altyapi);
	
	}
	
	public void update(Altyapi altyapi)throws Exception
	{
		getMapper().update(altyapi);
	}
	

	
	public void delete(Altyapi altyapi)
	{
		getMapper().delete(altyapi);
	
	}
	
	public ArrayList<Altyapi> getListOfAltyapi(){
		
		
		return getMapper().getListOfAltyapi();	
		
	}
	
    public Altyapi getAltyapiByKod(int kod){
		
		
		return getMapper().getAltyapiByKod(kod);
		
	}
    
    
    
    
    
	
	
}
