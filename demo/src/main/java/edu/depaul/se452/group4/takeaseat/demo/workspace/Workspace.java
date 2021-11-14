package edu.depaul.se452.group4.takeaseat.demo.workspace;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.depaul.se452.group4.takeaseat.demo.spaces.Spaces;
import lombok.Data;

@Data
@Entity
@Table(name = "workspace")
public class Workspace {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "workspacename")
    private String workspacename;

    @Column(name = "max_size")
    private int maxSize;
    
    @Column(name = "workspace_type")
    private int workspaceType;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "space_id")
    private Spaces spaces;

}
