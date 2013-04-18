package com.Argeloji.Api;

import java.util.ArrayList;

import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Ders;


public interface AdresDataMapper {
	void save(Adres adres)throws Exception;
	void update(Adres adres) throws Exception;
	void delete(Adres adres);
	ArrayList<Adres> getListOfAdres();
	Adres getAdresByKod(long kod);
}
