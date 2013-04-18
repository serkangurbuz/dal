package com.Argeloji.Manager;
import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.OkulHibernateDataMapper;
import com.Argeloji.DataMapper.OkulgrubuHibernateDataMapper;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulgrubu;
import com.Argeloji.Domain.Ozelokul;
import com.Argeloji.Service.DMRegistry;


public class OkulgrubuManager {

private final DMRegistry registry;
	
	
	public OkulgrubuManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OkulgrubuHibernateDataMapper getMapper()
	{

		return registry.get(OkulgrubuHibernateDataMapper.class,Okulgrubu.class);
	}
	
	public void save(Okulgrubu og) throws Exception
	{
		
	getMapper().save(og);
	
	}
	
	public void update(Okulgrubu og) throws Exception{
		
		getMapper().update(og);
		
		
	} 
	
	public void delete(Okulgrubu og)
	{
		getMapper().delete(og);
	
	}
	
	public ArrayList<Okulgrubu> getListOfOkulgrubu(){
		
		
		return getMapper().getListOfOkulgrubu();		
		
	}
	
	public Okulgrubu getOkulgrubuByOkul(Okul okul){
		
		
		return getMapper().getOkulgrubuByOkul(okul);
		
	}
    

	public Okulgrubu getOkulgrubuByOzelokul(Ozelokul ozelokul){		
		
		return getMapper().getOkulgrubuByOzelokul(ozelokul);
		
	}
    
    
    
    
    
}
