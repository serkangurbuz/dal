package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

/**
 * UygulamaMetaveri generated by hbm2java
 */
public class UygulamaMetaveri implements java.io.Serializable {

	private UygulamaMetaveriId id;
	private Uygulama uygulama;

	public UygulamaMetaveri() {
	}

	public UygulamaMetaveri(UygulamaMetaveriId id, Uygulama uygulama) {
		this.id = id;
		this.uygulama = uygulama;
	}

	public UygulamaMetaveriId getId() {
		return this.id;
	}

	public void setId(UygulamaMetaveriId id) {
		this.id = id;
	}

	public Uygulama getUygulama() {
		return this.uygulama;
	}

	public void setUygulama(Uygulama uygulama) {
		this.uygulama = uygulama;
	}

}
