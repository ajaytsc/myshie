package com.tsc.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.tsc.entities.GuestSignUp;
import com.tsc.service.GuestService;

//@EntityScan("com.tsc.entities")
@Component
@Path("/guest")

public class GuestRestServices {

	@Autowired
	private GuestService guestService;
	
	
	/************ This Api for Testing purpose ***********/

	@GET
	@Path("/testApi")
	public String testGuest() {
		return "testing api for guest....";
	}

	/************** This Api for create guest signup ************/

	@POST
	@Path("/signup")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@CrossOrigin
	public void guestSignup(GuestSignUp guest) {
		// guestService.guestSignup(guest);
		guestService.guestSignup(guest);
//		return Response.ok();
	}

	/************** This Api for guest signIn ************/

	@POST

	@Path("/signin")

	@Consumes(MediaType.APPLICATION_JSON)

	@Produces(MediaType.APPLICATION_JSON)

	@CrossOrigin
	public GuestSignUp guestSignin(GuestSignUp guest) {

		System.out.println("*****************************************");
		System.out.println("Email : " + guest.getEmail());
		System.out.println("Password : " + guest.getPassword());
		System.out.println("*****************************************");

		return guestService.guestSignin(guest);
	}

	/************** This Api for getAllguest ************/

	@GET

	@Path("/getAllGuest")

	@Produces(MediaType.APPLICATION_JSON)

	@CrossOrigin
	public List<GuestSignUp> getAllGuest() {
		List<GuestSignUp> GuestList = guestService.getAllGuest();
		return GuestList;
	}

	/*
	 * @RequestMapping(value="/{checkDate}", method=RequestMethod.GET) //@GET
	 * //@Path("/checkSlote") //@Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @CrossOrigin public AppointmentDateAndTime
	 * checkSlote(@PathVariable(name="appointmentDateAndTime") String
	 * appointmentDateAndTime AppointmentDateAndTime appointmentDateAndTime ) {
	 * 
	 * System.out.println("appointment Date"+appointmentDateAndTime); return null;
	 * 
	 * 
	 * }
	 */

}
