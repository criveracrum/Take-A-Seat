package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("reservations")
public class ReservationController {

    @Autowired
    private ReservationService resService;

    @GetMapping
    public String showAllReservations(Model model) {
        List<Reservation> resList = resService.findAll();

        model.addAttribute("reservations", resList);
        return "reservations/list";

    }

    @GetMapping("/create")
    public String showAddForm(Reservation reservation) {
        return "reservations/create-reservation";
    }

    
    

}