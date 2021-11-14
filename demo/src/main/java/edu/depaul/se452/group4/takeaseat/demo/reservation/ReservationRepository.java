package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ReservationRepository extends CrudRepository<Reservation, Long>{

    @Override
    List<Reservation> findAll();
}

