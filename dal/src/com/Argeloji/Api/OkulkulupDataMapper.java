package com.Argeloji.Api;

import java.util.ArrayList;

import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulkulup;


public interface OkulkulupDataMapper {
	void save(Okulkulup ok)throws Exception;
	void update(Okulkulup ok) throws Exception;
	void delete(Okulkulup ok);
	ArrayList<Okulkulup> getListOfOkulkulup();
	Okulkulup getOkulkulupByKod(int kod);
	Okulkulup getOkulByOkul(Okul okul);
}
