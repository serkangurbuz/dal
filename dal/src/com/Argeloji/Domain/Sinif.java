package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Sinif generated by hbm2java
 */
public class Sinif implements java.io.Serializable {

	private int kod;
	private Kademe kademe;
	private String ad;
	private Set subes = new HashSet(0);
	private Set dersSinifs = new HashSet(0);

	public Sinif() {
	}

	public Sinif(int kod, Kademe kademe, String ad) {
		this.kod = kod;
		this.kademe = kademe;
		this.ad = ad;
	}

	public Sinif(int kod, Kademe kademe, String ad, Set subes, Set dersSinifs) {
		this.kod = kod;
		this.kademe = kademe;
		this.ad = ad;
		this.subes = subes;
		this.dersSinifs = dersSinifs;
	}

	public int getKod() {
		return this.kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public Kademe getKademe() {
		return this.kademe;
	}

	public void setKademe(Kademe kademe) {
		this.kademe = kademe;
	}

	public String getAd() {
		return this.ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Set getSubes() {
		return this.subes;
	}

	public void setSubes(Set subes) {
		this.subes = subes;
	}

	public Set getDersSinifs() {
		return this.dersSinifs;
	}

	public void setDersSinifs(Set dersSinifs) {
		this.dersSinifs = dersSinifs;
	}

}
