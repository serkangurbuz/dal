package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Argeloji.DataMapper.DersSinifHibernateDataMapper;
import com.Argeloji.DataMapper.KademeHibernateDataMapper;
import com.Argeloji.DataMapper.OabveliHibernateDataMapper;
import com.Argeloji.DataMapper.SinifHibernateDataMapper;
import com.Argeloji.DataMapper.YonetimpersonelHibernateDataMapper;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Oabveli;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Domain.Yonetim;
import com.Argeloji.Domain.Yonetimpersonel;
import com.Argeloji.Service.DMRegistry;


public class YonetimpersonelManager {

	
private final DMRegistry registry;
	
	
	public YonetimpersonelManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private YonetimpersonelHibernateDataMapper getMapper()
	{

		return registry.get(YonetimpersonelHibernateDataMapper.class,Yonetimpersonel.class);
	}
	
	public void save(Yonetimpersonel yonetimpersonel) throws Exception
	{
		
	getMapper().save(yonetimpersonel);
	
	}
	
	public void updateYonetimpersonel(Yonetimpersonel yonetimpersonel) throws Exception{
		
		getMapper().updateYonetimpersonel(yonetimpersonel);
		
		
	} 

	
	public void delete(Yonetimpersonel yonetimpersonel)
	{
		getMapper().deleteYonetimpersonel(yonetimpersonel);
	
	}
	
	public ArrayList<Yonetimpersonel> getListOfYonetimpersonel(){
		
		
		return getMapper().getListOfYonetimpersonel();		
		
	}
    public ArrayList<Yonetimpersonel> getYonetimpersonelByYonetim(Yonetim yonetim){
		
		
		return getMapper().getYonetimpersonelByYonetim(yonetim);		
		
	}
    public ArrayList<Yonetimpersonel> getYonetimpersonelByPersonel(Personel personel){
				
  		return getMapper().getYonetimpersonelByPersonel(personel);		
  		
  	}
    
  	 public ArrayList<Yonetimpersonel> getYonetimpersonelByYonetimKod(int yonetim_kod){
		
  		return getMapper().getYonetimpersonelByYonetimKod(yonetim_kod);		
  		
  	}
  	
    public ArrayList<Yonetimpersonel> getYonetimpersonelByPersonelKod(int personel_kod){
		
  		return getMapper().getYonetimpersonelByPersonelKod(personel_kod);		
  		
  	}
    public ArrayList<Yonetimpersonel> getYonetimpersonelByPersonelAd(String personel_ad){
		
  		return getMapper().getYonetimpersonelByPersonelAd(personel_ad);		
  		
  	}
    public ArrayList<Yonetimpersonel> getYonetimpersonelByYonetimAd(String yonetim_ad){
		
  		return getMapper().getYonetimpersonelByYonetimAd(yonetim_ad);	
  		
  	}
    public ArrayList<Yonetimpersonel> getYonetimpersonelByGirisTarih(Date giris_tarih){
		
  		return getMapper().getYonetimpersonelByGirisTarih(giris_tarih);	
  		
  	}
}
