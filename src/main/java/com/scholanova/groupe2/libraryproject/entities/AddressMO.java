package com.scholanova.groupe2.libraryproject.entities;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Generated;

@SuppressWarnings("serial")
@Entity(name="adresse")
public class AdresseMO extends EntityMO {
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	private Set<UserMO> users;
	
	private String zipCode;
	
	private String city;
	
	private String streetName;
	
	private Integer number;
}
