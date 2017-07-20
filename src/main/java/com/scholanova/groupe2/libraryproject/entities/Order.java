package com.scholanova.groupe2.libraryproject.entities;

import java.util.Date;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity(name= "Order")
@Table(name= "order")
public class Order extends AbstractEntity{

	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@Column(name="user_id")
	private User user;
	
	@Column(name="book_id")
	private Book book;

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
