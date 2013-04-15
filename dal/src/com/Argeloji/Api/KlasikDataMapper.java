package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Coktansecmeli3Tekcevap;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Klasik;
import com.Argeloji.Domain.Soru;
import com.Argeloji.Domain.Uygulama;


public interface KlasikDataMapper {

	void save(Klasik klasik) throws Exception;

	void updateKlasik(Klasik klasik);

	void deleteKlasik(Klasik klasik);
	
	ArrayList<Klasik> getListOfKlasik();
	
	Klasik getKlasikByKod(long klasik_kod);
	
	
}
