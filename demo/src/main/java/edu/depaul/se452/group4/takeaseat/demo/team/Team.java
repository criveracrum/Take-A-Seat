package edu.depaul.se452.group4.takeaseat.demo.team;

import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import lombok.ToString;
import edu.depaul.se452.group4.takeaseat.demo.employee.Employee;

@Data
@Entity
@Table(name = "team")
public class Team {
  @Id // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "team_id", nullable = false)
  private long id;

  @Column(name = "teamname")
  private String name;

  @OneToMany(mappedBy = "team")
  @Column(name = "employee_list")
  @ToString.Exclude
  public List<Employee> employeeList;

  /*
   * @OneToOne(mappedBy = "team")
   * 
   * @ToString.Exclude private Employee employee;
   */

}
