package edu.depaul.se452.group4.takeaseat.demo.featured;


import java.io.Serializable;
import java.util.Date;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import edu.depaul.se452.group4.takeaseat.demo.spaces.Spaces;
import edu.depaul.se452.group4.takeaseat.demo.workspace.Workspace;

@Data
@Document(collection = "featured")
public class Featured implements Serializable{
    
    private String workspaceName;
    private String workspaceType;
    private int size;
    private long id;

    

}
    