package edu.depaul.se452.group4.takeaseat.demo.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository repository;

  public List<Employee> findAll() {
    return repository.findAll();
  }

  public Employee update(Employee employee) {
    repository.save(employee);
    return employee;
  }

  public Employee findById(String id) {
    return repository.findById(Long.parseLong(id)).get();
  }

  public Employee findByEmployeeId(String employeeId) {
    return repository.findByEmployeeId(employeeId).get(0);
  }

  public void deleteById(String id) {
    repository.deleteById(Long.parseLong(id));
  }

}
