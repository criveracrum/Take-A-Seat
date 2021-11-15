package edu.depaul.se452.group4.takeaseat.demo.amenities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.depaul.se452.group4.takeaseat.demo.spaces.Spaces;
import lombok.Data;

@Data
@Entity
@Table(name = "amenities")
public class Amenities {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amenity_name")
    private String amenityName;

    @Column(name = "workspace_type")
    private String workspaceType;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "space_id")
    private Spaces spaces;


}
