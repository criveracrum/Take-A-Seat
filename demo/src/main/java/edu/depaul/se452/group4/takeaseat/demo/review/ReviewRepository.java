package edu.depaul.se452.group4.takeaseat.demo.review;


import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReviewRepository extends MongoRepository<Review, String>{
}