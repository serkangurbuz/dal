package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * UygulamaCihaz generated by hbm2java
 */
public class UygulamaCihaz implements java.io.Serializable {

	private UygulamaCihazId id;
	private Uygulama uygulama;
	private Cihaz cihaz;
	private Set uygulamaKullanicis = new HashSet(0);

	public UygulamaCihaz() {
	}

	public UygulamaCihaz(UygulamaCihazId id, Uygulama uygulama, Cihaz cihaz) {
		this.id = id;
		this.uygulama = uygulama;
		this.cihaz = cihaz;
	}

	public UygulamaCihaz(UygulamaCihazId id, Uygulama uygulama, Cihaz cihaz,
			Set uygulamaKullanicis) {
		this.id = id;
		this.uygulama = uygulama;
		this.cihaz = cihaz;
		this.uygulamaKullanicis = uygulamaKullanicis;
	}

	public UygulamaCihazId getId() {
		return this.id;
	}

	public void setId(UygulamaCihazId id) {
		this.id = id;
	}

	public Uygulama getUygulama() {
		return this.uygulama;
	}

	public void setUygulama(Uygulama uygulama) {
		this.uygulama = uygulama;
	}

	public Cihaz getCihaz() {
		return this.cihaz;
	}

	public void setCihaz(Cihaz cihaz) {
		this.cihaz = cihaz;
	}

	public Set getUygulamaKullanicis() {
		return this.uygulamaKullanicis;
	}

	public void setUygulamaKullanicis(Set uygulamaKullanicis) {
		this.uygulamaKullanicis = uygulamaKullanicis;
	}

}
