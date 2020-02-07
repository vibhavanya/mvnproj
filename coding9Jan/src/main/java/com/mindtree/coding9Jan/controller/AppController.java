package com.mindtree.coding9Jan.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.coding9Jan.entity.Dish;
import com.mindtree.coding9Jan.entity.Hotel;
import com.mindtree.coding9Jan.exception.ServiceException;
import com.mindtree.coding9Jan.service.HotelService;

@Controller
public class AppController {
	@Autowired
	private HotelService hotelService;

	@RequestMapping("/")
	public String index() {
		return "hello";
	}

	@RequestMapping(value = "/hotel", method = RequestMethod.GET)
	public String loadHotel() {
		return "hotels";
	}

	@PostMapping("/addHotel")
	public String insertHotel(Hotel hotel, Model model) throws ServiceException {
		hotelService.insertHotel(hotel);
		return "redirect:/hotel";
	}

	@RequestMapping(value = "/dish", method = RequestMethod.GET)
	public String loadDish() {
		return "dishes";
	}

	@PostMapping("/addDish")
	public String insertDish(Dish dish, Model model) throws ServiceException {
		hotelService.insertDish(dish);
		return "redirect:/dish";
	}

	@RequestMapping(value = "/assignHotelsToDish", method = RequestMethod.GET)
	public String loadAssignHotel(Model model) {
		List<Hotel> hotelName = hotelService.getAllHotelName();
		List<Dish> dishName = hotelService.getAllDishName();
		model.addAttribute("hotels", hotelName);
		model.addAttribute("dishes", dishName);
		return "AssignDishToHotel";
	}

	@RequestMapping(value = "/assignHotels")
	public String assignHotels(@RequestParam("hotelId") int hotelId, @RequestParam("dishId") int dishId) {
		hotelService.addDishToHotels(hotelId, dishId);
		return "redirect:/assignHotelsToDish";
	}

	@RequestMapping(value = "/updateDish", method = RequestMethod.GET)
	public String loadForUpdate(Model model) {
		List<Dish> dishName = hotelService.getAllDishName();
		model.addAttribute("dishes", dishName);
		return "updateDish";
	}

	@PostMapping("/updateDish")
	public String updateDish(@RequestParam("dishId") int dishId, HttpSession session) throws ServiceException {
		hotelService.updateDish(dishId);
		return "redirect:/updateDish";
	}

	@RequestMapping(value = "/deleteDish", method = RequestMethod.GET)
	public String loadForDelete() {
		return "deleteDish";
	}

	@PostMapping("/deleteDish")
	public String deleteDish(@RequestParam("dishId") int dishId, HttpSession session) throws ServiceException {
		hotelService.deleteDish(dishId);
		return "redirect:/deleteDish";
	}

	@GetMapping("/getAll")
	public String getAllDetails(Model model) {
		List<Hotel> hotels = hotelService.getAllDetails();
		System.out.println(hotels.size());
		model.addAttribute("hotel", hotels);
		for (Hotel hotel : hotels) {
			System.out.println(hotel.getAverargeHotelRating());
		}
		return "getAll";
	}
}
