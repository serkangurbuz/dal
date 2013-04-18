package com.Argeloji.Api;

import java.util.ArrayList;

import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Ders;


public interface AltyapiDataMapper {
	void save(Altyapi altyapi)throws Exception;
	void update(Altyapi altyapi) throws Exception;
	void delete(Altyapi altyapi);
	ArrayList<Altyapi> getListOfAltyapi();
	Altyapi getAltyapiByKod(int kod);
}
