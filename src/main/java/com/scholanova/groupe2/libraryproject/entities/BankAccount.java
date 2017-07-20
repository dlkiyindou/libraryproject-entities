package com.scholanova.groupe2.libraryproject.entities;

import javax.persistence.*;

@SuppressWarnings("serial")
@Table(name="bank_account")
@Entity(name="BankAccount")
public class BankAccount extends AbstractEntity {
	@OneToOne
	@Column(name="user_id")
	private User user;
}
