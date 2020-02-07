package com.mindtree.coding9Jan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dish {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int dishId;
	String dishName;
	int dishRating;
	int dishPrice;
	
	@ManyToOne
	private Hotel hotel;

	public Dish() {
		super();
	}

	public Dish(int dishId, String dishName, int dishRating, int dishPrice, Hotel hotel) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishRating = dishRating;
		this.dishPrice = dishPrice;
		this.hotel = hotel;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getDishRating() {
		return dishRating;
	}

	public void setDishRating(int dishRating) {
		this.dishRating = dishRating;
	}

	public int getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	

}
