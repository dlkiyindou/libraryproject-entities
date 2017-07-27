package com.scholanova.groupe2.libraryproject.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Table(name="book")
@Entity(name="Book")
public class Book extends AbstractEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="author_id")
	private User author;
	
	@Column(name="title")
	private String title;
	
	@Column(name="genre")
	private String genre;
		
	@Temporal(TemporalType.DATE)
	private Date yearPublication;
	
	@Column(name="summary")
	private String summary;
	
	@Column(name="barcode")
	private String barcode;

	public Long getId() {
		return id;
	}

	public User getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public Date getYearPublication() {
		return yearPublication;
	}

	public String getSummary() {
		return summary;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setYearPublication(Date yearPublication) {
		this.yearPublication = yearPublication;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

}