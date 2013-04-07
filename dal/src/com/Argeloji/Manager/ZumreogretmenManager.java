package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Argeloji.DataMapper.DersSinifHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.OabveliHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.DataMapper.ZumreogretmenHibernateDataMapper;
import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Oabveli;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Domain.Zumre;
import com.Argeloji.Domain.Zumreogretmen;
import com.Argeloji.Service.DMRegistry;


public class ZumreogretmenManager {

	
private final DMRegistry registry;
	
	
	public ZumreogretmenManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private ZumreogretmenHibernateDataMapper getMapper()
	{

		return registry.get(ZumreogretmenHibernateDataMapper.class,Zumreogretmen.class);
	}
	
	public void save(Zumreogretmen zumreogretmen) throws Exception
	{
		
	getMapper().save(zumreogretmen);
	
	}
	
	public void updateZumreogretmen(Zumreogretmen zumreogretmen) throws Exception{
		
		getMapper().updateZumreogretmen(zumreogretmen);
		
		
	} 

	
	public void delete(Zumreogretmen zumreogretmen)
	{
		getMapper().deleteZumreogretmen(zumreogretmen);
	
	}
	
	public ArrayList<Zumreogretmen> getListOfZumreogretmen(){
		
		
		return getMapper().getListOfZumreogretmen();		
		
	}
    public ArrayList<Zumreogretmen> getZumreogretmenByZumre(Zumre zumre){
		
		
		return getMapper().getZumreogretmenByZumre(zumre);		
		
	}
    public ArrayList<Zumreogretmen> getZumreogretmenByOgretmen(Akademik akademik){
				
  		return getMapper().getZumreogretmenByOgretmen(akademik);		
  		
  	}
    
  	 public ArrayList<Zumreogretmen> getZumreogretmenByOgretmenKod(int akademik_kod){
		
  		return getMapper().getZumreogretmenByOgretmenKod(akademik_kod);		
  		
  	}
  	
    public ArrayList<Zumreogretmen> getZumreogretmenByZumreKod(int zumre_kod){
		
  		return getMapper().getZumreogretmenByZumreKod(zumre_kod);		
  		
  	}
    public ArrayList<Zumreogretmen> getZumreogretmenByZumreAd(String zumre_ad){
		
  		return getMapper().getZumreogretmenByZumreAd(zumre_ad);		
  		
  	}
    public ArrayList<Zumreogretmen> getZumreogretmenByOgretmenAd(String akademik_ad){
		
  		return getMapper().getZumreogretmenByOgretmenAd(akademik_ad);	
  		
  	}
    public ArrayList<Zumreogretmen> getZumreogretmenByGirisTarih(Date giris_tarih){
		
  		return getMapper().getZumreogretmenByGirisTarih(giris_tarih);	
  		
  	}
}
