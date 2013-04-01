package com.Argeloji.Domain;
// default package
// Generated 01.Nis.2013 21:40:36 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Kullanici generated by hbm2java
 */
public class Kullanici implements java.io.Serializable {

	private long kod;
	private Adres adres;
	private String ad;
	private String soyad;
	private String telefon;
	private Date giristarih;
	private String email;
	private Set uygulamaKullanicis = new HashSet(0);
	private Personel personel;
	private Veli veli;
	private Ogrenci ogrenci;
	private Set useridmappers = new HashSet(0);

	public Kullanici() {
	}

	public Kullanici(long kod, Adres adres, String ad, String soyad,
			String telefon, Date giristarih, String email) {
		this.kod = kod;
		this.adres = adres;
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.giristarih = giristarih;
		this.email = email;
	}

	public Kullanici(long kod, Adres adres, String ad, String soyad,
			String telefon, Date giristarih, String email,
			Set uygulamaKullanicis, Personel personel, Veli veli,
			Ogrenci ogrenci, Set useridmappers) {
		this.kod = kod;
		this.adres = adres;
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.giristarih = giristarih;
		this.email = email;
		this.uygulamaKullanicis = uygulamaKullanicis;
		this.personel = personel;
		this.veli = veli;
		this.ogrenci = ogrenci;
		this.useridmappers = useridmappers;
	}

	public long getKod() {
		return this.kod;
	}

	public void setKod(long kod) {
		this.kod = kod;
	}

	public Adres getAdres() {
		return this.adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public String getAd() {
		return this.ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return this.soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Date getGiristarih() {
		return this.giristarih;
	}

	public void setGiristarih(Date giristarih) {
		this.giristarih = giristarih;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getUygulamaKullanicis() {
		return this.uygulamaKullanicis;
	}

	public void setUygulamaKullanicis(Set uygulamaKullanicis) {
		this.uygulamaKullanicis = uygulamaKullanicis;
	}

	public Personel getPersonel() {
		return this.personel;
	}

	public void setPersonel(Personel personel) {
		this.personel = personel;
	}

	public Veli getVeli() {
		return this.veli;
	}

	public void setVeli(Veli veli) {
		this.veli = veli;
	}

	public Ogrenci getOgrenci() {
		return this.ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public Set getUseridmappers() {
		return this.useridmappers;
	}

	public void setUseridmappers(Set useridmappers) {
		this.useridmappers = useridmappers;
	}

}
