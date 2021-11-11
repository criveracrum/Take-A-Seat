package edu.depaul.se452.group4.takeaseat.demo.spaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.depaul.se452.group4.takeaseat.demo.amenities.AmenitiesRepository;
import edu.depaul.se452.group4.takeaseat.demo.workspace.WorkspaceRepository;

@Controller
@RequestMapping("spaces")
public class SpacesController {

    
    @Autowired
    private SpacesRepository spacesRepository;

    @Autowired
    private AmenitiesRepository amenitiesRepository;

    @Autowired
    private WorkspaceRepository workspaceRepository;

    @GetMapping
    public String showAllWorkspaces(Model model) {
        model.addAttribute("Spaces", new Spaces());
        model.addAttribute("Workspaces", workspaceRepository.findAll());
        model.addAttribute("Amenities", amenitiesRepository.findAll());
        return "spaces/main-list";
    }
}
