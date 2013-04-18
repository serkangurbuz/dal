package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.DataMapper.AkademikHibernateDataMapper;

import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Service.DMRegistry;


public class AkademikManager {

	
private final DMRegistry registry;
	
	
	public AkademikManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private AkademikHibernateDataMapper getMapper()
	{

		return registry.get(AkademikHibernateDataMapper.class,Akademik.class);
	}
	
	public void save(Akademik akademik) throws Exception
	{
		
	    getMapper().save(akademik);
	
	}
	
	public void updateAkademik(Akademik akademik) throws Exception{
		
		getMapper().updateAkademik(akademik);
	
	} 
	
	public void delete(Akademik akademik)
	{
		getMapper().deleteAkademik(akademik);
	
	}
	
	public ArrayList<Akademik> getListOfAkademik(){
		
		
		return getMapper().getListOfAkademik();		
		
	}
	
    public Akademik getAkademikByKod(int kod){
		
		
		return getMapper().getAkademikByKod(kod);
		
	}
    

    public List<Akademik> getAkademikByPersonel(Personel personel){		
		
		return getMapper().getAkademikByPersonel(personel);
		
	}
    
   public List<Akademik> getAkademikByAlan(String alan_adi){		
		
		return getMapper().getAkademikByAlan(alan_adi);
		
	}
    
    
    
    
    
    
	
	
}
