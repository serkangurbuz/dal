package com.Argeloji.Api;

import java.util.ArrayList;

import com.Argeloji.Domain.Adres;
import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulgrubu;
import com.Argeloji.Domain.Ozelokul;


public interface OkulgrubuDataMapper {
	void save(Okulgrubu og)throws Exception;
	void update(Okulgrubu og) throws Exception;
	void delete(Okulgrubu og);
	ArrayList<Okulgrubu> getListOfOkulgrubu();
	Okulgrubu getOkulgrubuByOkul(Okul okul);
	Okulgrubu getOkulgrubuByOzelokul(Ozelokul ozelokul);
}
