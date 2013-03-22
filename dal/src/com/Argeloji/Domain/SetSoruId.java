package com.Argeloji.Domain;
// default package
// Generated Mar 18, 2013 2:27:42 PM by Hibernate Tools 3.4.0.CR1

/**
 * SetSoruId generated by hbm2java
 */
public class SetSoruId implements java.io.Serializable {

	private long setKod;
	private long soruKod;

	public SetSoruId() {
	}

	public SetSoruId(long setKod, long soruKod) {
		this.setKod = setKod;
		this.soruKod = soruKod;
	}

	public long getSetKod() {
		return this.setKod;
	}

	public void setSetKod(long setKod) {
		this.setKod = setKod;
	}

	public long getSoruKod() {
		return this.soruKod;
	}

	public void setSoruKod(long soruKod) {
		this.soruKod = soruKod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SetSoruId))
			return false;
		SetSoruId castOther = (SetSoruId) other;

		return (this.getSetKod() == castOther.getSetKod())
				&& (this.getSoruKod() == castOther.getSoruKod());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getSetKod();
		result = 37 * result + (int) this.getSoruKod();
		return result;
	}

}
