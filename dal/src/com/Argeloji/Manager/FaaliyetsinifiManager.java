package com.Argeloji.Manager;
import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.FaaliyetsinifiHibernateDataMapper;
import com.Argeloji.DataMapper.OkulaltyapiHibernateDataMapper;

import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Faaliyetsinifi;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okulaltyapi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Service.DMRegistry;


public class FaaliyetsinifiManager {

private final DMRegistry registry;
	
	
	public FaaliyetsinifiManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private FaaliyetsinifiHibernateDataMapper getMapper()
	{

		return registry.get(FaaliyetsinifiHibernateDataMapper.class,Faaliyetsinifi.class);
	}
	
	public void save(Faaliyetsinifi sinif) throws Exception
	{
		
	getMapper().save(sinif);
	
	}
	
	public void update(Faaliyetsinifi sinif) throws Exception{
		
		getMapper().update(sinif);
		
		
	} 
	
	public void delete(Faaliyetsinifi sinif)
	{
		getMapper().delete(sinif);
	
	}
	
	public ArrayList<Faaliyetsinifi> getListOfFaaliyetsinifi(){
		
		
		return getMapper().getListOfFaaliyetsinifi();		
		
	}
	public Faaliyetsinifi getFaaliyetsinifiByKod(int kod){
		
		return getMapper().getFaaliyetsinifiByKod(kod);			
	  }
	
	public Faaliyetsinifi getFaaliyetsinifiByAltyapi(Altyapi altyapi)
	{
		return getMapper().getFaaliyetsinifiByAltyapi(altyapi);
	}
	
    
    
}
