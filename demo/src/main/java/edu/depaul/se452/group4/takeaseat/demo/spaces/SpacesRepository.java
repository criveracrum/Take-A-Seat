package edu.depaul.se452.group4.takeaseat.demo.spaces;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SpacesRepository extends CrudRepository<Spaces, Long>{

    @Override
    List<Spaces> findAll();
}