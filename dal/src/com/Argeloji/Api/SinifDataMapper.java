package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Sinif;


public interface SinifDataMapper {

	void save(Sinif sinif) throws Exception;
	
	ArrayList<Sinif> getListOfSinif();
	
	Sinif getSinifByKod(int kod);
	
	List getSinifByAd(String sinif_ad);
	
	void updateSinif(Sinif sinif) throws Exception;
	
	void deleteSinif(Sinif sinif);
	
	List<Sinif> getSinifByKademe(Kademe kademe) ;
	
	
}
