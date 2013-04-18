package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulsube;
import com.Argeloji.Domain.Sube;


public interface OkulSubeDataMapper {
	void save(Okulsube os)throws Exception;
	void update(Okulsube os) throws Exception;
	void delete(Okulsube os);
	ArrayList<Okulsube> getListOfOkulsube();
	Okulsube getOkulsubeByKod(int kod);
	List<Okulsube> getOkulsubeByOkul(Okul okul);
	List<Okulsube> getOkulsubeBySube(Sube sube);
}
