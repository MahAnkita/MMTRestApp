package com.bikkadIT.MMTClientRestApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.MMTClientRestApp.model.Passenger;


@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}
