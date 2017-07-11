package com.scholanova.groupe2.libraryproject.entities;

import javax.persistence.*;

@Table(name="bank_account")
@Entity(name="BankAccount")
public class BankAccountMO extends EntityMO {
	@OneToOne
	@Column(name="user_id")
	private UserMO user;
}
