package edu.depaul.se452.group4.takeaseat.demo.Featured;


import java.io.Serializable;
import java.util.Date;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "featured")
public class Featured implements Serializable{
    
    private String workspaceID;
    private String workspaceType;
    

}
    