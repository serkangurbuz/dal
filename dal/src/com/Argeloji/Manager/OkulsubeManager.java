package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.OkulsubeHibernateDataMapper;
import com.Argeloji.DataMapper.SubeHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulsube;
import com.Argeloji.Domain.Sube;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Service.DMRegistry;


public class OkulsubeManager {

	
private final DMRegistry registry;
	
	
	public OkulsubeManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OkulsubeHibernateDataMapper getMapper()
	{

		return registry.get(OkulsubeHibernateDataMapper.class,Okulsube.class);
	}
	
	public void save(Okulsube os) throws Exception
	{
		
	getMapper().save(os);
	
	}
	
	public void update(Okulsube os) throws Exception{
		
		getMapper().update(os);
		
		
	} 

	
	public void delete(Okulsube os)
	{
		getMapper().delete(os);
	}
	
	public ArrayList<Okulsube> getListOfOkulsube(){
		
		
		return getMapper().getListOfOkulsube();		
		
	}
	
    public Okulsube getOkulsubeByKod(int kod){
		
		
		return getMapper().getOkulsubeByKod(kod);
		
	}
    

    public List getOkulsubeByOkul(Okul okul){		
		
		return getMapper().getOkulsubeByOkul(okul); 
		
	}    
    

    public List getOkulsubeBySube(Sube sube){		
		
		return getMapper().getOkulsubeBySube(sube); 
		
	}  
	
	
}
