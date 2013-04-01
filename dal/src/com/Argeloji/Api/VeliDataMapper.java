package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Domain.Kullanici;
import com.Argeloji.Domain.Veli;


public interface VeliDataMapper {

	void save(Veli veli) throws Exception;
	
	ArrayList<Veli> getListOfVeli();
	
	Veli getVeliByKod(int kod);
	
	List<Veli> getVeliByKullanici(Kullanici kullanici);
	
	void updateVeli(Veli veli) throws Exception;
	
	void deleteVeli(Veli veli);
	
}
