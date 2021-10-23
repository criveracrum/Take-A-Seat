package edu.depaul.se452.group4.takeaseat.demo.amenities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Amenities {
    
    @Id
    @GeneratedValue
    private Long id;


        
    @Column(name = "amenityName")
    private String amenityName;


}
