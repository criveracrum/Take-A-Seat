package edu.depaul.se452.group4.takeaseat.demo.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

  List<Employee> findByEmployeeId(String employeeId);

}
