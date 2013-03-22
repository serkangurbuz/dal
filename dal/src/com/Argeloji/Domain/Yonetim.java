package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Yonetim generated by hbm2java
 */
public class Yonetim implements java.io.Serializable {

	private int kod;
	private Kullanicigrup kullanicigrup;
	private Date giristarih;
	private Date cikistarih;
	private Set yonetimpersonels = new HashSet(0);

	public Yonetim() {
	}

	public Yonetim(int kod, Kullanicigrup kullanicigrup, Date giristarih,
			Date cikistarih) {
		this.kod = kod;
		this.kullanicigrup = kullanicigrup;
		this.giristarih = giristarih;
		this.cikistarih = cikistarih;
	}

	public Yonetim(int kod, Kullanicigrup kullanicigrup, Date giristarih,
			Date cikistarih, Set yonetimpersonels) {
		this.kod = kod;
		this.kullanicigrup = kullanicigrup;
		this.giristarih = giristarih;
		this.cikistarih = cikistarih;
		this.yonetimpersonels = yonetimpersonels;
	}

	public int getKod() {
		return this.kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public Kullanicigrup getKullanicigrup() {
		return this.kullanicigrup;
	}

	public void setKullanicigrup(Kullanicigrup kullanicigrup) {
		this.kullanicigrup = kullanicigrup;
	}

	public Date getGiristarih() {
		return this.giristarih;
	}

	public void setGiristarih(Date giristarih) {
		this.giristarih = giristarih;
	}

	public Date getCikistarih() {
		return this.cikistarih;
	}

	public void setCikistarih(Date cikistarih) {
		this.cikistarih = cikistarih;
	}

	public Set getYonetimpersonels() {
		return this.yonetimpersonels;
	}

	public void setYonetimpersonels(Set yonetimpersonels) {
		this.yonetimpersonels = yonetimpersonels;
	}

}
