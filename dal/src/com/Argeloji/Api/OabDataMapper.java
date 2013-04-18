package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Oab;


public interface OabDataMapper {

	void save(Oab oab) throws Exception;
	
	ArrayList<Oab> getListOfOab();
	
	Oab getOabByKod(int kod);
	
	List getOabByAd(String ad);
	
	void updateOab(Oab oab);
	
	void deleteOab(Oab oab);
	
}
