package com.scholanova.groupe2.libraryproject.entities;

import java.util.Date;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity(name= "Order")
@Table(name= "order")
public class OrderMO extends EntityMO{

	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@Column(name="user_id")
	private UserMO user;
	
	@Column(name="book_id")
	private BookMO book;

	
	public UserMO getUser() {
		return user;
	}

	public void setUser(UserMO user) {
		this.user = user;
	}

	public BookMO getBook() {
		return book;
	}

	public void setBook(BookMO book) {
		this.book = book;
	}
	
	
}
