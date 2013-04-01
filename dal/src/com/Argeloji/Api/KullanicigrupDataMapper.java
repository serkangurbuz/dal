package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Kullanicigrup;


public interface KullanicigrupDataMapper {

	void save(Kullanicigrup kullanicigrup) throws Exception;
	
	ArrayList<Kullanicigrup> getListOfKullanicigrup();
	
	Kullanicigrup getKullanicigrupByKod(int kod);
	
	List getKullanicigrupByTip(String tip);
	
	void updateKullanicigrup(Kullanicigrup kullanicigrup);
	
	void deleteKullanicigrup(Kullanicigrup kullanicigrup);
	
}
