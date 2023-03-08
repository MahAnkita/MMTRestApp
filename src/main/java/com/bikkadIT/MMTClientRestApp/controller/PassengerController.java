package com.bikkadIT.MMTClientRestApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIT.MMTClientRestApp.model.Passenger;
import com.bikkadIT.MMTClientRestApp.model.Ticket;
import com.bikkadIT.MMTClientRestApp.service.ServiceI;

@RestController
public class PassengerController {
	
	@Autowired
	private ServiceI serviceI;
	
	@PostMapping(value="/bookTicket", consumes="application/json",produces="application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger psg) {
		
		Ticket ticket = serviceI.bookTicket(psg);
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}

}
