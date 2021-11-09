package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    public List<Reservation> findAll() {
        return repository.findAll();
    }

    public Reservation update(Reservation reservation) {
        repository.save(reservation);
        return reservation;
    }

    public Reservation findById(String id) {
      return repository.findById(Long.parseLong(id)).get();
    }

    public void deleteById(String id) {
        repository.deleteById(Long.parseLong(id));
    }

}
