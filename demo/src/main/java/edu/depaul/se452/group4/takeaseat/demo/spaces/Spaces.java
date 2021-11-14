package edu.depaul.se452.group4.takeaseat.demo.spaces;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.depaul.se452.group4.takeaseat.demo.amenities.Amenities;
import edu.depaul.se452.group4.takeaseat.demo.workspace.Workspace;
import lombok.Data;

@Data
@Entity
@Table(name = "spaces")
public class Spaces {
    // id serial  PRIMARY KEY NOT NULL,
    // workspace_type varchar
    @Id
    @GeneratedValue
    @Column(name="space_id")
    private long spaceID;

    @Column(name="workspace_type")
    private String workspaceType;

    @Column(name="space_name")
    private String spaceName;

    @OneToOne(mappedBy = "spaces")
    private Workspace workspace;

    @OneToOne(mappedBy = "spaces")
    private Amenities amenity;
    
}
