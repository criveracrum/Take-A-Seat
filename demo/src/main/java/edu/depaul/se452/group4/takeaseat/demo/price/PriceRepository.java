package edu.depaul.se452.group4.takeaseat.demo.price;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long>{

    @Override
    List<Price> findAll();
}