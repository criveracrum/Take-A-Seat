package edu.depaul.se452.group4.takeaseat.demo.persistence.relational;


@Data
@Entity
public class Amenities {
    
    @Id
    @GeneratedValue
    private Long id;


        
    @Column(name = "amenityName")
    private String amenityName;


}
