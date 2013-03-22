package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Sinif;


public interface DersSinifDataMapper {

	
	void save(DersSinif dersSinif) throws Exception;
	
	void updateDersSinif(DersSinif dersSinif) throws Exception;
	
	void deleteDersSinif(DersSinif dersSinif);
	
	ArrayList<DersSinif> getListOfDersSinif();
	
	ArrayList<DersSinif> getDersSinifByDers(Ders ders);
	
	ArrayList<DersSinif> getDersSinifBySinif(Sinif sinif);
	
	ArrayList<DersSinif> getDersSinifBySinifKod(int sinif_kod);
	
	ArrayList<DersSinif> getDersSinifByDersKod(int ders_kod);
	
	ArrayList<DersSinif> getDersSinifByDersAd(String ders_ad);
	
	ArrayList<DersSinif> getDersSinifByDersKod(String ders_ad);
	
}
