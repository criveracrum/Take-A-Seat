package edu.depaul.se452.group4.takeaseat.demo.spaces;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.depaul.se452.group4.takeaseat.demo.amenities.Amenities;
import edu.depaul.se452.group4.takeaseat.demo.workspace.Workspace;
import edu.depaul.se452.group4.takeaseat.demo.amenities.AmenitiesRepository;
import edu.depaul.se452.group4.takeaseat.demo.workspace.WorkspaceRepository;

@Controller
@RequestMapping("spaces")
public class SpacesController {



    @Autowired
    private SpacesService spaService;
    
    @Autowired
    private SpacesRepository spacesRepository;

    @Autowired
    private AmenitiesRepository amenitiesRepository;

    @Autowired
    private WorkspaceRepository workspaceRepository;


    @GetMapping
    public String searchAllWorkspaces(Model model,
                   @Param("keyword") String keyword) {
        List<Spaces>listSpaces = spaService.findAllSpaces(keyword);
        List<Workspace> listWorkspace = spaService.findAllWorkspaces(keyword);
        List<Amenities> listAmenities = spaService.findAllAmenities(keyword);
        model.addAttribute("spaces", listSpaces);
        model.addAttribute("workspaces", listWorkspace);
        model.addAttribute("amenities", listAmenities);
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

    @GetMapping("/delete-workspace/{id}")
    public String deleteWorkspace(@PathVariable("id") String id, Model model) {
        spaService.deleteWorkspaceById(id);
        return "redirect:/spaces";
    } 

    @GetMapping("/delete-amenity/{id}")
    public String deleteAmenity(@PathVariable("id") String id, Model model) {
        spaService.deleteAmenityById(id);
        return "redirect:/spaces";
    } 

    @GetMapping("/edit-workspace/{id}")
    public String showEditWorkspace(@PathVariable("id") String id, Model model) {
        Workspace workspace = spaService.findWorkspaceById(id);
        model.addAttribute("workspaces", workspace);
        return "spaces/edit-workspace";  
    }

    @PostMapping("/edit-workspace")
    public String updateWorkspace(@Valid Workspace workspace, BindingResult result) {
        if (result.hasErrors()) {
            return "/spaces/edit-workspace";
        }

        spaService.updateWorkspace(workspace);
        return "redirect:/spaces";
    }

    @GetMapping("/edit-amenity/{id}")
    public String showEditAmenity(@PathVariable("id") String id, Model model) {
        Amenities amenity = spaService.findAmenityById(id);
        model.addAttribute("amenities", amenity);
        return "spaces/edit-amenity";  
    }

    @PostMapping("/edit-amenity")
    public String updateAmenity(@Valid Amenities amenity, BindingResult result) {
        if (result.hasErrors()) {
            return "/spaces/edit-amenity";
        }

        spaService.updateAmenity(amenity);
        return "redirect:/spaces";
    }




}
