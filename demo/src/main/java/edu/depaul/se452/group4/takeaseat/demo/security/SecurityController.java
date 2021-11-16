package edu.depaul.se452.group4.takeaseat.demo.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class SecurityController {

    @GetMapping
    public String login() {
        return "login";
    }    
    
}
