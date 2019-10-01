package com.tsc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsc.dao.GuestDao;
import com.tsc.dto.response.Response;

import com.tsc.entities.GuestSignUp;
import com.tsc.service.GuestService;


@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestDao guestDao;

	/*
	 * @Override public Response<GuestSignUp> guestSignup(GuestSignUp guest) {
	 * 
	 * 
	 * return guestDao.guestSignup(guest); }
	 */
	
	@Override
	public void guestSignup(GuestSignUp guest) {

		guestDao.guestSignup(guest);
	//	return guestDao.guestSignup(guest);
	}

	
	
	/*
	 * @Override public Response<GuestSignUp> guestSignin(String email, String
	 * password) {
	 * 
	 * return guestDao.guestSignin(email,password); }
	 */

	
	/*
	 * @Override public GuestSignUp guestSignin(String email, String password) {
	 * 
	 * return guestDao.guestSignin(email, password); }
	 * 
	 */
	
	@Override
	public List<GuestSignUp>getAllGuest() {

		return guestDao.getAllGuest();
	}



	@Override
	public GuestSignUp guestSignin( GuestSignUp guest) {
		
		
		
		System.out.println("");
		
		return  guestDao.guestSignin(guest);
	}

	/*
	 * @Override public Boolean confirmAppointment(Integer id, String status) {
	 * 
	 * return guestDao.confirmAppointment(id, status); }
	 */
	 

}
