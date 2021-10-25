package edu.depaul.se452.group4.takeaseat.demo.featured_;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface FeaturedRepository extends MongoRepository<Featured, String>{

    @Override
    List<Featured> findAll();
}