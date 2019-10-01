package com.tsc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="host")
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@DynamicInsert
@DynamicUpdate

@NamedQueries(value = {
		@NamedQuery(name = "hostAuthenticate", query = "SELECT h FROM  Host h WHERE h.email = :email AND h.password =:password"),

		/*
		 * @NamedQuery(name = "checkHostAppointment", query =
		 * "select new com.tsc.wrapper.GuestAppointmentDto(hostAppoint.firstName,hostAppoint.lastName,hostAppoint.contactNumber,hostAppoint.address,hostAppoint.appointmentDate,hostAppoint.appointmentTimeSlot,hostAppoint.status) from AppointmentDateAndTime hostAppoint WHERE appointment.appointmentDate = :appointmentDate"
		 * )
		 */
})
 

public class Host  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
	//@NotEmpty(message = "{constraints.NotEmpty.message}")
	@Column(name="email",nullable = false,unique = true)
	private String email;
    
  //  @NotEmpty(message = "{constraints.NotEmpty.message}")
	@Column(name="password",nullable = false)
	private String password;
	
}



/* GuestSignUp */