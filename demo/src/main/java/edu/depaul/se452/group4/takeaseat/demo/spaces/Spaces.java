package edu.depaul.se452.group4.takeaseat.demo.spaces;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Spaces {
    // id serial  PRIMARY KEY NOT NULL,
    // workspace_type varchar
    @Id
    @GeneratedValue
    private long id;

    @Column(name="workspace_type")
    private String workspaceType;
    
}
