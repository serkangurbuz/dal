package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Seviye generated by hbm2java
 */
public class Seviye implements java.io.Serializable {

	private short kod;
	private String aciklama;
	private Set setts = new HashSet(0);

	public Seviye() {
	}

	public Seviye(short kod, String aciklama) {
		this.kod = kod;
		this.aciklama = aciklama;
	}

	public Seviye(short kod, String aciklama, Set setts) {
		this.kod = kod;
		this.aciklama = aciklama;
		this.setts = setts;
	}

	public short getKod() {
		return this.kod;
	}

	public void setKod(short kod) {
		this.kod = kod;
	}

	public String getAciklama() {
		return this.aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public Set getSetts() {
		return this.setts;
	}

	public void setSetts(Set setts) {
		this.setts = setts;
	}

}
