package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * OkulzumreId generated by hbm2java
 */
public class OkulzumreId implements java.io.Serializable {

	private Date giristarih;
	private int zumreKod;
	private int kademeKod;
	private int okulKod;

	public OkulzumreId() {
	}

	public OkulzumreId(Date giristarih, int zumreKod, int kademeKod, int okulKod) {
		this.giristarih = giristarih;
		this.zumreKod = zumreKod;
		this.kademeKod = kademeKod;
		this.okulKod = okulKod;
	}

	public Date getGiristarih() {
		return this.giristarih;
	}

	public void setGiristarih(Date giristarih) {
		this.giristarih = giristarih;
	}

	public int getZumreKod() {
		return this.zumreKod;
	}

	public void setZumreKod(int zumreKod) {
		this.zumreKod = zumreKod;
	}

	public int getKademeKod() {
		return this.kademeKod;
	}

	public void setKademeKod(int kademeKod) {
		this.kademeKod = kademeKod;
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
		if (!(other instanceof OkulzumreId))
			return false;
		OkulzumreId castOther = (OkulzumreId) other;

		return ((this.getGiristarih() == castOther.getGiristarih()) || (this
				.getGiristarih() != null && castOther.getGiristarih() != null && this
				.getGiristarih().equals(castOther.getGiristarih())))
				&& (this.getZumreKod() == castOther.getZumreKod())
				&& (this.getKademeKod() == castOther.getKademeKod())
				&& (this.getOkulKod() == castOther.getOkulKod());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGiristarih() == null ? 0 : this.getGiristarih()
						.hashCode());
		result = 37 * result + this.getZumreKod();
		result = 37 * result + this.getKademeKod();
		result = 37 * result + this.getOkulKod();
		return result;
	}

}
