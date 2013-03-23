package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Ders;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Kulup;


public interface KulupDataMapper {
	void save(Kulup kulup)throws Exception;
	void update(Kulup kulup) throws Exception;
	void delete(Kulup kulup);
	ArrayList<Kulup> getListOfKulup();
	Kulup getKulupByKod(int kod);
	Kulup getKulupByAd(String ad);
	List getListofKulupByKademe(Kademe kademe);
}
