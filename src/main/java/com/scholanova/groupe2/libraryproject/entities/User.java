package com.scholanova.groupe2.libraryproject.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Table(name="user")
@Entity(name="User")
public class User extends AbstractEntity {
	private String firstname;
	
	private String lastname;
	
	private String phone;
	
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@OneToMany
	@JoinColumn(name="user_id")
	private Collection<BankAccount> bankAccounts;

	public Collection<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(Collection<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public Address getAddress() {
		return address;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
