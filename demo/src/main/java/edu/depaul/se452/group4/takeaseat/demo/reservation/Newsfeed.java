package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.io.Serializable;
import java.util.Date;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "newsfeed")
public class Newsfeed implements Serializable{
    
    private String reservationNum;
    private String workspaceType;
    private String creatorID;
    private Date createdDateTime;
    private Date reservationDateTime;
}