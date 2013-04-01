package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Kullanici;


public interface KullaniciDataMapper {

	void save(Kullanici kullanici) throws Exception;
	
	ArrayList<Kullanici> getListOfKullanici();
	
	Kullanici getKullaniciByKod(int kod);
	
	List getKullaniciByAd(String kullanici_ad);
	
	void updateKullanici(Kullanici kullanici);
	
	void deleteKullanici(Kullanici kullanici);
	
}
