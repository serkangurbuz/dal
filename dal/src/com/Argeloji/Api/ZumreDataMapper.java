package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Zumre;


public interface ZumreDataMapper {

	void save(Zumre zumre) throws Exception;
	
	ArrayList<Zumre> getListOfZumre();
	
	Zumre getZumreByKod(int kod);
	
	List getZumreByAlan(String alan);
	
	void updateZumre(Zumre zumre);
	
	void deleteZumre(Zumre zumre);
	
}
