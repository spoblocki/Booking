package com.sp.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.sp.model.Guest;
import com.sp.repositories.GuestRepository;

public class GuestServiceImpl {

	private GuestRepository guestRepository;

	@Autowired
	public void setGuestRepository(GuestRepository guestRepository) {
		this.guestRepository = guestRepository;
	}


	public Iterable<Guest> listAllGuests() {
		return guestRepository.findAll();
	}

}
