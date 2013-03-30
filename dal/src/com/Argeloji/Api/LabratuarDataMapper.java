package com.Argeloji.Api;

import java.util.ArrayList;


import com.Argeloji.Domain.Altyapi;
import com.Argeloji.Domain.Labratuar;




public interface LabratuarDataMapper {
	void save(Labratuar lab)throws Exception;
	void update(Labratuar lab) throws Exception;
	void delete(Labratuar lab);
	ArrayList<Labratuar> getListOfLabratuar();
	Labratuar getLabratuarByKod(int kod);
	Labratuar getLabratuarByAltyapi(Altyapi altyapi);
}
