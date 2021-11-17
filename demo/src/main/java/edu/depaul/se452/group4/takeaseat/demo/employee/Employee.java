package edu.depaul.se452.group4.takeaseat.demo.employee;

import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import edu.depaul.se452.group4.takeaseat.demo.team.Team;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

  @Id // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "emp_id")
  private String employeeId;

  @Column(name = "fullname")
  public String name;

  @Column(name = "birthdate")
  public Date birthdate;

  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "team_id", nullable = true)
  @ToString.Exclude
  public Team team;
  /*
   * @OneToOne(cascade = CascadeType.ALL)
   * 
   * @MapsId
   * 
   * @JoinColumn(name = "team_id") private Team team;
   */
}
