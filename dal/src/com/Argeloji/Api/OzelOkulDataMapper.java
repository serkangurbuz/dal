package com.Argeloji.Api;

import java.util.ArrayList;


import com.Argeloji.Domain.Ozelokul;


public interface OzelOkulDataMapper {
	void save(Ozelokul okul)throws Exception;
	void update(Ozelokul okul) throws Exception;
	void delete(Ozelokul okul);
	ArrayList<Ozelokul> getListOfOzelokul();
	Ozelokul getOzelokulByKod(int kod);
}
