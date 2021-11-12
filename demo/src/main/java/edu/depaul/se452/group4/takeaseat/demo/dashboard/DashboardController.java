package edu.depaul.se452.group4.takeaseat.demo.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashboard")
public class DashboardController {

    @GetMapping
    public String getDashboard(Model model) {
        
        return "dashboard/admin-all";
    }
    
}
