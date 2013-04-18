package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.Date;


import com.Argeloji.DataMapper.OgrencisubeHibernateDataMapper;
import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Domain.Ogrencisube;
import com.Argeloji.Domain.Okulsube;
import com.Argeloji.Service.DMRegistry;


public class OgrencisubeManager {

	
private final DMRegistry registry;
	
	
	public OgrencisubeManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OgrencisubeHibernateDataMapper getMapper()
	{

		return registry.get(OgrencisubeHibernateDataMapper.class,Ogrencisube.class);
	}
	
	public void save(Ogrencisube ogrencisube) throws Exception
	{
		
	getMapper().save(ogrencisube);
	
	}
	
	public void updateOgrencisube(Ogrencisube ogrencisube) throws Exception{
		
		getMapper().updateOgrencisube(ogrencisube);
		
		
	} 

	
	public void delete(Ogrencisube ogrencisube)
	{
		getMapper().deleteOgrencisube(ogrencisube);
	
	}
	
	public ArrayList<Ogrencisube> getListOfOgrencisube(){
		
		
		return getMapper().getListOfOgrencisube();		
		
	}
    public ArrayList<Ogrencisube> getOgrencisubeByOgrenci(Ogrenci ogrenci){
		
		
		return getMapper().getOgrencisubeByOgrenci(ogrenci);		
		
	}
    public ArrayList<Ogrencisube> getOgrencisubeByOkulSube(Okulsube okulsube){
				
  		return getMapper().getOgrencisubeByOkulSube(okulsube);		
  		
  	}
    
  	 public ArrayList<Ogrencisube> getOgrencisubeByOgrenciKod(int ogrenci_kod){
		
  		return getMapper().getOgrencisubeByOgrenciKod(ogrenci_kod);		
  		
  	}
  	
    public ArrayList<Ogrencisube> getOgrencisubeByOkulSubeKod(int okulsube_kod){
		
  		return getMapper().getOgrencisubeByOkulSubeKod(okulsube_kod);		
  		
  	}
    public ArrayList<Ogrencisube> getOgrencisubeByOgrenciAd(String ogrenci_ad){
		
  		return getMapper().getOgrencisubeByOgrenciAd(ogrenci_ad);		
  		
  	}
    public ArrayList<Ogrencisube> getOgrencisubeByOkulSubeAd(String okul_ad,String sube_ad){
		
  		return getMapper().getOgrencisubeByOkulSubeAd(okul_ad,sube_ad);	
  		
  	}
    public ArrayList<Ogrencisube> getOgrencisubeByGirisTarih(Date giris_tarih){
		
  		return getMapper().getOgrencisubeByGirisTarih(giris_tarih);	
  		
  	}
}
