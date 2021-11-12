package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    @Autowired
    private NewsfeedRepository newsfeedRepo;

    @GetMapping
    public String showAllReservations(Model model) {
        List<Reservation> resList = resService.findAll();

        model.addAttribute("reservations", resList);
        return "reservations/list";

    }

    @GetMapping("/create")
    public String showAddForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("workspaces", workspaceRepo.findAll());
        model.addAttribute("amenities", amenityRepo.findAll());
        return "reservations/create-reservation";
    }

    @PostMapping("/create")
    public String add(@Valid Reservation reservation, BindingResult result, Model model){
        if (result.hasErrors()) {
            return "reservations/create-reservation";
          }
        String resNum = String.valueOf((int) Math.floor(Math.random()*(99999-11112+1)+11112));
        reservation.setReservationNumber(resNum);
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        reservation.setCreatedDateTime(now);
        resService.update(reservation);
        addToNewsFeed(reservation);
        model.addAttribute("reservations", resService.findAll());
        return "redirect:/reservations";
    }
    public void addToNewsFeed(Reservation reservation){
        Newsfeed item = new Newsfeed();
        item.setReservationDateTime(reservation.getReservationDateTime());
        item.setCreatorID(reservation.getCreatorID());
        item.setCreatedDateTime(reservation.getCreatedDateTime());
        item.setReservationNum(reservation.getReservationNumber());
        item.setWorkspaceType(reservation.getSpaceType());
        newsfeedRepo.save(item);
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String resId, Model model) {
        resService.deleteById(resId);
        return "redirect:/reservations";
    } 
    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") String resId, Model model) {
        Reservation reservation = resService.findById(resId);
        model.addAttribute("reservation", reservation);
        return "reservations/edit-reservation";  
    }
    @PostMapping("/edit")
    public String update(@Valid Reservation reservation, BindingResult result) {
        if (result.hasErrors()) {
        return "reservations/create-reservation";
        }

        resService.update(reservation);
        return "redirect:/reservations";
    }
    

}