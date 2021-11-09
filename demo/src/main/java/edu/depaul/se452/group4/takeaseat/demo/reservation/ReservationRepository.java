package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long>{

    @Override
    List<Reservation> findAll();
}

