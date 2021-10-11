package edu.depaul.se452.group4.takeaseat.demo.team;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

import edu.depaul.se452.group4.takeaseat.demo.employee.Employee;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
public class Team {
  @Id // primary key
  @GeneratedValue
  private long id;

  @Column(name = "team_name")
  private String teamName;

  @Column(name = "employeeCount")
  private String employeeCount;

}
