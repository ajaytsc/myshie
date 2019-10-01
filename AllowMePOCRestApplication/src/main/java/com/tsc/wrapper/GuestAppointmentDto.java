package com.tsc.wrapper;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GuestAppointmentDto {
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String appointmentDate;
    private String appointmentTimeSlot;
	private Integer status;
  
 
	
	public GuestAppointmentDto() {}
	
	public GuestAppointmentDto(String firstName, String lastName,String contactNumber, String address,
			String appointmentDate, String appointmentTimeSlot, Integer status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
        this.contactNumber = contactNumber;
		this.appointmentDate = appointmentDate;
		this.appointmentTimeSlot = appointmentTimeSlot;
		this.status = status;
	
	}

	
		
}




