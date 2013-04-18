package com.Argeloji.Manager;
import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.IfadeyeteneksinifiHibernateDataMapper;
import com.Argeloji.DataMapper.OkulaltyapiHibernateDataMapper;

import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Faaliyetsinifi;
import com.Argeloji.Domain.Ifadeyeteneksinifi;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okulaltyapi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Service.DMRegistry;


public class IfadeyeteneksinifiManager {

private final DMRegistry registry;
	
	
	public IfadeyeteneksinifiManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private IfadeyeteneksinifiHibernateDataMapper getMapper()
	{

		return registry.get(IfadeyeteneksinifiHibernateDataMapper.class,Ifadeyeteneksinifi.class);
	}
	
	public void save(Ifadeyeteneksinifi sinif) throws Exception
	{
		
	getMapper().save(sinif);
	
	}
	
	public void update(Ifadeyeteneksinifi sinif) throws Exception{
		
		getMapper().update(sinif);
		
		
	} 
	
	public void delete(Ifadeyeteneksinifi sinif)
	{
		getMapper().delete(sinif);
	
	}
	
	public ArrayList<Ifadeyeteneksinifi> getListOfIfadeyeteneksinifi(){
		
		
		return getMapper().getListOfIfadeyeteneksinifi();		
		
	}
	public Ifadeyeteneksinifi getIfadeyeteneksinifiByKod(int kod){
		
		return getMapper().getIfadeyeteneksinifiByKod(kod);			
	  }
	
	public Ifadeyeteneksinifi getIfadeyeteneksinifiByAltyapi(Altyapi altyapi)
	{
		return getMapper().getIfadeyeteneksinifiByAltyapi(altyapi);
	}
	
    
    
}
