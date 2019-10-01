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

import com.tsc.entities.Host;
import com.tsc.service.HostService;
import com.tsc.wrapper.GuestAppointmentDto;

@Component
@Path("/host")

public class HostRestServices {
	
	@Autowired
	private HostService hostService;


	/**********create Api for testing purpose************/
	
	@GET
	@Path("/testApi")
	public String testHost() {
		return "testing api for Host....";
	}
	
	@POST
    @Path("/signin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@CrossOrigin
	public Host hostSignin(Host host)
	{
		return hostService.hostSignin(host);
	}
	
	
	
	@GET
	@Path("/checkAppointment")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@CrossOrigin
	public List<GuestAppointmentDto> getGuestAppointmentList() {
		return null;
	}
	
}
