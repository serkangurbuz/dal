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


public class OkulManager {

private final DMRegistry registry;
	
	
	public OkulManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OkulkademeHibernateDataMapper getMapper()
	{

		return registry.get(OkulkademeHibernateDataMapper.class,Okulkademe.class);
	}
	
	public void save(Okulkademe okulkademe) throws Exception
	{
		
	getMapper().save(okulkademe);
	
	}
	
	public void update(Okulkademe okulkademe) throws Exception{
		
		getMapper().update(okulkademe);
		
		
	} 
	
	public void delete(Okulkademe okulkademe)
	{
		getMapper().delete(okulkademe);
	
	}
	
	public ArrayList<Okulkademe> getListOfOkulkademe(){
		
		
		return getMapper().getListOfOkulkademe();		
		
	}
	
    public Okulkademe getOkulkademeByOkul(Okul okul){
		
		
		return getMapper().getOkulkademeByOkul(okul);
		
	}
    

    public Okulkademe getOkulkademeByKademe(Kademe kademe){
		
		
		return getMapper().getOkulkademeByKademe(kademe);
		
	}
    
    
    
    
    
}
