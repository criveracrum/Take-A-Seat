package edu.depaul.se452.group4.takeaseat.demo.employee;

import java.sql.Date;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @Bean
  public CommandLineRunner showEmployees(EmployeeRepository repository) {
    return (args) -> {

      // fetch all Employees
      System.out.println("Employee found with findAll():");
      System.out.println("-------------------------------");
      repository.findAll().forEach((employee) -> {
        System.out.println(employee.toString());
      });
      System.out.println("-------------------------------");
    };
  }

  @Bean
  public CommandLineRunner addEmployee(EmployeeRepository repository) {
    return (args) -> {
      // fetch all Course
      System.out.println("Before Jefferson: " + repository.count());
      Employee employee = new Employee();
      employee.setName("Jefferson James");
      Date birthdate = Date.valueOf("1972-03-31");
      employee.setBirthdate(birthdate);
      repository.save(employee);
      System.out.println("After James: " + repository.count());
    };
  }

  @Bean
  public CommandLineRunner updateEmployee(EmployeeRepository repository) {
    return (args) -> {
      // fetch all Course
      Optional<Employee> stu = repository.findById((long) 100);
      Employee updateEmployee = stu.orElse(new Employee());
      updateEmployee.setName("updated " + updateEmployee.getName());

      System.out.println(stu.toString());

      repository.save(updateEmployee);
      System.out.println("After Jefferson: " + repository.count());
    };
  }

}