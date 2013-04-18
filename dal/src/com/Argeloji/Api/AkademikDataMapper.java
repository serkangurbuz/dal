package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.Personel;


public interface AkademikDataMapper {

	void save(Akademik akademik) throws Exception;
	
	ArrayList<Akademik> getListOfAkademik();
	
	Akademik getAkademikByKod(int kod);
	
	List<Akademik> getAkademikByPersonel(Personel personel);
	
	List<Akademik> getAkademikByAlan(String alan_adi);
	
	void updateAkademik(Akademik akademik) throws Exception;
	
	void deleteAkademik(Akademik akademik);
	
}
