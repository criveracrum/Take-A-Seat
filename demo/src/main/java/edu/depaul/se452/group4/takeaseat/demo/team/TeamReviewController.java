package edu.depaul.se452.group4.takeaseat.demo.team;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("teamreviews")
public class TeamReviewController {

  @Autowired
  private TeamReviewRepository teamReviewRepo;

  @GetMapping
  public String showTeamReviews(Model model) {

    List<TeamReview> reviews = teamReviewRepo.findAll();
    Collections.reverse(reviews);
    model.addAttribute("reviews", reviews);
    return "team/reviews";

  }
}
