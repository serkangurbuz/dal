package com.Argeloji.Api;

import java.util.ArrayList;


import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Faaliyetsinifi;
import com.Argeloji.Domain.Yardimcioda;




public interface YardimciodaDataMapper {
	void save(Yardimcioda oda)throws Exception;
	void update(Yardimcioda oda) throws Exception;
	void delete(Yardimcioda oda);
	ArrayList<Yardimcioda> getListOfYardimcioda();
	Yardimcioda getYardimciodaByKod(int kod);
	Yardimcioda getYardimciodaByAltyapi(Altyapi altyapi);
}
