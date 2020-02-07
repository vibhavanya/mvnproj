package com.mindtree.coding9Jan.service;

import java.util.List;

import com.mindtree.coding9Jan.entity.Dish;
import com.mindtree.coding9Jan.entity.Hotel;
import com.mindtree.coding9Jan.exception.ServiceException;

public interface HotelService {

	void insertHotel(Hotel hotel) throws ServiceException;

	void insertDish(Dish dish) throws ServiceException;

	void deleteDish(int dishId) throws ServiceException;

	void addDishToHotels(int hotelId, int dishId);

	List<Hotel> getAllHotelName();

	List<Dish> getAllDishName();

	List<Hotel> getAllDetails();

	void updateDish(int dishId);

}
