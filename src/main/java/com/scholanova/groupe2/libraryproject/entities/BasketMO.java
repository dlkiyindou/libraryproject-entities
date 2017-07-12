package com.scholanova.groupe2.libraryproject.entities;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity(name= "Basket")
@Table(name= "basket")
public class BasketMO extends EntityMO {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="user_id")
	private UserMO user;
	
	@Column(name="book_id")
	private BookMO book;
	
	private Integer quantity;
	
	@Column(name="price_id")
	private PriceMO price;

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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public PriceMO getPrice() {
		return price;
	}

	public void setPrice(PriceMO price) {
		this.price = price;
	}
	
	
}
