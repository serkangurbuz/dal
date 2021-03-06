package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

/**
 * DogruyanlisId generated by hbm2java
 */
public class DogruyanlisId implements java.io.Serializable {

	private long soruKod;
	private boolean dogrusecenek;

	public DogruyanlisId() {
	}

	public DogruyanlisId(long soruKod, boolean dogrusecenek) {
		this.soruKod = soruKod;
		this.dogrusecenek = dogrusecenek;
	}

	public long getSoruKod() {
		return this.soruKod;
	}

	public void setSoruKod(long soruKod) {
		this.soruKod = soruKod;
	}

	public boolean isDogrusecenek() {
		return this.dogrusecenek;
	}

	public void setDogrusecenek(boolean dogrusecenek) {
		this.dogrusecenek = dogrusecenek;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DogruyanlisId))
			return false;
		DogruyanlisId castOther = (DogruyanlisId) other;

		return (this.getSoruKod() == castOther.getSoruKod())
				&& (this.isDogrusecenek() == castOther.isDogrusecenek());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getSoruKod();
		result = 37 * result + (this.isDogrusecenek() ? 1 : 0);
		return result;
	}

}
