package edu.depaul.se452.group4.takeaseat.demo.team;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Data
@Entity
public class Team {
  @Id // primary key
  @GeneratedValue
  private long id;

  @Column(name = "teamname")
  private String name;

  @Column(name = "employeecount")
  private String count;

}
