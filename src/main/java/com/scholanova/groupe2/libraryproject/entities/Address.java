package com.scholanova.groupe2.libraryproject.entities;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Generated;

@SuppressWarnings("serial")
@Table(name="address")
@Entity(name="Address")
public class Address extends AbstractEntity {
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	private Set<User> users;
	
	private String zipCode;
	
	private String city;
	
	private String streetName;
	
	private Integer number;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
