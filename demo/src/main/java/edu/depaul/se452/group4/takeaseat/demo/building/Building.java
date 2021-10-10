package edu.depaul.se452.group4.takeaseat.demo.building;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Building {

    // id serial  PRIMARY KEY NOT NULL
    // building_name varchar
    @Id
    @GeneratedValue
    private long id;
    
     
    @Column(name="building_name")
    private String building_name;
}
