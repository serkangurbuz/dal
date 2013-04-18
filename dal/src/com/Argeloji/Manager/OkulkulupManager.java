package com.Argeloji.Manager;
import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.OkulHibernateDataMapper;
import com.Argeloji.DataMapper.OkulkulupHibernateDataMapper;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulkulup;
import com.Argeloji.Service.DMRegistry;


public class OkulkulupManager {

private final DMRegistry registry;
	
	
	public OkulkulupManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OkulkulupHibernateDataMapper getMapper()
	{

		return registry.get(OkulkulupHibernateDataMapper.class,Okulkulup.class);
	}
	
	public void save(Okulkulup ok) throws Exception
	{
		
		getMapper().save(ok);
	
	}
	
	public void update(Okulkulup ok) throws Exception{
		
		getMapper().update(ok);
		
		
	} 
	
	public void delete(Okulkulup ok)
	{
		getMapper().delete(ok);
	}
	
	public ArrayList<Okulkulup> getListOfOkulkulup(){
		
		
		return getMapper().getListOfOkulkulup();		
		
	}
	
    public Okulkulup getOkulkulupByKod(int kod){
		
		
		return getMapper().getOkulkulupByKod(kod);
		
	}
    public Okulkulup getOkulByOkul(Okul okul){
    	return getMapper().getOkulByOkul(okul);
    }
    
    
    
    
    
}
