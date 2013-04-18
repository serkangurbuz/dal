package com.Argeloji.Domain;
// default package
// Generated 01.Nis.2013 10:40:22 by Hibernate Tools 4.0.0

/**
 * FaaliyetsinifiId generated by hbm2java
 */
public class FaaliyetsinifiId implements java.io.Serializable {

	private int kod;
	private int altyapiKod;

	public FaaliyetsinifiId() {
	}

	public FaaliyetsinifiId(int kod, int altyapiKod) {
		this.kod = kod;
		this.altyapiKod = altyapiKod;
	}

	public int getKod() {
		return this.kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public int getAltyapiKod() {
		return this.altyapiKod;
	}

	public void setAltyapiKod(int altyapiKod) {
		this.altyapiKod = altyapiKod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FaaliyetsinifiId))
			return false;
		FaaliyetsinifiId castOther = (FaaliyetsinifiId) other;

		return (this.getKod() == castOther.getKod())
				&& (this.getAltyapiKod() == castOther.getAltyapiKod());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getKod();
		result = 37 * result + this.getAltyapiKod();
		return result;
	}

}
