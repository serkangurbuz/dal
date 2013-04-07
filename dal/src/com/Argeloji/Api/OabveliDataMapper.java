package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.Date;

import com.Argeloji.Domain.Oab;
import com.Argeloji.Domain.Oabveli;
import com.Argeloji.Domain.Veli;


public interface OabveliDataMapper {

	
	void save(Oabveli oabveli) throws Exception;
	
	void updateOabveli(Oabveli oabveli) throws Exception;
	
	void deleteOabveli(Oabveli oabveli);
	
	ArrayList<Oabveli> getListOfOabveli();
	
	ArrayList<Oabveli> getOabveliByOab(Oab oab);
	
	ArrayList<Oabveli> getOabveliByVeli(Veli veli);
	
	ArrayList<Oabveli> getOabveliByVeliKod(int veli_kod);
	
	ArrayList<Oabveli> getOabveliByOabKod(int oab_kod);
	
	ArrayList<Oabveli> getOabveliByVeliAd(String veli_ad);
	
	ArrayList<Oabveli> getOabveliByOabAd(String oab_ad);
	
	ArrayList<Oabveli> getOabveliByGirisTarih(Date giris_tarih);
	
}
