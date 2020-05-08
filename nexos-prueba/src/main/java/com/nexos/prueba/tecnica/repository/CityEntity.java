package com.nexos.prueba.tecnica.repository;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="city")
public class CityEntity implements Serializable {
	

	private static final long serialVersionUID = -650052509646766332L;

	@Id
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="created", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	
	@Column(name="created_by")
	private int createdBy;
	
	@Column(name="updated")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;
	
	@Column(name="updated_by")
	private int updatedBy;
	
	@Column(name="name", nullable = false)
	private String name;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
