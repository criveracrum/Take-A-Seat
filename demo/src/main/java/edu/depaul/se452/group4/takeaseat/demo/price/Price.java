package edu.depaul.se452.group4.takeaseat.demo.price;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Price {

    // id serial  PRIMARY KEY NOT NULL
    // price SMALLINT
    @Id
    @GeneratedValue
    private long id;
    
    @Column(name="workspace_size")
    private int workspace_size;


    @Column(name="price")
    private long price;

}
