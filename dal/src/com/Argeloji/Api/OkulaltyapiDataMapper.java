package com.Argeloji.Api;

import java.util.ArrayList;

import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulaltyapi;


public interface OkulaltyapiDataMapper {
	void save(Okulaltyapi oa)throws Exception;
	void update(Okulaltyapi oa) throws Exception;
	void delete(Okulaltyapi oa);
	ArrayList<Okulaltyapi> getListOfOkulaltyapi();
	Okulaltyapi getOkulAltyapiByOkul(Okul okul);
	Okulaltyapi getOkulAltyapiByAltyapi(Altyapi altyapi);
}
