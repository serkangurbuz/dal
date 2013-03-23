package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.OzelokulHibernateDataMapper;

import com.Argeloji.Domain.Ozelokul;

import com.Argeloji.Service.DMRegistry;


public class OzelokulManager {

	
private final DMRegistry registry;
	
	
	public OzelokulManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OzelokulHibernateDataMapper getMapper()
	{

		return registry.get(OzelokulHibernateDataMapper.class,Ozelokul.class);
	}
	
	public void save(Ozelokul okul) throws Exception
	{
		
	getMapper().save(okul);
	
	}
	
	public void update(Ozelokul okul)throws Exception
	{
		getMapper().update(okul);
	}
	

	
	public void delete(Ozelokul okul)
	{
		getMapper().delete(okul);
	
	}
	
	public ArrayList<Ozelokul> getListOfOzelokul(){
		
		
		return getMapper().getListOfOzelokul();	
		
	}
	
    public Ozelokul getOzelokulByKod(int kod){
		
		
		return getMapper().getOzelokulByKod(kod);
		
	}
    
    
    
    
    
	
	
}
