package com.exchange.rodriguezvillalta.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_product")
    Integer idProduct;
	
	@Column(name= "PRODUCTNAME")
	String productname;
	
	@Column(name = "Description")
	String description;
	
	@Column(name = "Category")
	String category;
	
	public Integer getId() {
		return idProduct;
	}

	public void setId(Integer idProduct) {
		this.idProduct = idProduct;
	}
	
	public String getProductname() {
		return productname;
	}
	
	public void setProductName(String productname) {
		this.productname = productname;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
}