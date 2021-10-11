package edu.depaul.se452.group4.takeaseat.demo.review;

import java.io.Serializable;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "reviews")
public class Review implements Serializable{
    
    private String workspaceType;
    private String creatorID;
    private Integer rating;
    private String reviewcomment;

}