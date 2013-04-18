package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Domain.Ogrenci;


public interface OgrenciDataMapper {

	void save(Ogrenci ogrenci) throws Exception;
	
	ArrayList<Ogrenci> getListOfOgrenci();
	
	Ogrenci getOgrenciByKod(int kod);
	
	List<Ogrenci> getOgrenciByKullanici(Kullanici kullanici);
	
	void updateOgrenci(Ogrenci ogrenci) throws Exception;
	
	void deleteOgrenci(Ogrenci ogrenci);
	
}
