package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

/**
 * Okulaltyapi generated by hbm2java
 */
public class Okulaltyapi implements java.io.Serializable {

	private OkulaltyapiId id;
	private Okul okul;
	private Altyapi altyapi;

	public Okulaltyapi() {
	}

	public Okulaltyapi(OkulaltyapiId id, Okul okul, Altyapi altyapi) {
		this.id = id;
		this.okul = okul;
		this.altyapi = altyapi;
	}

	public OkulaltyapiId getId() {
		return this.id;
	}

	public void setId(OkulaltyapiId id) {
		this.id = id;
	}

	public Okul getOkul() {
		return this.okul;
	}

	public void setOkul(Okul okul) {
		this.okul = okul;
	}

	public Altyapi getAltyapi() {
		return this.altyapi;
	}

	public void setAltyapi(Altyapi altyapi) {
		this.altyapi = altyapi;
	}

}
