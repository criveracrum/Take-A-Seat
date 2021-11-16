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
     
    @Column(name="buildingName")
    private String buildingName;

    @Column(name="desks")
    private int numberOfDesks;

    @Column(name="booth")
    private int numberOfBooths;

    @Column(name="cubicle")
    private int numberOfCubicles;

    @Column(name="hightop")
    private int numberOfHighTops;

    @Column(name="conferenceRoom")
    private int numberOfConferenceRooms;

    @Column(name="doubleDesk")
    private int numberOfDoubleDesks;

    @Column(name="meetingRoom")
    private int numberOfMeetingRooms;
}
