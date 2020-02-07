package com.mindtree.coding9Jan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.coding9Jan.entity.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{

	Optional<Hotel> findByhotelName(String hotelName);

}
