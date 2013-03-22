package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.DersSinif;
import com.Argeloji.Domain.Kademe;


public interface DersDataMapper {

void save(Ders ders) throws Exception;
	
	ArrayList<Ders> getListOfDers();
	
	Ders getDersByKod(int kod);
	
	List getDersByAd(String ders_ad);
	
	void updateDers(Ders ders);
	
	void deleteDers(Ders ders);
	
	
	
}
