package com.Argeloji.Manager;
import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.OkulHibernateDataMapper;
import com.Argeloji.DataMapper.OkulkademeHibernateDataMapper;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulkademe;
import com.Argeloji.Service.DMRegistry;


public class OkulkademeManager {

private final DMRegistry registry;
	
	
	public OkulkademeManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OkulkademeHibernateDataMapper getMapper()
	{

		return registry.get(OkulkademeHibernateDataMapper.class,Okulkademe.class);
	}
	
	public void save(Okulkademe okul) throws Exception
	{
		
		getMapper().save(okul);
	
	}
	
	public void update(Okulkademe okul) throws Exception{
		
		getMapper().update(okul);
		
		
	} 
	
	public void delete(Okulkademe okul)
	{
		getMapper().delete(okul);
	
	}
	
	public ArrayList<Okulkademe> getListOfOkulkademe(){
		
		
		return getMapper().getListOfOkulkademe();
		
	}
	
    public Okulkademe getOkulkademeByKod(Okul okul){
		
		
		return getMapper().getOkulkademeByOkul(okul);
		
	}
    

    public Okulkademe getOkulkademeByKademe(Kademe kademe){	
		
		return getMapper().getOkulkademeByKademe(kademe);
		
	}
    
    
    
    
    
}
