package com.mindtree.coding9Jan.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.coding9Jan.controller.AppController;

@ControllerAdvice(assignableTypes = { AppController.class })
public class HotelExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionHandler(Exception e) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("status", HttpStatus.NOT_FOUND.value());
		modelAndView.addObject("ErrorMessage", e.getMessage());
		modelAndView.addObject("TimeStamp", new Date());
		modelAndView.setViewName("error");
		return modelAndView;

	}
}
