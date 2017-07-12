package com.scholanova.groupe2.libraryproject.entities;

import javax.persistence.*;

@SuppressWarnings("serial")
@Table(name="bank_account")
@Entity(name="BankAccount")
public class BankAccount extends AbstractEntity {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	private String bic;
	
	@Column(name="bank_code")
	private Short bankCode;
	
	@Column(name="agency_code")
	private Short agencyCode;
	
	@Column(name="country_code")
	private String countryCode;
	
	@Column(name="account_number")
	private String accountNumber;
	
	private Short key; 
	
	@Transient
	private String rib;
	
	@Transient
	private String iban;

	public User getUser() {
		return user;
	}

	public String getBic() {
		return bic;
	}

	public Short getBankCode() {
		return bankCode;
	}

	public Short getAgencyCode() {
		return agencyCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public Short getKey() {
		return key;
	}

	public String getRib() {
		return rib;
	}

	public String getIban() {
		return iban;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public void setBankCode(Short bankCode) {
		this.bankCode = bankCode;
	}

	public void setAgencyCode(Short agencyCode) {
		this.agencyCode = agencyCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setKey(Short key) {
		this.key = key;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
}
