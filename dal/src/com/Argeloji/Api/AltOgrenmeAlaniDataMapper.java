package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.AltOgrenmeAlani;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.OgrenmeAlani;


public interface AltOgrenmeAlaniDataMapper {

    void save(AltOgrenmeAlani altogrenmeAlani) throws Exception;
	
	ArrayList<AltOgrenmeAlani> getListOfAltOgrenmeAlani();
	
	AltOgrenmeAlani getAltOgrenmeAlaniByKod(int kod);
	
	AltOgrenmeAlani getAltOgrenmeAlaniByAd(String alt_ogrenmeAlani_ad);
	
	void updateAltOgrenmeAlani(AltOgrenmeAlani alt_ogrenme_alani);
	
	void deleteAltOgrenmeAlani(AltOgrenmeAlani alt_ogrenme_alani);	
	
}
