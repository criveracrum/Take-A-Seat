package edu.depaul.se452.group4.takeaseat.demo.spaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SpacesRepository extends CrudRepository<Spaces, Long>{

    @Query("Select s FROM Spaces s WHERE s.spaceName LIKE %?1%")
    List<Spaces> findAll(String keyword);

}