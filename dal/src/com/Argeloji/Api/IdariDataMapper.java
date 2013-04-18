package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.Idari;
import com.Argeloji.Domain.Personel;


public interface IdariDataMapper {

	void save(Idari idari) throws Exception;
	
	ArrayList<Idari> getListOfIdari();
	
	Idari getIdariByKod(int kod);
	
	List<Idari> getIdariByPersonel(Personel personel);
	
	List<Idari> getIdariByGorev(String gorev);
	
	void updateIdari(Idari idari) throws Exception;
	
	void deleteIdari(Idari idari);
	
}
