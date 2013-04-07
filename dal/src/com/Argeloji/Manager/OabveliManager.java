package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Argeloji.DataMapper.DersSinifHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.OabveliHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Oabveli;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Service.DMRegistry;


public class OabveliManager {

	
private final DMRegistry registry;
	
	
	public OabveliManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OabveliHibernateDataMapper getMapper()
	{

		return registry.get(OabveliHibernateDataMapper.class,Oabveli.class);
	}
	
	public void save(Oabveli oabveli) throws Exception
	{
		
	getMapper().save(oabveli);
	
	}
	
	public void updateOabveli(Oabveli oabveli) throws Exception{
		
		getMapper().updateOabveli(oabveli);
		
		
	} 

	
	public void delete(Oabveli oabveli)
	{
		getMapper().deleteOabveli(oabveli);
	
	}
	
	public ArrayList<Oabveli> getListOfOabveli(){
		
		
		return getMapper().getListOfOabveli();		
		
	}
    public ArrayList<Oabveli> getOabveliByOab(Oab oab){
		
		
		return getMapper().getOabveliByOab(oab);		
		
	}
    public ArrayList<Oabveli> getOabveliByVeli(Veli veli){
				
  		return getMapper().getOabveliByVeli(veli);		
  		
  	}
    
  	 public ArrayList<Oabveli> getOabveliByVeliKod(int veli_kod){
		
  		return getMapper().getOabveliByVeliKod(veli_kod);		
  		
  	}
  	
    public ArrayList<Oabveli> getOabveliByOabKod(int oab_kod){
		
  		return getMapper().getOabveliByOabKod(oab_kod);		
  		
  	}
    public ArrayList<Oabveli> getOabveliByVeliAd(String veli_ad){
		
  		return getMapper().getOabveliByVeliAd(veli_ad);		
  		
  	}
    public ArrayList<Oabveli> getOabveliByOabAd(String oab_ad){
		
  		return getMapper().getOabveliByVeliAd(oab_ad);	
  		
  	}
    public ArrayList<Oabveli> getOabveliByGirisTarih(Date giris_tarih){
		
  		return getMapper().getOabveliByGirisTarih(giris_tarih);	
  		
  	}
}
