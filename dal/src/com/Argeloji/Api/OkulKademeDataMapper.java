package com.Argeloji.Api;

import java.util.ArrayList;

import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Kademe;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulkademe;


public interface OkulKademeDataMapper {
	void save(Okulkademe ok)throws Exception;
	void update(Okulkademe ok) throws Exception;
	void delete(Okulkademe ok);
	ArrayList<Okulkademe> getListOfOkulkademe();
	Okulkademe getOkulkademeByOkul(Okul okul);
	Okulkademe getOkulkademeByKademe(Kademe kademe);
}
