package edu.depaul.se452.group4.takeaseat.demo.featured;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.depaul.se452.group4.takeaseat.demo.reservation.NewsfeedRepository;
import edu.depaul.se452.group4.takeaseat.demo.spaces.Spaces;
import edu.depaul.se452.group4.takeaseat.demo.workspace.Workspace;
import edu.depaul.se452.group4.takeaseat.demo.workspace.WorkspaceRepository;

@Controller
@RequestMapping("/featured")
public class FeaturedController {


    @Autowired
    private FeaturedRepository featuredRepository;

    @Autowired
    private WorkspaceRepository workspaceRepository;

    @GetMapping
    public String showAllWorkspaces(Model model) {
        model.addAttribute("featured", new Featured());
        model.addAttribute("workspaces", workspaceRepository.findAll());
        
        return "featured/add";
    }

    @PostMapping("/add")
    public String add(@Valid Featured featured, BindingResult result, Model model){
        Workspace workspace = workspaceRepository.findById(featured.getId()).orElseThrow(
            () -> new IllegalArgumentException("Invalid workspace id:" + featured.getId())
    );
        
        featured.setSize(workspace.getMaxSize());
        featured.setWorkspaceName(workspace.getWorkspacename());
        featured.setWorkspaceType("WORKSPACE");
        if (result.hasErrors()) {
            return "featured/add";
        }
        featuredRepository.save(featured);
    
        model.addAttribute("featured", featuredRepository.findAll());
        return "redirect:/";
    }
    
}
