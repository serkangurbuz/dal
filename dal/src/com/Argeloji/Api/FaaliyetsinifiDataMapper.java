package com.Argeloji.Api;

import java.util.ArrayList;


import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Faaliyetsinifi;




public interface FaaliyetsinifiDataMapper {
	void save(Faaliyetsinifi sinif)throws Exception;
	void update(Faaliyetsinifi sinif) throws Exception;
	void delete(Faaliyetsinifi sinif);
	ArrayList<Faaliyetsinifi> getListOfFaaliyetsinifi();
	Faaliyetsinifi getFaaliyetsinifiByKod(int kod);
	Faaliyetsinifi getFaaliyetsinifiByAltyapi(Altyapi altyapi);
}
