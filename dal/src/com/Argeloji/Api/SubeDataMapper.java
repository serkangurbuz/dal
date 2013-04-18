package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Domain.Sinif;
import com.Argeloji.Domain.Sube;


public interface SubeDataMapper {

	void save(Sube sube) throws Exception;
	
	ArrayList<Sube> getListOfSube();
	
	Sube getSubeByKod(int kod);
	
	List getSubeByAd(String ad);
	
	void update(Sube sube) throws Exception;
	
	void delete(Sube sube);
	
	List<Sube> getSubeBySinif(Sinif sinif) ;
	
	
}
