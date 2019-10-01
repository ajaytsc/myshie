package com.tsc.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NamedQueries(value = { 
		/*
		 * @NamedQuery(name = "checkAppointmentDateAndTime", query
		 * ="SELECT appointment FROM  AppointmentDateAndTime appointment WHERE appointment.appointmentDate = :appointmentDate"
		 * ),
		 */
@NamedQuery(name = "checkAppointmentDateAndTime",query = "select new com.tsc.wrapper.AppointmentDateAndTimeDto(appointment.appointmentDate,appointment.appointmentTimeSlot,appointment.tag) from AppointmentDateAndTime appointment WHERE appointment.appointmentDate = :appointmentDate"),
		/*
		 * @NamedQuery(name = "getAllAppointmentOfUser", query =
		 * "FROM AppointmentDateAndTime as allappointment ORDER BY allappointment.id")
		 */

@NamedQuery(name = "getAllAppointmentOfUser", query = "select new com.tsc.wrapper.GuestAppointmentDto(allappointment.firstName,allappointment.lastName,allappointment.contactNumber,allappointment.appointmentDate,allappointment.appointmentTimeSlot,allappointment.status) FROM AppointmentDateAndTime as allappointment join WHERE allappointment.appointmentDate = :appointmentDate")

})

//join o.vendorId u where o.vendorId.userId=:vendorId order by o.orderStartDate desc

@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "appointmentDateAndTime")
@Getter
@Setter
@ToString
public class AppointmentDateAndTime implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name = "appointmentDate")
	private String appointmentDate;

	@Column(name = "appointmentTimeSlot")
	private String appointmentTimeSlot;

	@Column(name = "status", columnDefinition = "int default 0",nullable = false)
	private Integer status;
	@Column(name = "tag",nullable = false)
	private String tag;
	
	
   @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,targetEntity = GuestSignUp.class)
   @JoinColumn(name = "guest_id")
   private  GuestSignUp guest;
	
	
	public AppointmentDateAndTime() {}

}
