package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KulupHibernateDataMapper;
import com.Argeloji.Domain.Kulup;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Service.DMRegistry;


public class KulupManager {

	
private final DMRegistry registry;
	
	
	public KulupManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private KulupHibernateDataMapper getMapper()
	{

		return registry.get(KulupHibernateDataMapper.class,Kulup.class);
	}
	
	public void save(Kulup kulup) throws Exception
	{
		
	getMapper().save(kulup);
	
	}
	
	public void update(Kulup kulup) throws Exception{
		
		getMapper().update(kulup);
		
		
	} 

	
	public void delete(Kulup kulup)
	{
		getMapper().delete(kulup);
	
	}
	
	public ArrayList<Kulup> getListOfKulup(){
		
		
		return getMapper().getListOfKulup();		
		
	}
	
    public Kulup getKulupByKod(int kod){
		
		
		return getMapper().getKulupByKod(kod);
		
	}
    

    public Kulup getKulupByAd(String ad){		
		
		return getMapper().getKulupByAd(ad); 
		
	}    
    

    public List<Kulup> getListofKulupByKademe(Kademe kademe){		
		
		return getMapper().getListofKulupByKademe(kademe); 
		
	}  
	
	
}
