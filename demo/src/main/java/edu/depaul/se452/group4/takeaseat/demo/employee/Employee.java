package edu.depaul.se452.group4.takeaseat.demo.employee;

import java.sql.Date;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
  @Id // primary key
  @GeneratedValue
  private long id;

  @Column(name = "emp_id")
  private String employeeId;

  @Column(name = "fullname")
  public String name;

  @Column(name = "birthdate")
  public Date birthdate;

}
