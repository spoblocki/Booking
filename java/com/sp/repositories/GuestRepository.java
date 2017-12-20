package com.sp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sp.model.Guest;

public interface GuestRepository extends CrudRepository<Guest, Integer> {

}
