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
@Table(name="profession")
public class ProfessionEntity implements Serializable {
	
	private static final long serialVersionUID = -3770768229927893900L;

	@Id
	@Column(name = "profession_id")
	private int professionId;
	
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
	
	@Column(name = "name")
	private String name;

	public int getprofessionId() {
		return professionId;
	}

	public void setprofessionId(int professionId) {
		this.professionId = professionId;
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
