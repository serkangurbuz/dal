package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.DersSinifHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Service.DMRegistry;


public class DersSinifManager {

	
private final DMRegistry registry;
	
	
	public DersSinifManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private DersSinifHibernateDataMapper getMapper()
	{

		return registry.get(DersSinifHibernateDataMapper.class,DersSinif.class);
	}
	
	public void save(DersSinif dersSinif) throws Exception
	{
		
	getMapper().save(dersSinif);
	
	}
	
	public void updateDersSinif(DersSinif dersSinif) throws Exception{
		
		getMapper().updateDersSinif(dersSinif);
		
		
	} 

	
	public void delete(DersSinif dersSinif)
	{
		getMapper().deleteDersSinif(dersSinif);
	
	}
	
	public ArrayList<DersSinif> getListOfDersSinif(){
		
		
		return getMapper().getListOfDersSinif();		
		
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
