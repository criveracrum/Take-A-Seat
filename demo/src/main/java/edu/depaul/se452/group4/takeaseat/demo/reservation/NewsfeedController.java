package edu.depaul.se452.group4.takeaseat.demo.reservation;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("newsfeed")
public class NewsfeedController {
    
    @Autowired
    private NewsfeedRepository newsfeedRepo;

    @Autowired
    private ReservationRepository reservationRepo;

    @GetMapping
    public String showNewsfeed(Model model) {
        newsfeedRepo.deleteAll();
        addToNewsFeed();
        List<Newsfeed> newsfeed=newsfeedRepo.findAll();
        Collections.reverse(newsfeed);
        model.addAttribute("newsfeed", newsfeed);
        return "newsfeed/newsfeed";

    }

    public void addToNewsFeed(){
        List<Reservation> reservations = reservationRepo.findAll();
        for (Reservation reservation : reservations) {
            Newsfeed item = new Newsfeed();
            item.setReservationDateTime(reservation.getReservationDateTime());
            item.setCreatorID(reservation.getCreatorID());
            item.setCreatedDateTime(reservation.getCreatedDateTime());
            item.setReservationNum(reservation.getReservationNumber());
            item.setWorkspaceType(reservation.getSpaceType());
            newsfeedRepo.save(item);
        }
    }
}
