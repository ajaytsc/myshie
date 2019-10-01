package com.tsc.service;

import java.util.List;

import com.tsc.entities.GuestSignUp;


public interface GuestService {

	//Response<GuestSignUp> guestSignup(GuestSignUp guest);
	void guestSignup(GuestSignUp guest);
	/*
	 * List<Guest> getAllGuest();
	 * 
	 * Boolean confirmAppointment(Integer id, String status);
	 */

	List<GuestSignUp> getAllGuest();

	GuestSignUp guestSignin(GuestSignUp guest);

	/* Response<GuestSignUp> guestSignin(String email, String password); */

//	GuestSignUp guestSignin(String email, String password);
}
