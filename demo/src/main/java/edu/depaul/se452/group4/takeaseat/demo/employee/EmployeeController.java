package edu.depaul.se452.group4.takeaseat.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepo;

    

    @GetMapping
    public String login(Model model) {

        
        return "employees/profile";

    }
}
