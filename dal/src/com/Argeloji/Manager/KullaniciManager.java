package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KullaniciHibernateDataMapper;
import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Service.DMRegistry;


public class KullaniciManager {

	
private final DMRegistry registry;
	
	
	public KullaniciManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private KullaniciHibernateDataMapper getMapper()
	{

		return registry.get(KullaniciHibernateDataMapper.class,Kullanici.class);
	}
	
	public void save(Kullanici kullanici) throws Exception
	{
		
	getMapper().save(kullanici);
	
	}
	
	public void updateKullanici(Kullanici kullanici) throws Exception{
		
		getMapper().updateKullanici(kullanici);
		
		
	} 
	
	

	
	public void delete(Kullanici kullanici)
	{
		getMapper().deleteKullanici(kullanici);
	
	}
	
	public ArrayList<Kullanici> getListOfKullanici(){
		
		
		return getMapper().getListOfKullanici();		
		
	}
	
    public Kullanici getKullaniciByKod(int kod){
		
		
		return getMapper().getKullaniciByKod(kod);
		
	}
    

    public List<Kullanici> getKullaniciByAd(String kullanici_ad){		
		
		return getMapper().getKullaniciByAd(kullanici_ad);
		
	}
    
    
    
    
    
    
	
	
}
