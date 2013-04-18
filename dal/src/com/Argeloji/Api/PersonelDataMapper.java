package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Domain.Personel;


public interface PersonelDataMapper {

	void save(Personel personel) throws Exception;
	
	ArrayList<Personel> getListOfPersonel();
	
	Personel getPersonelByKod(int kod);
	
	List<Personel> getPersonelByKullanici(Kullanici kullanici);
	
	void updatePersonel(Personel personel) throws Exception;
	
	void deletePersonel(Personel personel);
	
}
