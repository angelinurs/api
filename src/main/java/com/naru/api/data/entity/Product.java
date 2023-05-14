package com.naru.api.data.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name="product" )
public class Product {
	
	@Id
	@GeneratedValue( strategy = GenerationType.class )
	private Long number;
	
	@Column( nullable = false )
	private String name;
	
	@Column( nullable = false )
	private Integer price;
	
	@Column( nullable = false )
	private Integer stock;
	
	private LocalDateTime createdAt;
	private LocalDateTime udpatedAt;
	
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUdpatedAt() {
		return udpatedAt;
	}
	public void setUdpatedAt(LocalDateTime udpatedAt) {
		this.udpatedAt = udpatedAt;
	}
	
	
}
