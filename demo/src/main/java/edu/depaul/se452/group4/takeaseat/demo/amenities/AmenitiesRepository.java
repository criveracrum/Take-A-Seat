package edu.depaul.se452.group4.takeaseat.demo.amenities;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AmenitiesRepository extends JpaRepository<Amenities,Long> {
    
    @Query("Select s FROM Amenities s WHERE s.amenityName LIKE %?1%")
    List<Amenities> findAll(String keyword);
    }

    //       + "OR s.id LIKE %?1%"
         //       +  "OR s.workspaceType LIKE %?1%")