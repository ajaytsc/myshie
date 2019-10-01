package com.tsc.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tsc.entities.Guard;
import com.tsc.service.GuardService;

@Component
@Path("/guard")

public class GuardRestServices {
	@Autowired
	private GuardService guardService;
	
	@GET
	@Path("/testApi")
	public String testGuard() {
		return "testing api for guard....";
	}

	
	/************** This Api for create guest signup ************/

	@POST
	@Path("/signup")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@CrossOrigin
	public void guardSignup(Guard guard) {
		// guestService.guestSignup(guest);
		guardService.guardSignup(guard);
//		return Response.ok();
	}

	

	/************** This Api for guard signIn ************/

	@POST

	@Path("/signin")

	@Consumes(MediaType.APPLICATION_JSON)

	@Produces(MediaType.APPLICATION_JSON)

	@CrossOrigin
	public Guard guardSignin(Guard guard) {

		System.out.println("*****************************************");
		System.out.println("Email : " + guard.getEmail());
		System.out.println("Password : " + guard.getPassword());
		System.out.println("*****************************************");

		
		return guardService.guardSignin(guard);
	}
	
	
}
