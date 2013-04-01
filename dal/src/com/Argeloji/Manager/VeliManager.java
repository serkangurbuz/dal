package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.VeliHibernateDataMapper;

import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Service.DMRegistry;


public class VeliManager {

	
private final DMRegistry registry;
	
	
	public VeliManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private VeliHibernateDataMapper getMapper()
	{

		return registry.get(VeliHibernateDataMapper.class,Veli.class);
	}
	
	public void save(Veli veli) throws Exception
	{
		
	getMapper().save(veli);
	
	}
	
	public void updateVeli(Veli veli) throws Exception{
		
		getMapper().updateVeli(veli);
	
	} 
	
	public void delete(Veli veli)
	{
		getMapper().deleteVeli(veli);
	
	}
	
	public ArrayList<Veli> getListOfVeli(){
		
		
		return getMapper().getListOfVeli();		
		
	}
	
    public Veli getVeliByKod(int kod){
		
		
		return getMapper().getVeliByKod(kod);
		
	}
    

    public List<Veli> getVeliByKullanici(Kullanici kullanici){		
		
		return getMapper().getVeliByKullanici(kullanici);
		
	}
    
    
    
    
    
    
	
	
}
