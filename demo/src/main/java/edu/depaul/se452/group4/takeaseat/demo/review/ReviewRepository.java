package edu.depaul.se452.group4.takeaseat.demo.review;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, String>{

    @Override
    List<Review> findAll();
}