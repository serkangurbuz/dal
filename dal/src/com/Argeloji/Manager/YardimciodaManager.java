package com.Argeloji.Manager;
import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.YardimciodaHibernateDataMapper;
import com.Argeloji.DataMapper.OkulaltyapiHibernateDataMapper;

import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Yardimcioda;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okulaltyapi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Service.DMRegistry;


public class YardimciodaManager {

private final DMRegistry registry;
	
	
	public YardimciodaManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private YardimciodaHibernateDataMapper getMapper()
	{

		return registry.get(YardimciodaHibernateDataMapper.class,Yardimcioda.class);
	}
	
	public void save(Yardimcioda oda) throws Exception
	{
		
	getMapper().save(oda);
	
	}
	
	public void update(Yardimcioda oda) throws Exception{
		
		getMapper().update(oda);
		
		
	} 
	
	public void delete(Yardimcioda oda)
	{
		getMapper().delete(oda);
	
	}
	
	public ArrayList<Yardimcioda> getListOfYardimcioda(){
		
		
		return getMapper().getListOfYardimcioda();		
		
	}
	public Yardimcioda getYardimciodaByKod(int kod){
		
		return getMapper().getYardimciodaByKod(kod);			
	  }
	
	public Yardimcioda getYardimciodaByAltyapi(Altyapi altyapi)
	{
		return getMapper().getYardimciodaByAltyapi(altyapi);
	}
	
    
    
}
