package com.scholanova.groupe2.libraryproject.entities;

import java.util.Date;

import javax.persistence.*;

public class LendingMO {
	
	private long idBook;
	
	private Long userId;
	
	@Temporal(TemporalType.DATE)
	private Date lendingDate;
	
	@Temporal(TemporalType.DATE)
	private Date dueDate;

	public long getIdBook() {
		return idBook;
	}

	public void setIdBook(long idBook) {
		this.idBook = idBook;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getLendingDate() {
		return lendingDate;
	}

	public void setLendingDate(Date lendingDate) {
		this.lendingDate = lendingDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}
