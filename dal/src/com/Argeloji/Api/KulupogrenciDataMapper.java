package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;

import com.Argeloji.Domain.Ogrenci;
import com.Argeloji.Domain.Kulup;
import com.Argeloji.Domain.Kulupogrenci;


public interface KulupogrenciDataMapper {
	void save(Kulupogrenci ko)throws Exception;
	void update(Kulupogrenci ko) throws Exception;
	void delete(Kulupogrenci ko);
	ArrayList<Kulupogrenci> getListOfKulupogrenci();
	List getListofKulupogrenciByOgrenci(Ogrenci ogrenci);
	List getListofKulupogrenciByKulup(Kulup kulup);
}
