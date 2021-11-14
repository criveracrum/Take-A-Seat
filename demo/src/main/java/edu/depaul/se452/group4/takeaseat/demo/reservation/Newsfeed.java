package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "newsfeed")
public class Newsfeed implements Serializable, Comparable<Newsfeed>{
    
    private String reservationNum;
    private String workspaceName;
    private String workspaceType;
    private long creatorID;
    private LocalDateTime createdDateTime;
    private LocalDateTime reservationDateTime;

    @Override
    public int compareTo(Newsfeed u) {
        if (getCreatedDateTime() == null || u.getCreatedDateTime() == null) {
        return 0;
        }
        return getCreatedDateTime().compareTo(u.getCreatedDateTime());
    }
}