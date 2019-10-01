package com.tsc.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.tsc.endpoint.AppointmentDateAndTimeRestServices;
import com.tsc.endpoint.GuardRestServices;
import com.tsc.endpoint.GuestRestServices;
import com.tsc.endpoint.HostRestServices;



@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(GuestRestServices.class);
		register(GuardRestServices.class);
		register(HostRestServices.class);
		register(AppointmentDateAndTimeRestServices.class);
	}
}
