package com.Argeloji.Api;

import java.util.ArrayList;
import java.util.List;


import com.Argeloji.Domain.Okul;
import com.Argeloji.Domain.Okulpersonel;
import com.Argeloji.Domain.Personel;


public interface OkulpersonelDataMapper {
	void save(Okulpersonel os)throws Exception;
	void update(Okulpersonel os) throws Exception;
	void delete(Okulpersonel os);
	ArrayList<Okulpersonel> getListOfOkulpersonel();
	List<Okulpersonel> getOkulpersonelByOkul(Okul okul);
	List<Okulpersonel> getOkulpersonelByPersonel(Personel personel);
}
