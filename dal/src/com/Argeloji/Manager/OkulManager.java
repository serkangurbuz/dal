package com.Argeloji.Manager;
import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.OkulHibernateDataMapper;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Service.DMRegistry;


public class OkulManager {

private final DMRegistry registry;
	
	
	public OkulManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OkulHibernateDataMapper getMapper()
	{

		return registry.get(OkulHibernateDataMapper.class,Okul.class);
	}
	
	public void save(Okul okul) throws Exception
	{
		
	getMapper().save(okul);
	
	}
	
	public void update(Okul okul) throws Exception{
		
		getMapper().update(okul);
		
		
	} 
	
	public void delete(Okul okul)
	{
		getMapper().delete(okul);
	
	}
	
	public ArrayList<Okul> getListOfOkul(){
		
		
		return getMapper().getListOfOkul();		
		
	}
	
    public Okul getOkulByKod(int kod){
		
		
		return getMapper().getOkulByKod(kod);
		
	}
    

    public Okul getOkulByAd(String ad){		
		
		return getMapper().getOkulByAd(ad);
		
	}
    
    
    
    
    
}
