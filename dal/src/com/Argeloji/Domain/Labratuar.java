package com.Argeloji.Domain;
// default package
// Generated 01.Nis.2013 21:40:36 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Labratuar generated by hbm2java
 */
public class Labratuar implements java.io.Serializable {

	private int kod;
	private Altyapi altyapi;
	private Date cikistarihi;
	private Date giristarihi;
	private int kapasite;
	private String labadi;

	public Labratuar() {
	}

	public Labratuar(int kod, Altyapi altyapi, Date cikistarihi,
			Date giristarihi, int kapasite, String labadi) {
		this.kod = kod;
		this.altyapi = altyapi;
		this.cikistarihi = cikistarihi;
		this.giristarihi = giristarihi;
		this.kapasite = kapasite;
		this.labadi = labadi;
	}

	public int getKod() {
		return this.kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public Altyapi getAltyapi() {
		return this.altyapi;
	}

	public void setAltyapi(Altyapi altyapi) {
		this.altyapi = altyapi;
	}

	public Date getCikistarihi() {
		return this.cikistarihi;
	}

	public void setCikistarihi(Date cikistarihi) {
		this.cikistarihi = cikistarihi;
	}

	public Date getGiristarihi() {
		return this.giristarihi;
	}

	public void setGiristarihi(Date giristarihi) {
		this.giristarihi = giristarihi;
	}

	public int getKapasite() {
		return this.kapasite;
	}

	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}

	public String getLabadi() {
		return this.labadi;
	}

	public void setLabadi(String labadi) {
		this.labadi = labadi;
	}

}
