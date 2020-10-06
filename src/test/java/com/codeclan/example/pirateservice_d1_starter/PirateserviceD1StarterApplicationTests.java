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
		Raid raid= new Raid("Tortuga",1000);
		raidRepository.save(raid);
		Pirate pirate = new Pirate("Jack", "Sparrow", 32,ship);
//		pirateRepository.save(pirate);
		Pirate pirate1 = new Pirate("Hector", "Barbossa",58,ship);
//		pirateRepository.save(pirate1);
		raid.addPirateToRaid(pirate);
		raid.addPirateToRaid(pirate1);
		pirate.addRaidsToPirate(raid);
		pirate1.addRaidsToPirate(raid);
		pirateRepository.save(pirate);
		pirateRepository.save(pirate1);
	}

}
