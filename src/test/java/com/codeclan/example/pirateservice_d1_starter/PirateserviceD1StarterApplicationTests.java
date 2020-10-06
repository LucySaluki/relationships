package com.codeclan.example.pirateservice_d1_starter;

import com.codeclan.example.pirateservice_d1_starter.models.Pirate;
import com.codeclan.example.pirateservice_d1_starter.models.Raid;
import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import com.codeclan.example.pirateservice_d1_starter.repositories.PirateRepository;
import com.codeclan.example.pirateservice_d1_starter.repositories.RaidRepository;
import com.codeclan.example.pirateservice_d1_starter.repositories.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateserviceD1StarterApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createSinglePirateAndSave(){
		Ship ship = new Ship("The Black Pearl");
		shipRepository.save(ship);
//		Ship ship1 = new Ship("Hai Peng Empress");
//		shipRepository.save(ship1);
		Raid raid= new Raid("Tortuga",1000);
		raidRepository.save(raid);
//		Raid raid1= new Raid("Port-Au-Prince",5000);
//		raidRepository.save(raid1);
		Pirate pirate = new Pirate("Jack", "Sparrow", 32,ship);
		Pirate pirate1 = new Pirate("Hector", "Barbossa",58,ship);
//		Pirate pirate2 = new Pirate("Elizabeth","Swann",30,ship1);
		raid.addPirateToRaid(pirate);
		raid.addPirateToRaid(pirate1);
//		raid1.addPirateToRaid(pirate2);
		pirate.addRaidToPirate(raid);
		pirate1.addRaidToPirate(raid);
//		pirate2.addRaidToPirate(raid1);
		pirateRepository.save(pirate);
		pirateRepository.save(pirate1);
//		pirateRepository.save(pirate2);
	}

}
