package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Argeloji.DataMapper.DersSinifHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.OabveliHibernateDataMapper;
import com.Argeloji.DataMapper.OkulogrenciHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Oabveli;
import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulogrenci;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Service.DMRegistry;


public class OkulogrenciManager {

	
private final DMRegistry registry;
	
	
	public OkulogrenciManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private OkulogrenciHibernateDataMapper getMapper()
	{

		return registry.get(OkulogrenciHibernateDataMapper.class,Okulogrenci.class);
	}
	
	public void save(Okulogrenci okulogrenci) throws Exception
	{
		
	getMapper().save(okulogrenci);
	
	}
	
	public void updateOkulogrenci(Okulogrenci okulogrenci) throws Exception{
		
		getMapper().updateOkulogrenci(okulogrenci);
		
		
	} 

	
	public void delete(Okulogrenci okulogrenci)
	{
		getMapper().deleteOkulogrenci(okulogrenci);
	
	}
	
	public ArrayList<Okulogrenci> getListOfOkulogrenci(){
		
		
		return getMapper().getListOfOkulogrenci();		
		
	}
    public ArrayList<Okulogrenci> getOkulogrenciByOkul(Okul okul){
		
		
		return getMapper().getOkulogrenciByOkul(okul);		
		
	}
    public ArrayList<Okulogrenci> getOkulogrenciByOgrenci(Ogrenci ogrenci){
				
  		return getMapper().getOkulogrenciByOgrenci(ogrenci);		
  		
  	}
    
  	 public ArrayList<Okulogrenci> getOkulogrenciByOgrenciKod(int ogrenci_kod){
		
  		return getMapper().getOkulogrenciByOgrenciKod(ogrenci_kod);		
  		
  	}
  	
    public ArrayList<Okulogrenci> getOkulogrenciByOkulKod(int okul_kod){
		
  		return getMapper().getOkulogrenciByOkulKod(okul_kod);		
  		
  	}
    public ArrayList<Okulogrenci> getOkulogrenciByOkulAd(String okul_ad){
		
  		return getMapper().getOkulogrenciByOkulAd(okul_ad);		
  		
  	}
    public ArrayList<Okulogrenci> getOkulogrenciByOgrenciAd(String ogrenci_ad){
		
  		return getMapper().getOkulogrenciByOgrenciAd(ogrenci_ad);	
  		
  	}
    public ArrayList<Okulogrenci> getOkulogrenciByGirisTarih(Date giris_tarih){
		
  		return getMapper().getOkulogrenciByGirisTarih(giris_tarih);	
  		
  	}
}
