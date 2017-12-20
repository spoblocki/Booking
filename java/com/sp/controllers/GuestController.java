package com.sp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sp.services.GuestService;


@Controller
public class GuestController {
	
	  private GuestService guestService;

	    @Autowired
	    public void setGuestService(GuestService guestService) {
	        this.guestService = guestService;
	    }
	
    @RequestMapping(value = "/guests", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("guests", guestService.listAllGuests());
        System.out.println("Returning guests:");
        return "guests";
    }

}
