package com.codeclan.example.pirateservice_d1_starter;

import com.codeclan.example.pirateservice_d1_starter.models.Pirate;
import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import com.codeclan.example.pirateservice_d1_starter.repositories.PirateRepository;
import com.codeclan.example.pirateservice_d1_starter.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PirateserviceD1StarterApplication {
//	@Autowired
//	PirateRepository pirateRepository;
//
//	@Autowired
//	ShipRepository shipRepository;

	public static void main(String[] args) {
		SpringApplication.run(PirateserviceD1StarterApplication.class, args);
	}

//	@Test
//	public void createPirateAndShip(){
//		Ship ship = new Ship("The Flying Dutchman");
//		shipRepository.save(ship);
//
//		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
//		pirateRepository.save(pirate1);
//	}

}
