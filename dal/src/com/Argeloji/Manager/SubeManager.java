package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.SubeHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.Domain.Sube;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Service.DMRegistry;


public class SubeManager {

	
private final DMRegistry registry;
	
	
	public SubeManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private SubeHibernateDataMapper getMapper()
	{

		return registry.get(SubeHibernateDataMapper.class,Sube.class);
	}
	
	public void save(Sube sube) throws Exception
	{
		
	getMapper().save(sube);
	
	}
	
	public void update(Sube sube) throws Exception{
		
		getMapper().update(sube);
		
		
	} 

	
	public void delete(Sube sube)
	{
		getMapper().delete(sube);
	
	}
	
	public ArrayList<Sube> getListOfSube(){
		
		
		return getMapper().getListOfSube();		
		
	}
	
    public Sube getSubeByKod(int kod){
		
		
		return getMapper().getSubeByKod(kod);
		
	}
    

    public List<Sube> getSubeByAd(String ad){		
		
		return getMapper().getSubeByAd(ad); 
		
	}    
    

    public List<Sube> getSubeBySinif(Sinif sinif){		
		
		return getMapper().getSubeBySinif(sinif); 
		
	}  
	
	
}
