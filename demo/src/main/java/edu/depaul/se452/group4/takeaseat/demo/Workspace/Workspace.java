package edu.depaul.se452.group4.takeaseat.demo.workspace;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Workspace {
    
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "workspacename")
    private String workspacename;

    @Column(name = "maxSize")
    @NonNull
    private int maxSize;


}
