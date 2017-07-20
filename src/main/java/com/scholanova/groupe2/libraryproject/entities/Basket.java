package com.scholanova.groupe2.libraryproject.entities;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity(name= "Basket")
@Table(name= "basket")
public class Basket extends AbstractEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="user_id")
	private User user;
	
	@Column(name="book_id")
	private Book book;
	
	private Integer quantity;
	
	@Column(name="price_id")
	private Price price;

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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
	
	
}
