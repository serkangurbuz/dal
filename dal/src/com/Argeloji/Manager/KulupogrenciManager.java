package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KulupogrenciHibernateDataMapper;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Kulup;
import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Domain.Kulupogrenci;
import com.Argeloji.Service.DMRegistry;


public class KulupogrenciManager {

	
private final DMRegistry registry;
	
	
	public KulupogrenciManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private KulupogrenciHibernateDataMapper getMapper()
	{

		return registry.get(KulupogrenciHibernateDataMapper.class,Kulupogrenci.class);
	}
	
	public void save(Kulupogrenci os) throws Exception
	{
		
	getMapper().save(os);
	
	}
	
	public void update(Kulupogrenci os) throws Exception{
		
		getMapper().update(os);
		
		
	} 

	
	public void delete(Kulupogrenci os)
	{
		getMapper().delete(os);
	}
	
	public ArrayList<Kulupogrenci> getListOfKulupogrenci(){
		
		
		return getMapper().getListOfKulupogrenci();		
		
	}
    

    public List getKulupogrenciByKulup(Kulup kulup){		
		
		return getMapper().getListofKulupogrenciByKulup(kulup);
		
	}    
    

    public List getKulupogrenciByOgrenci(Ogrenci ogrenci){		
		
		return getMapper().getListofKulupogrenciByOgrenci(ogrenci); 
		
	}  
	
	
}
