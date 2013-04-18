package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.Date;

import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Domain.Ogrencisube;
import com.Argeloji.Domain.Okulsube;


public interface OgrencisubeDataMapper {

	
	void save(Ogrencisube ogrencisube) throws Exception;
	
	void updateOgrencisube(Ogrencisube ogrencisube) throws Exception;
	
	void deleteOgrencisube(Ogrencisube ogrencisube);
	
	ArrayList<Ogrencisube> getListOfOgrencisube();
	
	ArrayList<Ogrencisube> getOgrencisubeByOkulSube(Okulsube okulsube);
	
	ArrayList<Ogrencisube> getOgrencisubeByOgrenci(Ogrenci ogrenci);
	
	ArrayList<Ogrencisube> getOgrencisubeByOgrenciKod(int veli_kod);
	
	ArrayList<Ogrencisube> getOgrencisubeByOkulSubeKod(int okulsube_kod);
	
	ArrayList<Ogrencisube> getOgrencisubeByOgrenciAd(String ogrenci_ad);
	
	ArrayList<Ogrencisube> getOgrencisubeByOkulSubeAd(String okul_ad,String sube_ad);
	
	ArrayList<Ogrencisube> getOgrencisubeByGirisTarih(Date giris_tarih);
	
}
