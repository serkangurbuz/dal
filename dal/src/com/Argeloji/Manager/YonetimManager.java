package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.OabHibernateDataMapper;
import com.Argeloji.DataMapper.YonetimHibernateDataMapper;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Yonetim;
import com.Argeloji.Service.DMRegistry;


public class YonetimManager {

	
private final DMRegistry registry;
	
	
	public YonetimManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private YonetimHibernateDataMapper getMapper()
	{

		return registry.get(YonetimHibernateDataMapper.class,Yonetim.class);
	}
	
	public void save(Yonetim yonetim) throws Exception
	{
		
	getMapper().save(yonetim);
	
	}
	
	public void updateYonetim(Yonetim yonetim) throws Exception{
		
		getMapper().updateYonetim(yonetim);
		
		
	} 
	
	

	
	public void delete(Yonetim yonetim)
	{
		getMapper().deleteYonetim(yonetim);
	
	}
	
	public ArrayList<Yonetim> getListOfYonetim(){
		
		
		return getMapper().getListOfYonetim();		
		
	}
	
    public Yonetim getYonetimByKod(int kod){
		
		
		return getMapper().getYonetimByKod(kod);
		
	}
    

   /* public List<Oab> getOabByAd(String ad){		
		
		return getMapper().getOabByAd(ad);
		
	}
    */
    
    
    
    
    
	
	
}
