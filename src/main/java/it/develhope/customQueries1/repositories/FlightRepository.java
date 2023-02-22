package it.develhope.customQueries1.repositories;

import it.develhope.customQueries1.entities.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Drumstyle92
 * Repository interface which will give the possibility to use different methods to the controllers
 */
@Repository
public interface FlightRepository extends JpaRepository<FlightEntity,Long> {

}
