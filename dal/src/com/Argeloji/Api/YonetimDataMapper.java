package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Domain.Yonetim;


public interface YonetimDataMapper {

	void save(Yonetim yonetim) throws Exception;
	
	ArrayList<Yonetim> getListOfYonetim();
	
	Yonetim getYonetimByKod(int kod);
	
	//List getYonetimByAd(String ad);
	
	void updateYonetim(Yonetim yonetim);
	
	void deleteYonetim(Yonetim yonetim);
	
}
