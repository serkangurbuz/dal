package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

/**
 * CihazDegerlendirmeOturumId generated by hbm2java
 */
public class CihazDegerlendirmeOturumId implements java.io.Serializable {

	private long cihazKod;
	private long setKod;
	private long oturumKod;

	public CihazDegerlendirmeOturumId() {
	}

	public CihazDegerlendirmeOturumId(long cihazKod, long setKod, long oturumKod) {
		this.cihazKod = cihazKod;
		this.setKod = setKod;
		this.oturumKod = oturumKod;
	}

	public long getCihazKod() {
		return this.cihazKod;
	}

	public void setCihazKod(long cihazKod) {
		this.cihazKod = cihazKod;
	}

	public long getSetKod() {
		return this.setKod;
	}

	public void setSetKod(long setKod) {
		this.setKod = setKod;
	}

	public long getOturumKod() {
		return this.oturumKod;
	}

	public void setOturumKod(long oturumKod) {
		this.oturumKod = oturumKod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CihazDegerlendirmeOturumId))
			return false;
		CihazDegerlendirmeOturumId castOther = (CihazDegerlendirmeOturumId) other;

		return (this.getCihazKod() == castOther.getCihazKod())
				&& (this.getSetKod() == castOther.getSetKod())
				&& (this.getOturumKod() == castOther.getOturumKod());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getCihazKod();
		result = 37 * result + (int) this.getSetKod();
		result = 37 * result + (int) this.getOturumKod();
		return result;
	}

}
