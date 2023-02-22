package it.develhope.customQueries1.controllers;

import it.develhope.customQueries1.entities.FlightEntity;
import it.develhope.customQueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Drumstyle92
 * Controller class with the crud to apply on the reference mapping
 */
@RestController
@RequestMapping("/flights")
public class FlightController {

    /**
     * Automated instantiation of the interface to be able to use the various methods on the mapping
     */
    @Autowired
    private FlightRepository flightRepository;

    /**
     * @return The flight list returns
     * Get method which receives the entire flight list as a response
     */
    @GetMapping
    public List<FlightEntity> getFlights() {
        return flightRepository.findAll();
    }

    /**
     * Post method used creates a list of 50 provisional flights on the database
     */
    @PostMapping
    public void CreateFlights() {
        Random random = new Random();
        List<FlightEntity> flights = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            FlightEntity flight = new FlightEntity();
            flight.setDescription(String.valueOf(random.ints(97, 123).limit(10)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()));
            flight.setFromAirport(String.valueOf(random.ints(97, 123).limit(8)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()));
            flight.setToAirport(String.valueOf(random.ints(97, 123).limit(6)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()));
            flights.add(flight);
        }

        flightRepository.saveAll(flights);

    }

}
