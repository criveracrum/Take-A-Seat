package edu.depaul.se452.group4.takeaseat.demo.team;

import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("teamreviews")
public class TeamReviewController {

    @Autowired
    private TeamReviewRepository teamReviewRepo;

    @Autowired
    private TeamService teamService;

    @GetMapping
    public String showTeamReviews(Model model) {
  
      List<TeamReview> reviews = teamReviewRepo.findAll();
      Collections.reverse(reviews);
      model.addAttribute("reviews", reviews);
      model.addAttribute("teams", teamService.findAll());
      return "teamreviews/list-reviews";
  
    }
    @GetMapping("/add")
    public String addTeamReview(Model model) {
      model.addAttribute("teamreview", new TeamReview());
      model.addAttribute("teams", teamService.findAll());
      return "teamreviews/add-teamreview";
  
    }
    @PostMapping("/add")
    public String createTeamReview(@Valid TeamReview review, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "teamreviews/add-teamreview";
        }
        
        teamReviewRepo.save(review);
      return "redirect:/teamreviews";
  
    }
    @GetMapping("/delete/{reviewer}")
    public String delete(@PathVariable("reviewer") String id, Model model) {
        teamReviewRepo.deleteById(id);  
        return "redirect:/teamreviews";
    } 
}
