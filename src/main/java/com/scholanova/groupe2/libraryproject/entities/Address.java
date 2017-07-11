package com.scholanova.groupe2.libraryproject.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Table(name="address")
@Entity(name="Address")
public class Address extends AbstractEntity {
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	@JoinColumn(name="address_id")
	private Collection<User> users;
	
	private String zipCode;
	
	private String city;
	
	private String streetName;
	
	private Integer number;

	public Long getId() {
		return id;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getCity() {
		return city;
	}

	public String getStreetName() {
		return streetName;
	}

	public Integer getNumber() {
		return number;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
