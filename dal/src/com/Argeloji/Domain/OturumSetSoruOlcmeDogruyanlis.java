package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * OturumSetSoruOlcmeDogruyanlis generated by hbm2java
 */
public class OturumSetSoruOlcmeDogruyanlis implements java.io.Serializable {

	private OturumSetSoruOlcmeDogruyanlisId id;
	private SetSoru setSoru;
	private Cihaz cihaz;
	private Cevapdurum cevapdurum;
	private short tercih;
	private Date giris;
	private Date cikis;
	private int sure;

	public OturumSetSoruOlcmeDogruyanlis() {
	}

	public OturumSetSoruOlcmeDogruyanlis(OturumSetSoruOlcmeDogruyanlisId id,
			SetSoru setSoru, Cihaz cihaz, Cevapdurum cevapdurum, short tercih,
			Date giris, Date cikis, int sure) {
		this.id = id;
		this.setSoru = setSoru;
		this.cihaz = cihaz;
		this.cevapdurum = cevapdurum;
		this.tercih = tercih;
		this.giris = giris;
		this.cikis = cikis;
		this.sure = sure;
	}

	public OturumSetSoruOlcmeDogruyanlisId getId() {
		return this.id;
	}

	public void setId(OturumSetSoruOlcmeDogruyanlisId id) {
		this.id = id;
	}

	public SetSoru getSetSoru() {
		return this.setSoru;
	}

	public void setSetSoru(SetSoru setSoru) {
		this.setSoru = setSoru;
	}

	public Cihaz getCihaz() {
		return this.cihaz;
	}

	public void setCihaz(Cihaz cihaz) {
		this.cihaz = cihaz;
	}

	public Cevapdurum getCevapdurum() {
		return this.cevapdurum;
	}

	public void setCevapdurum(Cevapdurum cevapdurum) {
		this.cevapdurum = cevapdurum;
	}

	public short getTercih() {
		return this.tercih;
	}

	public void setTercih(short tercih) {
		this.tercih = tercih;
	}

	public Date getGiris() {
		return this.giris;
	}

	public void setGiris(Date giris) {
		this.giris = giris;
	}

	public Date getCikis() {
		return this.cikis;
	}

	public void setCikis(Date cikis) {
		this.cikis = cikis;
	}

	public int getSure() {
		return this.sure;
	}

	public void setSure(int sure) {
		this.sure = sure;
	}

}
