package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.OgrenciHibernateDataMapper;

import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Service.DMRegistry;


public class OgrenciManager {

	
private final DMRegistry registry;
	
	
	public OgrenciManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OgrenciHibernateDataMapper getMapper()
	{

		return registry.get(OgrenciHibernateDataMapper.class,Ogrenci.class);
	}
	
	public void save(Ogrenci ogrenci) throws Exception
	{
		
	getMapper().save(ogrenci);
	
	}
	
	public void updateOgrenci(Ogrenci ogrenci) throws Exception{
		
		getMapper().updateOgrenci(ogrenci);
	
	} 
	
	public void delete(Ogrenci ogrenci)
	{
		getMapper().deleteOgrenci(ogrenci);
	
	}
	
	public ArrayList<Ogrenci> getListOfOgrenci(){
		
		
		return getMapper().getListOfOgrenci();		
		
	}
	
    public Ogrenci getOgrenciByKod(int kod){
		
		
		return getMapper().getOgrenciByKod(kod);
		
	}
    

    public List<Ogrenci> getOgrenciByKullanici(Kullanici kullanici){		
		
		return getMapper().getOgrenciByKullanici(kullanici);
		
	}
    
    
    
    
    
    
	
	
}
