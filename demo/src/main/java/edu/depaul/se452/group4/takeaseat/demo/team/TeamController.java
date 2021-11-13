package edu.depaul.se452.group4.takeaseat.demo.team;

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
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("team")
public class TeamController {

  @Autowired
  private TeamService teamService;

  @GetMapping
  public ModelAndView showTeams() {
    ModelAndView mv = new ModelAndView("team/list-teams");
    mv.addObject("team", teamService.findAll());
    return mv;
  }

  @GetMapping("/add")
  public String showSignUpForm(Team team) {
    return "team/add-team";
  }

  @PostMapping
  public String add(@Valid Team team, BindingResult result, Model model) {
    if (result.hasErrors()) {
      return "team/add-team";
    }

    teamService.update(team);
    model.addAttribute("team", teamService.findAll());
    return "redirect:/team";
  }

  @GetMapping("/edit/{id}")
  public String showEdit(@PathVariable("id") String id, Model model) {
    Team team = teamService.findById(id);
    model.addAttribute("team", team);
    return "team/edit-team";
  }

  @PostMapping("/edit")
  public String update(@Valid Team team, BindingResult result) {
    if (result.hasErrors()) {
      return "team/edit-team";
    }

    teamService.update(team);
    return "redirect:/team";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable("id") String Id, Model model) {
    teamService.deleteById(Id);
    return "redirect:/team";
  }

}
