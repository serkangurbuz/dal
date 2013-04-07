package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Argeloji.DataMapper.DersSinifHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.OabveliHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.DataMapper.VeliokulHibernateDataMapper;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Oabveli;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Domain.Veliokul;
import com.Argeloji.Service.DMRegistry;


public class VeliokulManager {

	
private final DMRegistry registry;
	
	
	public VeliokulManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private VeliokulHibernateDataMapper getMapper()
	{

		return registry.get(VeliokulHibernateDataMapper.class,Veliokul.class);
	}
	
	public void save(Veliokul veliokul) throws Exception
	{
		
	getMapper().save(veliokul);
	
	}
	
	public void updateVeliokul(Veliokul veliokul) throws Exception{
		
		getMapper().updateVeliokul(veliokul);
		
		
	} 

	
	public void delete(Veliokul veliokul)
	{
		getMapper().deleteVeliokul(veliokul);
	
	}
	
	public ArrayList<Veliokul> getListOfVeliokul(){
		
		
		return getMapper().getListOfVeliokul();		
		
	}
    public ArrayList<Veliokul> getVeliokulByOkul(Okul okul){
		
		
		return getMapper().getVeliokulByOkul(okul);		
		
	}
    public ArrayList<Veliokul> getVeliokulByVeli(Veli veli){
				
  		return getMapper().getVeliokulByVeli(veli);		
  		
  	}
    
  	 public ArrayList<Veliokul> getVeliokulByVeliKod(int veli_kod){
		
  		return getMapper().getVeliokulByVeliKod(veli_kod);		
  		
  	}
  	
    public ArrayList<Veliokul> getVeliokulByOkulKod(int okul_kod){
		
  		return getMapper().getVeliokulByOkulKod(okul_kod);		
  		
  	}
    public ArrayList<Veliokul> getVeliokulByVeliAd(String veli_ad){
		
  		return getMapper().getVeliokulByVeliAd(veli_ad);		
  		
  	}
    public ArrayList<Veliokul> getVeliokulByOkulAd(String okul_ad){
		
  		return getMapper().getVeliokulByVeliAd(okul_ad);	
  		
  	}
    public ArrayList<Veliokul> getVeliokulByGirisTarih(Date giris_tarih){
		
  		return getMapper().getVeliokulByGirisTarih(giris_tarih);	
  		
  	}
}
