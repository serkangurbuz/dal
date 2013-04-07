package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.Date;

import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Veli;
import com.Argeloji.Domain.Veliokul;


public interface VeliokulDataMapper {

	
	void save(Veliokul veliokul) throws Exception;
	
	void updateVeliokul(Veliokul veliokul) throws Exception;
	
	void deleteVeliokul(Veliokul veliokul);
	
	ArrayList<Veliokul> getListOfVeliokul();
	
	ArrayList<Veliokul> getVeliokulByOkul(Okul okul);
	
	ArrayList<Veliokul> getVeliokulByVeli(Veli veli);
	
	ArrayList<Veliokul> getVeliokulByVeliKod(int veli_kod);
	
	ArrayList<Veliokul> getVeliokulByOkulKod(int okul_kod);
	
	ArrayList<Veliokul> getVeliokulByVeliAd(String veli_ad);
		
	ArrayList<Veliokul> getVeliokulByGirisTarih(Date giris_tarih);
	
}
