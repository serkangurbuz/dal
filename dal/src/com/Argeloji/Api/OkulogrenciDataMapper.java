package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.Date;

import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulogrenci;



public interface OkulogrenciDataMapper {

	
	void save(Okulogrenci okulogrenci) throws Exception;
	
	void updateOkulogrenci(Okulogrenci okulogrenci) throws Exception;
	
	void deleteOkulogrenci(Okulogrenci okulogrenci);
	
	ArrayList<Okulogrenci> getListOfOkulogrenci();
	
	ArrayList<Okulogrenci> getOkulogrenciByOkul(Okul okul);
	
	ArrayList<Okulogrenci> getOkulogrenciByOgrenci(Ogrenci ogrenci);
	
	ArrayList<Okulogrenci> getOkulogrenciByOkulKod(int okul_kod);
	
	ArrayList<Okulogrenci> getOkulogrenciByOgrenciKod(int ogrenci_kod);
	
	ArrayList<Okulogrenci> getOkulogrenciByOkulAd(String okul_ad);
	
	ArrayList<Okulogrenci> getOkulogrenciByOgrenciAd(String ogrenci_ad);
	
	ArrayList<Okulogrenci> getOkulogrenciByGirisTarih(Date giris_tarih);
	
}
