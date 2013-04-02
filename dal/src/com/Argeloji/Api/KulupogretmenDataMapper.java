package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Akademik;
import com.Argeloji.Domain.Kulup;
import com.Argeloji.Domain.Kulupogretmen;


public interface KulupogretmenDataMapper {
	void save(Kulupogretmen ko)throws Exception;
	void update(Kulupogretmen ko) throws Exception;
	void delete(Kulupogretmen ko);
	ArrayList<Kulupogretmen> getListOfKulupogretmen();
	List getListofKulupOgretmenByOgretmen(Akademik akademik);
	List getListofKulupOgretmenByKulup(Kulup kulup);
}
