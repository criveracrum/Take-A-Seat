package edu.depaul.se452.group4.takeaseat.demo.team;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import edu.depaul.se452.group4.takeaseat.demo.employee.Employee;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "Team")
public class Team {
  @Id // primary key
  @GeneratedValue
  private long id;

  @Column(name = "team_name")
  private String teamName;

  @Column(name = "employeeCount")
  private String employeeCount;

  @OneToMany
  @JoinTable(name = "TeamMembers", joinColumns = { @JoinColumn(name = "teamID", referencedColumnName = "id") })

  @ToString.Exclude
  private List<Employee> Employees;
}
