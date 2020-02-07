package com.mindtree.coding9Jan.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.coding9Jan.entity.Dish;
import com.mindtree.coding9Jan.entity.Hotel;
import com.mindtree.coding9Jan.exception.DishAlreadyPresentExceptiom;
import com.mindtree.coding9Jan.exception.HotelAlreadyPresentException;
import com.mindtree.coding9Jan.exception.NoSuchDishIdIsPresentException;
import com.mindtree.coding9Jan.exception.ServiceException;
import com.mindtree.coding9Jan.repository.DishRepository;
import com.mindtree.coding9Jan.repository.HotelRepository;
import com.mindtree.coding9Jan.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepository hotelRepository;

	@Autowired
	private DishRepository dishRepository;

	@Override
	public void insertHotel(Hotel hotel) throws ServiceException {
		Optional<Hotel> hotelOptional = hotelRepository.findByhotelName(hotel.getHotelName());
		if (hotelOptional.isPresent()) {

			throw new HotelAlreadyPresentException("Hotel already present");
		} else {
			hotelRepository.save(hotel);
		}
	}

	@Override
	public void insertDish(Dish dish) throws ServiceException {
		Optional<Dish> dishOptional = dishRepository.findBydishName(dish.getDishName());
		if (dishOptional.isPresent()) {

			throw new DishAlreadyPresentExceptiom("Dish already present");
		} else {
			dishRepository.save(dish);
		}
	}

	@Override
	public void addDishToHotels(int hotelId, int dishId) {
		Hotel hotel = new Hotel();
		Dish dish = new Dish();
		hotel = hotelRepository.getOne(hotelId);
		dish = dishRepository.getOne(dishId);
		hotel.setAverargeHotelRating(hotel.getAverargeHotelRating() + dish.getDishRating());
		dish.setHotel(hotel);
		dishRepository.save(dish);
		hotelRepository.save(hotel);
	}

	@Override
	public void deleteDish(int dishId) throws ServiceException {
		Optional<Dish> d = dishRepository.findById(dishId);
		if (!d.isPresent()) {
			d.orElseThrow(() -> new NoSuchDishIdIsPresentException("No such dish id availabel"));
		}
		Dish dish = d.get();
		Hotel hotel = dish.getHotel();
		dishRepository.deleteById(dishId);
		hotel.setAverargeHotelRating(hotel.getAverargeHotelRating() - dish.getDishRating());
		hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotelName() {
		List<Hotel> allHotels = hotelRepository.findAll();
		return allHotels;
	}

	@Override
	public List<Dish> getAllDishName() {
		List<Dish> allDish = dishRepository.findAll();
		return allDish;
	}

	@Override
	public List<Hotel> getAllDetails() {
		List<Hotel> hotel=hotelRepository.findAll();
		int size=dishRepository.findAll().size();
		for (Hotel hotel2 : hotel) {
			float totalrating=0;
			
			for (Dish dish : hotel2.getDish()) {
				totalrating=((totalrating+dish.getDishRating())/hotel2.getDish().size());
			}
			hotel2.setAverargeHotelRating(totalrating);
		}
		return hotel;
	}

	@Override
	public void updateDish(int dishId) {
		Optional<Dish> d = dishRepository.findById(dishId);
		List<Hotel> h=hotelRepository.findAll();
		Hotel hotel = new Hotel();
		Dish dish = new Dish();
		//hotel.setDish(hotel.get);
		
	}
}
