package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Uygulama generated by hbm2java
 */
public class Uygulama implements java.io.Serializable {

	private int kod;
	private String ad;
	private String aciklama;
	private double fiyat;
	private Set etkinliks = new HashSet(0);
	private Set uygulamaCihazs = new HashSet(0);
	private Set uygulamaMetaveris = new HashSet(0);

	public Uygulama() {
	}

	public Uygulama(int kod, String ad, String aciklama, double fiyat) {
		this.kod = kod;
		this.ad = ad;
		this.aciklama = aciklama;
		this.fiyat = fiyat;
	}

	public Uygulama(int kod, String ad, String aciklama, double fiyat,
			Set etkinliks, Set uygulamaCihazs, Set uygulamaMetaveris) {
		this.kod = kod;
		this.ad = ad;
		this.aciklama = aciklama;
		this.fiyat = fiyat;
		this.etkinliks = etkinliks;
		this.uygulamaCihazs = uygulamaCihazs;
		this.uygulamaMetaveris = uygulamaMetaveris;
	}

	public int getKod() {
		return this.kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public String getAd() {
		return this.ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAciklama() {
		return this.aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public double getFiyat() {
		return this.fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public Set getEtkinliks() {
		return this.etkinliks;
	}

	public void setEtkinliks(Set etkinliks) {
		this.etkinliks = etkinliks;
	}

	public Set getUygulamaCihazs() {
		return this.uygulamaCihazs;
	}

	public void setUygulamaCihazs(Set uygulamaCihazs) {
		this.uygulamaCihazs = uygulamaCihazs;
	}

	public Set getUygulamaMetaveris() {
		return this.uygulamaMetaveris;
	}

	public void setUygulamaMetaveris(Set uygulamaMetaveris) {
		this.uygulamaMetaveris = uygulamaMetaveris;
	}

}
