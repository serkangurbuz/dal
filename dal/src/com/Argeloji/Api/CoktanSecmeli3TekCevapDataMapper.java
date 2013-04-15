package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Coktansecmeli3Tekcevap;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Soru;
import com.Argeloji.Domain.Uygulama;


public interface CoktanSecmeli3TekCevapDataMapper {

	void save(Coktansecmeli3Tekcevap coktan_secmeli3_tek_cevap) throws Exception;

	void updateCoktansecmeli3Tekcevap(Coktansecmeli3Tekcevap soru);

	void deleteCoktansecmeli3Tekcevap(Coktansecmeli3Tekcevap soru);
	
	ArrayList<Coktansecmeli3Tekcevap> getListOfCoktansecmeli3Tekcevap();
	
	Coktansecmeli3Tekcevap getCoktansecmeli3TekcevapByKod(long coktan_secmeli3_tek_cevap_kod);
	
	
}
