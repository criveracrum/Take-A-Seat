package edu.depaul.se452.group4.takeaseat.demo.reservation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="reservations")
public class Reservation {
    // id serial  PRIMARY KEY NOT NULL,
    // date_created DATE CURRENT_DATE,
    // res_date DATE,
    // employee_id INT NOT NULL,
    // workspace_type varchar
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "reservation_num")
    private String reservationNumber;


    @Column(name="res_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime reservationDateTime;

    @Column(name="date_created")
    @GeneratedValue
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime createdDateTime;

    @Column(name="creator_id")
    private long creatorID;

    @Column(name="space_type")
    private String spaceType;

    @Column(name="space_id")
    private long spaceID;
    
}