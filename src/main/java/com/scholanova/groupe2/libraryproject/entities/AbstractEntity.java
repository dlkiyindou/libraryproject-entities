package com.scholanova.groupe2.libraryproject.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_creation")
	@GeneratedValue
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_update")
	@GeneratedValue
	private Date dateUpdate;

	public Long getId() {
		return id;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
}
