package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Service.DMRegistry;


public class SinifManager {

	
private final DMRegistry registry;
	
	
	public SinifManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private SinifHibernateDataMapper getMapper()
	{

		return registry.get(SinifHibernateDataMapper.class,Sinif.class);
	}
	
	public void save(Sinif sinif) throws Exception
	{
		
	getMapper().save(sinif);
	
	}
	
	public void updateSinif(Sinif sinif) throws Exception{
		
		getMapper().updateSinif(sinif);
		
		
	} 

	
	public void delete(Sinif sinif)
	{
		getMapper().deleteSinif(sinif);
	
	}
	
	public ArrayList<Sinif> getListOfSinif(){
		
		
		return getMapper().getListOfSinif();		
		
	}
	
    public Sinif getSinifByKod(int kod){
		
		
		return getMapper().getSinifByKod(kod);
		
	}
    

    public List<Sinif> getSinifByAd(String sinif_ad){		
		
		return getMapper().getSinifByAd(sinif_ad); 
		
	}    
    

    public List<Sinif> getSinifByKademe(Kademe kademe){		
		
		return getMapper().getSinifByKademe(kademe); 
		
	}  
	
	
}
