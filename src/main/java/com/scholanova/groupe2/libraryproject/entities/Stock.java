package com.scholanova.groupe2.libraryproject.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Table(name = "stock")
@Entity(name = "Stock")
public class Stock extends AbstractEntity {

	@Id
	@GeneratedValue
	private Long id;

	private String stockName;

	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@OneToMany
	@JoinColumn(name = "book_id")
	private Collection<Book> books;

	public Long getId() {
		return id;
	}

	public String getStockName() {
		return stockName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Collection<Book> getBooks() {
		return books;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}

}