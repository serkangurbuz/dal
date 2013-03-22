package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Ozelokul generated by hbm2java
 */
public class Ozelokul implements java.io.Serializable {

	private int kod;
	private String ad;
	private Set okulgrubus = new HashSet(0);

	public Ozelokul() {
	}

	public Ozelokul(int kod, String ad) {
		this.kod = kod;
		this.ad = ad;
	}

	public Ozelokul(int kod, String ad, Set okulgrubus) {
		this.kod = kod;
		this.ad = ad;
		this.okulgrubus = okulgrubus;
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

	public Set getOkulgrubus() {
		return this.okulgrubus;
	}

	public void setOkulgrubus(Set okulgrubus) {
		this.okulgrubus = okulgrubus;
	}

}
