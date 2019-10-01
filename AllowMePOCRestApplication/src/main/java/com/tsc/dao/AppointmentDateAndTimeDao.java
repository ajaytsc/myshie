package com.tsc.dao;

import java.util.List;

import com.tsc.entities.AppointmentDateAndTime;



public interface AppointmentDateAndTimeDao {
	 List<AppointmentDateAndTime> checkSlote(AppointmentDateAndTime appointmentDateAndTime);

	void bookAppointment(AppointmentDateAndTime bookAppointment);

	List<AppointmentDateAndTime> getAllAppointmentOfUser();

	/*
	 * void bookAppointment(AppointmentDateAndTime bookAppointment, GuestSignUp
	 * guest);
	 */

//	void bookAppointment(GuestBookAppointment bookAppointment);
}
