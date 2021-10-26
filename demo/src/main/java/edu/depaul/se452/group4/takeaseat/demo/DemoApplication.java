package edu.depaul.se452.group4.takeaseat.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.depaul.se452.group4.takeaseat.demo.employee.Employee;
import edu.depaul.se452.group4.takeaseat.demo.employee.EmployeeRepository;


@SpringBootApplication
public class DemoApplication {
	@Value( "${app.greeting}" )
    private String greeting;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
    public CommandLineRunner showMessage() {
      return (args) -> {
        System.out.println("begin encoded");
        System.out.println(greeting);
        System.out.println("end encoded");
      };
    }  
    
    

    
    
  

}
