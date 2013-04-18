package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.AdresHibernateDataMapper;
import com.Argeloji.DataMapper.DersHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.DMRegistry;


public class AdresManager {

	
private final DMRegistry registry;
	
	
	public AdresManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private AdresHibernateDataMapper getMapper()
	{

		return registry.get(AdresHibernateDataMapper.class,Adres.class);
	}
	
	public void save(Adres adres) throws Exception
	{
		
	getMapper().save(adres);
	
	}
	
	public void update(Adres adres)throws Exception
	{
		getMapper().update(adres);
	}
	

	
	public void delete(Adres adres)
	{
		getMapper().delete(adres);
	
	}
	
	public ArrayList<Adres> getListOfAdres(){
		
		
		return getMapper().getListOfAdres();	
		
	}
	
    public Adres getAdresByKod(int kod){
		
		
		return getMapper().getAdresByKod(kod);
		
	}
    
    
    
    
    
	
	
}
