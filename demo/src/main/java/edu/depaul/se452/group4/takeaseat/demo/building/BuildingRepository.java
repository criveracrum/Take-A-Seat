package edu.depaul.se452.group4.takeaseat.demo.building;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BuildingRepository extends CrudRepository<Building, Long>{

    @Override
    List<Building> findAll();
}