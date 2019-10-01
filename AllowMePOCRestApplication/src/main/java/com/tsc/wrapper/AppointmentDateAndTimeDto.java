package com.tsc.wrapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppointmentDateAndTimeDto {
	

	public AppointmentDateAndTimeDto(String appointmentDate, String appointmentTimeSlot, String tag) {
		super();
		this.appointmentDate = appointmentDate;
		this.appointmentTimeSlot = appointmentTimeSlot;
		this.tag = tag;
	}

	private String appointmentDate;

	private String appointmentTimeSlot;
	
	private String tag;
	
	public  AppointmentDateAndTimeDto(){}

	
}
