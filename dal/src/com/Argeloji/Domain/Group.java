package com.Argeloji.Domain;

// default package
// Generated Mar 18, 2013 10:44:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Group generated by hbm2java
 */
public class Group implements java.io.Serializable {

	private long groupid;
	private Okul okul;
	private Long creatoruserid;
	private Long classnameid;
	private Long classpk;
	private Long parentgroupid;
	private Long livegroupid;
	private String name;
	private String description;
	private Integer type;
	private String typesettings;
	private String friendlyurl;
	private Boolean site;
	private Boolean active;
	private Set usersGroupses = new HashSet(0);

	public Group() {
	}

	public Group(long groupid, Okul okul) {
		this.groupid = groupid;
		this.okul = okul;
	}

	public Group(long groupid, Okul okul, Long creatoruserid, Long classnameid,
			Long classpk, Long parentgroupid, Long livegroupid, String name,
			String description, Integer type, String typesettings,
			String friendlyurl, Boolean site, Boolean active, Set usersGroupses) {
		this.groupid = groupid;
		this.okul = okul;
		this.creatoruserid = creatoruserid;
		this.classnameid = classnameid;
		this.classpk = classpk;
		this.parentgroupid = parentgroupid;
		this.livegroupid = livegroupid;
		this.name = name;
		this.description = description;
		this.type = type;
		this.typesettings = typesettings;
		this.friendlyurl = friendlyurl;
		this.site = site;
		this.active = active;
		this.usersGroupses = usersGroupses;
	}

	public long getGroupid() {
		return this.groupid;
	}

	public void setGroupid(long groupid) {
		this.groupid = groupid;
	}

	public Okul getOkul() {
		return this.okul;
	}

	public void setOkul(Okul okul) {
		this.okul = okul;
	}

	public Long getCreatoruserid() {
		return this.creatoruserid;
	}

	public void setCreatoruserid(Long creatoruserid) {
		this.creatoruserid = creatoruserid;
	}

	public Long getClassnameid() {
		return this.classnameid;
	}

	public void setClassnameid(Long classnameid) {
		this.classnameid = classnameid;
	}

	public Long getClasspk() {
		return this.classpk;
	}

	public void setClasspk(Long classpk) {
		this.classpk = classpk;
	}

	public Long getParentgroupid() {
		return this.parentgroupid;
	}

	public void setParentgroupid(Long parentgroupid) {
		this.parentgroupid = parentgroupid;
	}

	public Long getLivegroupid() {
		return this.livegroupid;
	}

	public void setLivegroupid(Long livegroupid) {
		this.livegroupid = livegroupid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTypesettings() {
		return this.typesettings;
	}

	public void setTypesettings(String typesettings) {
		this.typesettings = typesettings;
	}

	public String getFriendlyurl() {
		return this.friendlyurl;
	}

	public void setFriendlyurl(String friendlyurl) {
		this.friendlyurl = friendlyurl;
	}

	public Boolean getSite() {
		return this.site;
	}

	public void setSite(Boolean site) {
		this.site = site;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Set getUsersGroupses() {
		return this.usersGroupses;
	}

	public void setUsersGroupses(Set usersGroupses) {
		this.usersGroupses = usersGroupses;
	}

}
