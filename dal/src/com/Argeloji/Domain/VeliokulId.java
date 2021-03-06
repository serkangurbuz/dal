package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * VeliokulId generated by hbm2java
 */
public class VeliokulId implements java.io.Serializable {

	private long kullaniciVeliKod;
	private Date giristarih;
	private int okulKod;

	public VeliokulId() {
	}

	public VeliokulId(long kullaniciVeliKod, Date giristarih, int okulKod) {
		this.kullaniciVeliKod = kullaniciVeliKod;
		this.giristarih = giristarih;
		this.okulKod = okulKod;
	}

	public long getKullaniciVeliKod() {
		return this.kullaniciVeliKod;
	}

	public void setKullaniciVeliKod(long kullaniciVeliKod) {
		this.kullaniciVeliKod = kullaniciVeliKod;
	}

	public Date getGiristarih() {
		return this.giristarih;
	}

	public void setGiristarih(Date giristarih) {
		this.giristarih = giristarih;
	}

	public int getOkulKod() {
		return this.okulKod;
	}

	public void setOkulKod(int okulKod) {
		this.okulKod = okulKod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VeliokulId))
			return false;
		VeliokulId castOther = (VeliokulId) other;

		return (this.getKullaniciVeliKod() == castOther.getKullaniciVeliKod())
				&& ((this.getGiristarih() == castOther.getGiristarih()) || (this
						.getGiristarih() != null
						&& castOther.getGiristarih() != null && this
						.getGiristarih().equals(castOther.getGiristarih())))
				&& (this.getOkulKod() == castOther.getOkulKod());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getKullaniciVeliKod();
		result = 37
				* result
				+ (getGiristarih() == null ? 0 : this.getGiristarih()
						.hashCode());
		result = 37 * result + this.getOkulKod();
		return result;
	}

}
