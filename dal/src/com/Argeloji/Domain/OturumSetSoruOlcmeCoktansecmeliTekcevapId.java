package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

/**
 * OturumSetSoruOlcmeCoktansecmeliTekcevapId generated by hbm2java
 */
public class OturumSetSoruOlcmeCoktansecmeliTekcevapId implements
		java.io.Serializable {

	private long cihazKod;
	private long oturumKod;
	private long setSoruSetKod;
	private long setSoruSoruKod;

	public OturumSetSoruOlcmeCoktansecmeliTekcevapId() {
	}

	public OturumSetSoruOlcmeCoktansecmeliTekcevapId(long cihazKod,
			long oturumKod, long setSoruSetKod, long setSoruSoruKod) {
		this.cihazKod = cihazKod;
		this.oturumKod = oturumKod;
		this.setSoruSetKod = setSoruSetKod;
		this.setSoruSoruKod = setSoruSoruKod;
	}

	public long getCihazKod() {
		return this.cihazKod;
	}

	public void setCihazKod(long cihazKod) {
		this.cihazKod = cihazKod;
	}

	public long getOturumKod() {
		return this.oturumKod;
	}

	public void setOturumKod(long oturumKod) {
		this.oturumKod = oturumKod;
	}

	public long getSetSoruSetKod() {
		return this.setSoruSetKod;
	}

	public void setSetSoruSetKod(long setSoruSetKod) {
		this.setSoruSetKod = setSoruSetKod;
	}

	public long getSetSoruSoruKod() {
		return this.setSoruSoruKod;
	}

	public void setSetSoruSoruKod(long setSoruSoruKod) {
		this.setSoruSoruKod = setSoruSoruKod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OturumSetSoruOlcmeCoktansecmeliTekcevapId))
			return false;
		OturumSetSoruOlcmeCoktansecmeliTekcevapId castOther = (OturumSetSoruOlcmeCoktansecmeliTekcevapId) other;

		return (this.getCihazKod() == castOther.getCihazKod())
				&& (this.getOturumKod() == castOther.getOturumKod())
				&& (this.getSetSoruSetKod() == castOther.getSetSoruSetKod())
				&& (this.getSetSoruSoruKod() == castOther.getSetSoruSoruKod());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getCihazKod();
		result = 37 * result + (int) this.getOturumKod();
		result = 37 * result + (int) this.getSetSoruSetKod();
		result = 37 * result + (int) this.getSetSoruSoruKod();
		return result;
	}

}
