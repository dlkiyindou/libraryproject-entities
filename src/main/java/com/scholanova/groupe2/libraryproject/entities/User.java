package com.scholanova.groupe2.libraryproject.entities;

import java.util.Date;

import javax.persistence.*;

@SuppressWarnings("serial")
@Table(name="user")
@Entity(name="User")
public class User extends AbstractEntity {
	@Id
	@GeneratedValue
	private Long id;
	
	private String firstname;
	
	private String lastname;
	
	private String phone;
	
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	@ManyToOne
	private Address adresse;
	
	@OneToOne
	@Column(name="bank_account_id")
	private BankAccount bankAccount;

	public Long getId() {
		return id;
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

	public Address getAdresse() {
		return adresse;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setAdresse(Address adresse) {
		this.adresse = adresse;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

}
