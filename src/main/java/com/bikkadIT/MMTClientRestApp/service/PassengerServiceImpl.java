package com.bikkadIT.MMTClientRestApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.bikkadIT.MMTClientRestApp.model.Passenger;
import com.bikkadIT.MMTClientRestApp.model.Ticket;
import com.bikkadIT.MMTClientRestApp.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements ServiceI{
	
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@Override
	public Ticket bookTicket(Passenger psg) {
		
		Passenger psg1 = passengerRepository.save(psg);
		
		
//		if(psg1!=null) {
//		Ticket ticket = new Ticket();
//		
//		ticket.setPnr(111);
//		ticket.setTicketPrice(111.00);
//		ticket.setTicketStatus("Confirmed");
//		ticket.setTid(2);
//		
//		return ticket;
//		}else {
//			
//			return null;
//		}
			
			String url="http://localhost:9292/bookTicket";
			
//			RestTemplate rt=new RestTemplate();
//			ResponseEntity<Ticket> forEntity = rt.postForEntity(url, psg, Ticket.class);
//			Ticket body = forEntity.getBody();
//			
//			return body;
			
			WebClient webClient = WebClient.create();
			
			Ticket ticket = webClient.post().uri(url).contentType(MediaType.APPLICATION_JSON)
							.accept(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(psg))
							.retrieve().bodyToMono(Ticket.class).block();
			
			return ticket;
	}


}
