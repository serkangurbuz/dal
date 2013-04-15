package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Coktansecmeli3Tekcevap;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Dogruyanlis;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Soru;
import com.Argeloji.Domain.Uygulama;


public interface DogruYanlisDataMapper {

	void save(Dogruyanlis dogru_yanlis) throws Exception;

	void updateDogruyanlis(Dogruyanlis dogru_yanlis);

	void deleteDogruyanlis(Dogruyanlis dogru_yanlis);
	
	ArrayList<Dogruyanlis> getListOfDogruYanlis();
	
	Dogruyanlis getDogruyanlisByKod(long  dogru_yanlis_kod);
	
	
}
