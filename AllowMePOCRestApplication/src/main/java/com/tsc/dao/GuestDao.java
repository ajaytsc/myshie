package com.tsc.dao;

import java.util.List;

import com.tsc.dto.response.Response;
import com.tsc.entities.GuestSignUp;


public interface GuestDao {

	/* Response<GuestSignUp> guestSignup(GuestSignUp guest); */

	void guestSignup(GuestSignUp guest);
	//GuestSignUp guestSignin(String email, String password);

	List<GuestSignUp> getAllGuest();


	GuestSignUp guestSignin(GuestSignUp guest);
	
	/* Response<GuestSignUp> guestSignin(String email, String password); */

	/*
	 * List<Guest> getAllGuest();
	 * 
	 * Boolean confirmAppointment(Integer id, String status);
	 */

}
