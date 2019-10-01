package com.tsc.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsc.constants.AllConstants;
import com.tsc.dao.GuestDao;
import com.tsc.dto.response.Response;
import com.tsc.entities.GuestSignUp;
import com.tsc.util.RandomStringUtil;


/*create by manoj bhale*/

@Repository
@Transactional
public class GuestDaoImpl implements GuestDao {

	@PersistenceContext
	private EntityManager entityManager;

	/**************
	 * This Api for create guest
	 * 
	 * @return
	 ************/
	@Override
	public void guestSignup(GuestSignUp guest) {
		// entityManager.persist(guest);
		/*
		 * Session session = (Session) entityManager.getDelegate(); Transaction
		 * transaction = session.beginTransaction(); Integer i = (Integer)
		 * session.save(guest); transaction.commit(); if(i>1) { return true; }
		 */
		entityManager.persist(guest);

		// return Response.ok();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GuestSignUp> getAllGuest() {

		return (List<GuestSignUp>) entityManager.createNamedQuery(AllConstants.GETALLGUEST).getResultList();
	}

	@Override
	public GuestSignUp guestSignin(GuestSignUp guest) {
			
		//return  entityManager.createNamedQuery("getUserByEmailAndPassword",GuestSignUp.class).getSingleResult();
		
		  return (GuestSignUp) entityManager
				.createNamedQuery(AllConstants.GETAUTHENTICATE).setParameter("email",
		  guest.getEmail()).setParameter("password",guest.getPassword()).getSingleResult();
		 
	}

	/*
	 * 
	 * @Override public GuestSignUp guestSignin(String email, String password) { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 */

	/**************
	 * This Api for create guest
	 * 
	 * @return
	 ************//*
					 * @Override public Response<GuestSignUp> guestSignup(GuestSignUp guest) { //
					 * entityManager.persist(guest);
					 * 
					 * Session session = (Session) entityManager.getDelegate(); Transaction
					 * transaction = session.beginTransaction(); Integer i = (Integer)
					 * session.save(guest); transaction.commit(); if(i>1) { return true; }
					 * 
					 * entityManager.persist(guest);
					 * 
					 * return Response.ok();
					 * 
					 * }
					 */

	/*
	 * @Override public Response<GuestSignUp> guestSignin(String email, String
	 * password) { entityManager.createNamedQuery(AllConstants.getEmailAndPassword);
	 * return null; }
	 * 
	 */

	/*
	 * @Override public GuestSignUp guestSignin(String email, String password) {
	 * 
	 * //email.get
	 * 
	 * //return (GuestSignUp)
	 * entityManager.createNamedQuery(AllConstants.getEmailAndPassword).setParameter
	 * ("email","" ).; }
	 */

	/*
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public List<Guest> getAllGuest() { return (List<Guest>)
	 * entityManager.createNamedQuery(AllConstants.GETALLGUEST).getResultList(); }
	 * 
	 * @Override public Boolean confirmAppointment(Integer id, String status) {
	 * 
	 * if (status.equals("ok")) {
	 * 
	 * Guest dbGuest = entityManager.find(Guest.class, id);
	 * System.out.println("First Name : " + dbGuest.getFirstName());
	 * System.out.println("LastName : "+dbGuest.getLastName());
	 * 
	 * String output = RandomStringUtil.getAlphaNumericString(6,
	 * "abcdefghijklmnopqrstuvwxyz"); System.out.println("Random String output : " +
	 * output);
	 * 
	 * } else { System.out.println("please try to next time.......");
	 * 
	 * }
	 * 
	 * return false; }
	 */

}
