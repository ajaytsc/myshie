package com.tsc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsc.dao.AppointmentDateAndTimeDao;
import com.tsc.entities.AppointmentDateAndTime;
import com.tsc.entities.GuestSignUp;
import com.tsc.service.AppointmentDateAndTimeService;

@Service
public class AppointmentDateAndTimeServiceImpl implements AppointmentDateAndTimeService {

	@Autowired
	private AppointmentDateAndTimeDao appointmentDateAndTimeDao;
	
	
	@Override
	public List<AppointmentDateAndTime> checkSlote(AppointmentDateAndTime appointmentDateAndTime) {
	
		return appointmentDateAndTimeDao.checkSlote(appointmentDateAndTime);
	}



	
	  @Override public void bookAppointment(AppointmentDateAndTime bookAppointment) {
	  appointmentDateAndTimeDao.bookAppointment(bookAppointment);
	  
	  }




	@Override
	public List<AppointmentDateAndTime> getAllAppointmentOfUser() {
		return appointmentDateAndTimeDao.getAllAppointmentOfUser();
	}
	 

	/*
	 * @Override public void bookAppointment(GuestBookAppointment bookAppointment) {
	 * appointmentDateAndTimeDao.bookAppointment(bookAppointment);
	 * 
	 * }
	 */
	

}
