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
@Table(name = "person")
public class PersonEntity implements Serializable{
	
	private static final long serialVersionUID = 9141168229417070920L;

	@Id
	@Column(name="person_id")
	private int personId;
	
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
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="primer_apellido")
	private String primerApellido;
	
	@Column(name="segundo_apellido")
	private String segundoApelldio;
	
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="ciudad_nacimiento_id")
	private int ciudadNacimientoId;
	
	@Column(name="profession_id")
	private int professionId;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
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

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApelldio() {
		return segundoApelldio;
	}

	public void setSegundoApelldio(String segundoApelldio) {
		this.segundoApelldio = segundoApelldio;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCiudadNacimientoId() {
		return ciudadNacimientoId;
	}

	public void setCiudadNacimientoId(int ciudadNacimientoId) {
		this.ciudadNacimientoId = ciudadNacimientoId;
	}

	public int getProfessionId() {
		return professionId;
	}

	public void setProfessionId(int professionId) {
		this.professionId = professionId;
	}

	
}
