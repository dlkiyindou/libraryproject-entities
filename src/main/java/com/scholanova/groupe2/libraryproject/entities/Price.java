package com.scholanova.groupe2.libraryproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Table(name = "price")
@Entity(name = "Price")
public class Price extends AbstractEntity {

	@Id
	@GeneratedValue
	private Long id;

	private double priceValue;

	private double excludingTaxPrice;

	private int taxRate;
	

	public Long getId() {
		return id;
	}

	public double getPriceValue() {
		return priceValue;
	}

	public double getExcludingTaxPrice() {
		return excludingTaxPrice;
	}

	public int getTaxRate() {
		return taxRate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPriceValue(double priceValue) {
		this.priceValue = priceValue;
	}

	public void setExcludingTaxPrice(double excludingTaxPrice) {
		this.excludingTaxPrice = excludingTaxPrice;
	}

	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}

}