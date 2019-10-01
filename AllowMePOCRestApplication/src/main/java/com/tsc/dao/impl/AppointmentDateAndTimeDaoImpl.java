package com.tsc.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsc.constants.AllConstants;
import com.tsc.dao.AppointmentDateAndTimeDao;
import com.tsc.entities.AppointmentDateAndTime;
import com.tsc.entities.GuestSignUp;


@Repository
@Transactional
public class AppointmentDateAndTimeDaoImpl implements AppointmentDateAndTimeDao {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<AppointmentDateAndTime> checkSlote(AppointmentDateAndTime appointmentDateAndTime) {

		return (List<AppointmentDateAndTime>) entityManager.createNamedQuery(AllConstants.CHECKAPPOINTMENT)
				.setParameter("appointmentDate",appointmentDateAndTime.getAppointmentDate()).getResultList();
	}
	
	@Override
	public void bookAppointment(AppointmentDateAndTime bookAppointment) {
				
	//GuestSignUp guest = bookAppointment.getGuest();
		//entityManager.flush();	
//	entityManager.persist(bookAppointment);	
  entityManager.merge(bookAppointment);
		//entityManager.flush();
	//	entityManager.merge(bookAppointment);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AppointmentDateAndTime> getAllAppointmentOfUser() {
		
		return (List<AppointmentDateAndTime>) entityManager.createNamedQuery("getAllAppointmentOfUser").getResultList();
	}

	

	/*
	 * @Override public void bookAppointment(AppointmentDateAndTime bookAppointment,
	 * GuestSignUp guest) { entityManager.persist(bookAppointment);
	 * 
	 * }
	 */


	/*
	 * @Override public void bookAppointment(GuestBookAppointment bookAppointment) {
	 * entityManager.persist(bookAppointment);
	 * 
	 * }
	 */

}
 