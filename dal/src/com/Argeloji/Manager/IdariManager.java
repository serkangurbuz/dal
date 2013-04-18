package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.IdariHibernateDataMapper;

import com.Argeloji.Domain.Idari;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Service.DMRegistry;


public class IdariManager {

	
private final DMRegistry registry;
	
	
	public IdariManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private IdariHibernateDataMapper getMapper()
	{

		return registry.get(IdariHibernateDataMapper.class,Idari.class);
	}
	
	public void save(Idari idari) throws Exception
	{
		
	    getMapper().save(idari);
	
	}
	
	public void updateIdari(Idari idari) throws Exception{
		
		getMapper().updateIdari(idari);
	
	} 
	
	public void delete(Idari idari)
	{
		getMapper().deleteIdari(idari);
	
	}
	
	public ArrayList<Idari> getListOfIdari(){
		
		
		return getMapper().getListOfIdari();		
		
	}
	
    public Idari getIdariByKod(int kod){
		
		
		return getMapper().getIdariByKod(kod);
		
	}
    

    public List<Idari> getIdariByPersonel(Personel personel){		
		
		return getMapper().getIdariByPersonel(personel);
		
	}
    
   public List<Idari> getIdariByGorev(String gorev){		
		
		return getMapper().getIdariByGorev(gorev);
		
	}
    
    
    
    
    
    
	
	
}
