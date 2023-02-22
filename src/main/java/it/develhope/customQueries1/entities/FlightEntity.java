package it.develhope.customQueries1.entities;

import jakarta.persistence.*;

/**
 * @author Drumstyle92
 * Entity class that has characteristics
 * of the flights and maps them on the database in the form of a table with records
 */
@Entity
@Table
public class FlightEntity {

    /**
     * Variable id representing the autoincrementing primary key of the table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Variable representing the description of the flight mapped in column
     */
    @Column
    private String description;

    /**
     * Variable representing the departure airport of the flight mapped in column
     */
    @Column(name = "from_airport")
    private String fromAirport;

    /**
     * Variable representing the arrival airport of the flight mapped in column
     */
    @Column(name = "to_airport")
    private String toAirport;

    /**
     * Flight status enumerated variable
     */
    @Enumerated(EnumType.STRING)
    private FlightStatus status = FlightStatus.ONTIME;

    /**
     * Default constructor of the class
     */
    public FlightEntity(){}

    /**
     * @param id          Flight id parameter
     * @param description Flight description parameter
     * @param fromAirport Flight departure airport name parameter
     * @param toAirport   Flight arrival airport name parameter
     * @param status      Flight status parameter
     * Parameterized constructor of the class
     */
    public FlightEntity(Long id, String description, String fromAirport, String toAirport, FlightStatus status) {
        this.id = id;
        this.description = description;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.status = status;
    }

    /**
     * @return the id
     * Method for encapsulation
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id
     * Method for encapsulation
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the description
     * Method for encapsulation
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description
     * Method for encapsulation
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the from airport
     * Method for encapsulation
     */
    public String getFromAirport() {
        return fromAirport;
    }

    /**
     * @param fromAirport the from airport
     * Method for encapsulation
     */
    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    /**
     * @return the to airport
     * Method for encapsulation
     */
    public String getToAirport() {
        return toAirport;
    }

    /**
     * @param toAirport the to airport
     * Method for encapsulation
     */
    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    /**
     * @return the status
     * Method for encapsulation
     */
    public FlightStatus getStatus() {
        return status;
    }

    /**
     * @param status the status
     * Method for encapsulation
     */
    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}
