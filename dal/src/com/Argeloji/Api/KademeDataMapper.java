package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Kademe;


public interface KademeDataMapper {

	void save(Kademe kademe) throws Exception;
	
	ArrayList<Kademe> getListOfKademe();
	
	Kademe getKademeByKod(int kod);
	
	List getKademeByAd(String kademe_ad);
	
	void updateKademe(Kademe kademe);
	
	void deleteKademe(Kademe kademe);
	
}
