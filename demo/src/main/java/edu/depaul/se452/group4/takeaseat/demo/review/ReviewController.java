package edu.depaul.se452.group4.takeaseat.demo.review;

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

import edu.depaul.se452.group4.takeaseat.demo.spaces.Spaces;
import edu.depaul.se452.group4.takeaseat.demo.spaces.SpacesRepository;


@Controller
@RequestMapping("reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepo;

    @Autowired
    private SpacesRepository spaceRepo;

    @GetMapping
    public String showTeamReviews(Model model) {
      List<Review> reviews = reviewRepo.findAll();
      Collections.reverse(reviews);
      model.addAttribute("reviews", reviews);
      model.addAttribute("spaces", spaceRepo.findAll());
      return "reviews/list-reviews";
  
    }
    @GetMapping("/add")
    public String addTeamReview(Model model) {
      model.addAttribute("review", new Review());
      model.addAttribute("spaces", spaceRepo.findAll());
      return "reviews/add-review";
  
    }
    @PostMapping("/add")
    public String createTeamReview(@Valid Review review, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "reviews/add-review";
        }
        
        reviewRepo.save(review);
      return "redirect:/reviews";
  
    }
    
}
