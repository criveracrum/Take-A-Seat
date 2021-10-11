package edu.depaul.se452.group4.takeaseat.demo.employee;

import java.time.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Employees")
public class Employee {
  @Id // primary key
  @GeneratedValue
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "birthdate")
  private LocalDate birthdate;

}
