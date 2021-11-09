package edu.depaul.se452.group4.takeaseat.demo.employee;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable{
  @Id // primary key
  @GeneratedValue
  private long id;

  @Column(name = "fullname")
  public String name;

  @Column(name = "birthdate")
  public Date birthdate;

}
