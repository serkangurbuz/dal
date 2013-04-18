package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.Date;

import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.Zumre;
import com.Argeloji.Domain.Zumreogretmen;


public interface ZumreogretmenDataMapper {

	
	void save(Zumreogretmen zumreogretmen) throws Exception;
	
	void updateZumreogretmen(Zumreogretmen zumreogretmen) throws Exception;
	
	void deleteZumreogretmen(Zumreogretmen zumreogretmen);
	
	ArrayList<Zumreogretmen> getListOfZumreogretmen();
	
	ArrayList<Zumreogretmen> getZumreogretmenByZumre(Zumre zumre);
	
	ArrayList<Zumreogretmen> getZumreogretmenByOgretmen(Akademik akademik);
	
	ArrayList<Zumreogretmen> getZumreogretmenByZumreKod(int zumre_kod);
	
	ArrayList<Zumreogretmen> getZumreogretmenByOgretmenKod(int akademik_kod);
	
	ArrayList<Zumreogretmen> getZumreogretmenByZumreAd(String zumre_ad);
	
	ArrayList<Zumreogretmen> getZumreogretmenByOgretmenAd(String akademik_ad);
	
	ArrayList<Zumreogretmen> getZumreogretmenByGirisTarih(Date giris_tarih);
	
}
