package edu.depaul.se452.group4.takeaseat.demo.spaces;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.depaul.se452.group4.takeaseat.demo.amenities.Amenities;
import edu.depaul.se452.group4.takeaseat.demo.reservation.Reservation;
import edu.depaul.se452.group4.takeaseat.demo.workspace.Workspace;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "spaces")
public class Spaces {
    // id serial  PRIMARY KEY NOT NULL,
    // workspace_type varchar
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="space_id")
    private long id;

    @Column(name="workspace_type")
    private String workspaceType;

    @Column(name="space_name")
    private String spaceName;

    @OneToOne(mappedBy = "spaces")
    @ToString.Exclude
    private Workspace workspace;

    @OneToOne(mappedBy = "spaces")
    @ToString.Exclude
    private Amenities amenity;

    @OneToMany(mappedBy = "spaces")
    @Column(name="reservation_list")
    @ToString.Exclude
    private List<Reservation> reservationList;
    
}
