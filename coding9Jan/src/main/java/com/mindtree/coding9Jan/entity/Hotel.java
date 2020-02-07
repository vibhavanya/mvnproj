package com.mindtree.coding9Jan.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int hotelId;
	String hotelName;

	float averargeHotelRating;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel")
	List<Dish> dish;

	public Hotel() {
		super();
	}

	public Hotel(int hotelId, String hotelName, float averargeHotelRating, List<Dish> dish) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.averargeHotelRating = averargeHotelRating;
		this.dish = dish;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public float getAverargeHotelRating() {
		return averargeHotelRating;
	}

	public void setAverargeHotelRating(float averargeHotelRating) {
		this.averargeHotelRating = averargeHotelRating;
	}

	public List<Dish> getDish() {
		return dish;
	}

	public void setDish(List<Dish> dish) {
		this.dish = dish;
	}
	
	
	

}
