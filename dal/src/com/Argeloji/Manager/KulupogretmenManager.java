package com.Argeloji.Manager;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.DataMapper.KulupogretmenHibernateDataMapper;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Kulup;
import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.Kulupogretmen;
import com.Argeloji.Service.DMRegistry;


public class KulupogretmenManager {

	
private final DMRegistry registry;
	
	
	public KulupogretmenManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private KulupogretmenHibernateDataMapper getMapper()
	{

		return registry.get(KulupogretmenHibernateDataMapper.class,Kulupogretmen.class);
	}
	
	public void save(Kulupogretmen os) throws Exception
	{
		
	getMapper().save(os);
	
	}
	
	public void update(Kulupogretmen os) throws Exception{
		
		getMapper().update(os);
		
		
	} 

	
	public void delete(Kulupogretmen os)
	{
		getMapper().delete(os);
	}
	
	public ArrayList<Kulupogretmen> getListOfKulupogretmen(){
		
		
		return getMapper().getListOfKulupogretmen();		
		
	}
    

    public List getKulupogretmenByKulup(Kulup kulup){		
		
		return getMapper().getListofKulupOgretmenByKulup(kulup);
		
	}    
    

    public List getKulupogretmenByOgretmen(Akademik akademik){		
		
		return getMapper().getListofKulupOgretmenByOgretmen(akademik); 
		
	}  
	
	
}
