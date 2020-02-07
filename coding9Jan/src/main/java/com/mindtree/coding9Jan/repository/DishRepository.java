package com.mindtree.coding9Jan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.coding9Jan.entity.Dish;
@Repository
public interface DishRepository extends JpaRepository<Dish, Integer>{

	Optional<Dish> findBydishName(String dishName);

}
