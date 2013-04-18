package com.Argeloji.Api;

import java.util.ArrayList;


import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Faaliyetsinifi;
import com.Argeloji.Domain.Ifadeyeteneksinifi;




public interface IfadeyeteneksinifiDataMapper {
	void save(Ifadeyeteneksinifi sinif)throws Exception;
	void update(Ifadeyeteneksinifi sinif) throws Exception;
	void delete(Ifadeyeteneksinifi sinif);
	ArrayList<Ifadeyeteneksinifi> getListOfIfadeyeteneksinifi();
	Ifadeyeteneksinifi getIfadeyeteneksinifiByKod(int kod);
	Ifadeyeteneksinifi getIfadeyeteneksinifiByAltyapi(Altyapi altyapi);
}
