package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Zumreogretmen generated by hbm2java
 */
public class Zumreogretmen implements java.io.Serializable {

	private ZumreogretmenId id;
	private Personel personel;
	private Zumre zumre;
	private Date cikistarih;

	public Zumreogretmen() {
	}

	public Zumreogretmen(ZumreogretmenId id, Personel personel, Zumre zumre,
			Date cikistarih) {
		this.id = id;
		this.personel = personel;
		this.zumre = zumre;
		this.cikistarih = cikistarih;
	}

	public ZumreogretmenId getId() {
		return this.id;
	}

	public void setId(ZumreogretmenId id) {
		this.id = id;
	}

	public Personel getPersonel() {
		return this.personel;
	}

	public void setPersonel(Personel personel) {
		this.personel = personel;
	}

	public Zumre getZumre() {
		return this.zumre;
	}

	public void setZumre(Zumre zumre) {
		this.zumre = zumre;
	}

	public Date getCikistarih() {
		return this.cikistarih;
	}

	public void setCikistarih(Date cikistarih) {
		this.cikistarih = cikistarih;
	}

}
