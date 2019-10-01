package com.tsc.service;

import java.util.List;

import com.tsc.entities.AppointmentDateAndTime;
import com.tsc.entities.GuestSignUp;


public interface AppointmentDateAndTimeService {

	 List<AppointmentDateAndTime> checkSlote(AppointmentDateAndTime appointmentDateAndTime);

	
	  void bookAppointment(AppointmentDateAndTime bookAppointment);


	List<AppointmentDateAndTime> getAllAppointmentOfUser();
	 

	/*
	 * void bookAppointment(AppointmentDateAndTime bookAppointment, GuestSignUp
	 * guest);
	 */
	//void bookAppointment(GuestBookAppointment bookAppointment);
}
