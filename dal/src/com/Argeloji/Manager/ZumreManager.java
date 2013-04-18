package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.ZumreHibernateDataMapper;
import com.Argeloji.Domain.Zumre;
import com.Argeloji.Service.DMRegistry;


public class ZumreManager {

	
private final DMRegistry registry;
	
	
	public ZumreManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private ZumreHibernateDataMapper getMapper()
	{

		return registry.get(ZumreHibernateDataMapper.class,Zumre.class);
	}
	
	public void save(Zumre zumre) throws Exception
	{
		
	getMapper().save(zumre);
	
	}
	
	public void updateZumre(Zumre zumre) throws Exception{
		
		getMapper().updateZumre(zumre);
		
		
	} 
	

	
	public void delete(Zumre zumre)
	{
		getMapper().deleteZumre(zumre);
	
	}
	
	public ArrayList<Zumre> getListOfZumre(){
		
		
		return getMapper().getListOfZumre();		
		
	}
	
    public Zumre getZumreByKod(int kod){
		
		
		return getMapper().getZumreByKod(kod);
		
	}
    

    public List<Zumre> getZumreByAlan(String alan){		
		
		return getMapper().getZumreByAlan(alan);
		
	}
    
    
    
    
    
    
	
	
}
