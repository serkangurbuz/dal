package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Personel;
import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Yonetim;
import com.Argeloji.Domain.Yonetimpersonel;


public interface YonetimpersonelDataMapper {

	
	void save(Yonetimpersonel yonetimpersonel) throws Exception;
	
	void updateYonetimpersonel(Yonetimpersonel yonetimpersonel) throws Exception;
	
	void deleteYonetimpersonel(Yonetimpersonel yonetimpersonel);
	
	ArrayList<Yonetimpersonel> getListOfYonetimpersonel();
	
	ArrayList<Yonetimpersonel> getYonetimpersonelByYonetim(Yonetim yonetim);
	
	ArrayList<Yonetimpersonel> getYonetimpersonelByPersonel(Personel personel);
	
	ArrayList<Yonetimpersonel> getYonetimpersonelByYonetimKod(int yonetim_kod);
	
	ArrayList<Yonetimpersonel> getYonetimpersonelByPersonelKod(int personel_kod);
	
	ArrayList<Yonetimpersonel> getYonetimpersonelByYonetimAd(String yonetim_ad);
	
	ArrayList<Yonetimpersonel> getYonetimpersonelByPersonelAd(String personel_ad);
	
	ArrayList<Yonetimpersonel> getYonetimpersonelByGirisTarih(Date giris_tarih);
	
	
}
