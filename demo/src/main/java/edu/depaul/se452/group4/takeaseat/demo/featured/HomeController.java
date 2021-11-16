package edu.depaul.se452.group4.takeaseat.demo.featured;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.depaul.se452.group4.takeaseat.demo.reservation.NewsfeedRepository;

@Controller
@RequestMapping("/")
public class HomeController {


    @Autowired
    private FeaturedRepository featuredRepository;

    @GetMapping
    public String showAllWorkspaces(Model model) {
        model.addAttribute("featured", featuredRepository.findAll());
        
        return "/index";
    }
    
}
