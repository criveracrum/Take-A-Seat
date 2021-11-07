package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.depaul.se452.group4.takeaseat.demo.amenities.AmenitiesRepository;
import edu.depaul.se452.group4.takeaseat.demo.workspace.WorkspaceRepository;

@Controller
@RequestMapping("reservations")
public class ReservationController {

    @Autowired
    private ReservationService resService;

    @Autowired
    private WorkspaceRepository workspaceRepo;
    
    @Autowired
    private AmenitiesRepository amenityRepo;

    @GetMapping
    public String showAllReservations(Model model) {
        List<Reservation> resList = resService.findAll();

        model.addAttribute("reservations", resList);
        return "reservations/list";

    }

    @GetMapping("/create")
    public String showAddForm(Model model) {
        model.addAttribute("workspaces", workspaceRepo.findAll());
        model.addAttribute("amenities", amenityRepo.findAll());
        return "reservations/create-reservation";
    }


    
    

}