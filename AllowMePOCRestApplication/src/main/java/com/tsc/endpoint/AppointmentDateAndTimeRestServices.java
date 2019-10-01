package com.tsc.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tsc.entities.AppointmentDateAndTime;
import com.tsc.entities.GuestSignUp;
import com.tsc.service.AppointmentDateAndTimeService;

@Component
@Path("/appointment")

public class AppointmentDateAndTimeRestServices {
	@Autowired
	private AppointmentDateAndTimeService appointmentDateAndTimeService;

	@GET
	@Path("/testApi")
	public String testApi() {
		return "testing testApi...";
	}

	@POST

	@Path("/checkSlote")

	@Consumes(MediaType.APPLICATION_JSON)

	@Produces(MediaType.APPLICATION_JSON)

	@CrossOrigin
	public List<AppointmentDateAndTime> checkSlote(AppointmentDateAndTime appointmentDateAndTime) {
		return (List<AppointmentDateAndTime>) appointmentDateAndTimeService.checkSlote(appointmentDateAndTime);
	}

	/*************** This Api for book appointment ************/


	@POST

	@Path("/bookAppointment")

	@Consumes(MediaType.APPLICATION_JSON)

	@Produces(MediaType.APPLICATION_JSON)

	@CrossOrigin
	public void bookAppointment(@RequestBody AppointmentDateAndTime bookAppointment,@QueryParam(value = "guestId") Integer guestId) {

		System.out.println("***********************************************");
        System.out.println(guestId);
		System.out.println(bookAppointment);
		System.out.println("***********************************************");
		
		bookAppointment.setGuest(new GuestSignUp(guestId, "","","", "", "","","",1l));
		
		
		//bookAppointment.setGuestList(guestId);
		
	   //guest.setId(guest_id); bookAppointment.setGuest(new GuestSignUp(guest_id));
		appointmentDateAndTimeService.bookAppointment(bookAppointment);

	}

	
	  @GET
	  
	  @Path("/getAllAppointmentOfUser")
	  @Produces(MediaType.APPLICATION_JSON)
	  
	  @CrossOrigin 
	  public List<AppointmentDateAndTime> getAllAppointmentOfUser() {
	  
	  return appointmentDateAndTimeService.getAllAppointmentOfUser();
	  
	  }
	 
	//getAllAppointmentOfUser
}
