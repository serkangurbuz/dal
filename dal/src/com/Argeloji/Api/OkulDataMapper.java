package com.Argeloji.Api;

import java.util.ArrayList;

import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Okul;


public interface OkulDataMapper {
	void save(Okul okul)throws Exception;
	void update(Okul okul) throws Exception;
	void delete(Okul okul);
	ArrayList<Okul> getListOfOkul();
	Okul getOkulByKod(int kod);
	Okul getOkulByAd(String ad);
}
