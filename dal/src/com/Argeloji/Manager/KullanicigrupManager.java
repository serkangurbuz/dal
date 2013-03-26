package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KullanicigrupHibernateDataMapper;
import com.Argeloji.Domain.Kullanicigrup;
import com.Argeloji.Service.DMRegistry;


public class KullanicigrupManager {

	
private final DMRegistry registry;
	
	
	public KullanicigrupManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private KullanicigrupHibernateDataMapper getMapper()
	{

		return registry.get(KullanicigrupHibernateDataMapper.class,Kullanicigrup.class);
	}
	
	public void save(Kullanicigrup kullanicigrup) throws Exception
	{
		
	getMapper().save(kullanicigrup);
	
	}
	
	public void updateKullanicigrup(Kullanicigrup kullanicigrup) throws Exception{
		
		getMapper().updateKullanicigrup(kullanicigrup);
		
		
	} 
	
	

	
	public void delete(Kullanicigrup kullanicigrup)
	{
		getMapper().deleteKullanicigrup(kullanicigrup);
	
	}
	
	public ArrayList<Kullanicigrup> getListOfKullanicigrup(){
		
		
		return getMapper().getListOfKullanicigrup();		
		
	}
	
    public Kullanicigrup getKullanicigrupByKod(int kod){
		
		
		return getMapper().getKullanicigrupByKod(kod);
		
	}
    

    public List<Kullanicigrup> getKullanicigrupByTip(String tip){		
		
		return getMapper().getKullanicigrupByTip(tip);
		
	}
    
    
    
    
    
    
	
	
}
