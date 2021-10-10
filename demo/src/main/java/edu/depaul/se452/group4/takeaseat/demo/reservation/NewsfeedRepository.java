package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsfeedRepository extends MongoRepository<Newsfeed, String>{

    @Override
    List<Newsfeed> findAll();
}