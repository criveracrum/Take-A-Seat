package edu.depaul.se452.group4.takeaseat.demo.review;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "reviews")
public class Review {
    
    private String reviewer;
    private String spaceName;
    private Integer rating;
    private String reviewText;

}