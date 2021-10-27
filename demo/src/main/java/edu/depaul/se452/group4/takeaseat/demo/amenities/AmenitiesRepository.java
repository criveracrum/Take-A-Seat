package edu.depaul.se452.group4.takeaseat.demo.amenities;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AmenitiesRepository extends JpaRepository<Amenities,Long> {
    
    @Override
    List<Amenities> findAll();
    }

