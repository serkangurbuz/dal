package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Ogrenci generated by hbm2java
 */
public class Ogrenci implements java.io.Serializable {

	private long kullaniciKod;
	private Kullanici kullanici;
	private Set okulogrencis = new HashSet(0);
	private Set veliogrencis = new HashSet(0);
	private Set kulupogrencis = new HashSet(0);
	private Set ogrencisubes = new HashSet(0);

	public Ogrenci() {
	}

	public Ogrenci(long kullaniciKod, Kullanici kullanici) {
		this.kullaniciKod = kullaniciKod;
		this.kullanici = kullanici;
	}

	public Ogrenci(long kullaniciKod, Kullanici kullanici, Set okulogrencis,
			Set veliogrencis, Set kulupogrencis, Set ogrencisubes) {
		this.kullaniciKod = kullaniciKod;
		this.kullanici = kullanici;
		this.okulogrencis = okulogrencis;
		this.veliogrencis = veliogrencis;
		this.kulupogrencis = kulupogrencis;
		this.ogrencisubes = ogrencisubes;
	}

	public long getKullaniciKod() {
		return this.kullaniciKod;
	}

	public void setKullaniciKod(long kullaniciKod) {
		this.kullaniciKod = kullaniciKod;
	}

	public Kullanici getKullanici() {
		return this.kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

	public Set getOkulogrencis() {
		return this.okulogrencis;
	}

	public void setOkulogrencis(Set okulogrencis) {
		this.okulogrencis = okulogrencis;
	}

	public Set getVeliogrencis() {
		return this.veliogrencis;
	}

	public void setVeliogrencis(Set veliogrencis) {
		this.veliogrencis = veliogrencis;
	}

	public Set getKulupogrencis() {
		return this.kulupogrencis;
	}

	public void setKulupogrencis(Set kulupogrencis) {
		this.kulupogrencis = kulupogrencis;
	}

	public Set getOgrencisubes() {
		return this.ogrencisubes;
	}

	public void setOgrencisubes(Set ogrencisubes) {
		this.ogrencisubes = ogrencisubes;
	}

}
