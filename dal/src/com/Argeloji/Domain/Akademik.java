package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

/**
 * Akademik generated by hbm2java
 */
public class Akademik implements java.io.Serializable {

	private long kullaniciPersonelKod;
	private Personel personel;
	private String alan;

	public Akademik() {
	}

	public Akademik(long kullaniciPersonelKod, Personel personel, String alan) {
		this.kullaniciPersonelKod = kullaniciPersonelKod;
		this.personel = personel;
		this.alan = alan;
	}

	public long getKullaniciPersonelKod() {
		return this.kullaniciPersonelKod;
	}

	public void setKullaniciPersonelKod(long kullaniciPersonelKod) {
		this.kullaniciPersonelKod = kullaniciPersonelKod;
	}

	public Personel getPersonel() {
		return this.personel;
	}

	public void setPersonel(Personel personel) {
		this.personel = personel;
	}

	public String getAlan() {
		return this.alan;
	}

	public void setAlan(String alan) {
		this.alan = alan;
	}

}
