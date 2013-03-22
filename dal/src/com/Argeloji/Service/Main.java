package com.Argeloji.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.Argeloji.Api.DersDataMapper;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.DersSinifId;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Manager.DersManager;
import com.Argeloji.Manager.DersSinifManager;
import com.Argeloji.Manager.KademeManager;
import com.Argeloji.Manager.SinifManager;

public class Main {

	
	
	public static void main(String[] args) throws Exception {
	
		
		
		HibernateTemplateDMRegistry a=new HibernateTemplateDMRegistry();
		KademeManager km=new KademeManager(a);
		DersManager dm=new DersManager(a);
		SinifManager sm=new SinifManager(a);		
		DersSinifManager dsm=new DersSinifManager(a);	
	
         Ders ders= dm.getDersByAd("Fen Bilgisi").get(0);
		 Sinif sinif= sm.getSinifByAd("2. Sınıf").get(0);
	
	    int b =sinif.getDersSinifs().size();
	    
	    
	   
	    for (Iterator<DersSinif> it = sinif.getDersSinifs().iterator(); it.hasNext(); ) {
	        DersSinif f = it.next();
	        String ad= f.getSinif().getAd();
	        int y=5;
	       
	    }
	    //Commit main 
	    //ozgun comment
	    
		 
	     

	    

	     
	     
		
		 
		 
		// System.out.print("SERKAN"+ dersSinifs.size());
		 sm.updateSinif(sinif);
		 
		 
		 
		 
		//ArrayList<DersSinif> dss= dsm.getListOfSinif();
		
		
		
		//DersSinif ds= dss.get(12);
		
		
		
	
	/*	DersSinifId id= ds.getId();
		id.setSinifKod(sinif.getKod());
		
		ds.setSinif(sinif);
		ds.setId(id);*/
		

	
		
		//dsm.updateDersSinif(ds);
		
		
		
		
		
		 
		/*DersSinif ds=new DersSinif();
		 ds.setDers(ders);
		 ds.setSinif(sinif);
		 DersSinifId id=new DersSinifId();
		 id.setDersKod(ders.getKod());
		 id.setSinifKod(sinif.getKod());
		 ds.setId(id);
		 dsm.updateDersSinif(ds);*/
		
	
		
		
	
		System.out.println("main git deneme");
		System.out.println("galatasaray");
		
	//	user=manager.load("15");

	}

}
