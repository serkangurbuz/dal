package com.Argeloji.Manager;
import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.LabratuarHibernateDataMapper;
import com.Argeloji.DataMapper.OkulaltyapiHibernateDataMapper;

import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Labratuar;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okulaltyapi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Service.DMRegistry;


public class LabratuarManager {

private final DMRegistry registry;
	
	
	public LabratuarManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private LabratuarHibernateDataMapper getMapper()
	{

		return registry.get(LabratuarHibernateDataMapper.class,Labratuar.class);
	}
	
	public void save(Labratuar lab) throws Exception
	{
		
	getMapper().save(lab);
	
	}
	
	public void update(Labratuar lab) throws Exception{
		
		getMapper().update(lab);
		
		
	} 
	
	public void delete(Labratuar lab)
	{
		getMapper().delete(lab);
	
	}
	
	public ArrayList<Labratuar> getListOfLabratuar(){
		
		
		return getMapper().getListOfLabratuar();	
		
	}
	public Labratuar getLabratuarByKod(int kod){
		
		return getMapper().getLabratuarByKod(kod);	
	  }
	
	public Labratuar getLabratuarByAltyapi(Altyapi altyapi)
	{
		return getMapper().getLabratuarByAltyapi(altyapi);
	}
	
    
    
}
