package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Etkinlik;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Uygulama;


public interface EtkinlikDataMapper {

	void save(Etkinlik etkinlik) throws Exception;
	
	void updateEtkinlik(Etkinlik etkinlik) throws Exception;
	
	void deleteEtkinlik(Etkinlik etkinlik);
	
	ArrayList<Etkinlik> getListOfEtkinlik();
	
	Etkinlik getEtkinlikByKod(long etkinlik_kod);
	
	List getEtkinlikByAd(String etkinlik_ad);	
	
	List getEtkinlikByUygulama(Uygulama uygulama);
	
	
}
