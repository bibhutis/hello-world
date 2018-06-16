package com.example.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="customer_name")
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="customer_customer_id")
	private Set<StockDetails> stockDeatails;
	
	public Customer(String name) {
		super();
		this.name = name;
	}
	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<StockDetails> getStockDeatails() {
		return stockDeatails;
	}
	public void setStockDeatails(Set<StockDetails> stockDeatails) {
		this.stockDeatails = stockDeatails;
	}
	
	
}
