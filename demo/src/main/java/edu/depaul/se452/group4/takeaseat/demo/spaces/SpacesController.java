package edu.depaul.se452.group4.takeaseat.demo.spaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.depaul.se452.group4.takeaseat.demo.amenities.Amenities;
import edu.depaul.se452.group4.takeaseat.demo.workspace.Workspace;
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
        model.addAttribute("spaces", spacesRepository.findAll());
        model.addAttribute("workspaces", workspaceRepository.findAll());
        model.addAttribute("amenities", amenitiesRepository.findAll());
        return "spaces/main-list";
    }
    @GetMapping("/workspace-list")
    public String showWorkspaces(Model model) {
        model.addAttribute("workspaces", workspaceRepository.findAll());
        return "spaces/workspace-list";
    }
    @GetMapping("/amenity-list")
    public String showAmenities(Model model) {
        model.addAttribute("amenities", amenitiesRepository.findAll());
        return "spaces/amenity-list";
    }
}
