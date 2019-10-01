package com.tsc.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "guestSignUp")
@DynamicInsert
@DynamicUpdate
@Data
//@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@NamedQueries(value = { @NamedQuery(name = "getAllGuestUser", query = "FROM GuestSignUp as u ORDER BY u.id"),
		@NamedQuery(name = "getUserByEmailAndPassword", query = "SELECT u FROM  GuestSignUp u WHERE u.email = :email AND u.password =:password"),
		
		/*
		 * @NamedQuery(name = "getGuestAppointmentTimeSlot", query =
		 * "select new com.tsc.wrapper.AppointmentDateAndTimeDto(u.firstName,u.lastName,u.profilePic,u.userId) from AppointmentDateAndTime a join a.vendorId u where a.vendorId.userId=:vendorId order by a.orderStartDate desc"
		 * )
		 */
		 })
//@NamedQuery(name = "getTopCustomersForFullProfile", query = "select new com.projecttp.utils.wrapper.VendorLocation(u.firstName,u.lastName,u.profilePic,u.userId) from OrderDetail o join o.vendorId u where o.vendorId.userId=:vendorId order by o.orderStartDate desc")
public class GuestSignUp implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "firstName", length = 50, nullable = false)
	private String firstName;

	@Column(name = "lastName", length = 50, nullable = false)
	private String lastName;

	//@JsonIgnore
	@Column(name = "password", length = 50, nullable = false)
	private String password;

	@Column(name = "email", unique = true, length = 50, nullable = false)
	private String email;

	// private PhoneType contactNumber;
	// @NotEmpty(message = "{constraints.NotEmpty.message}")
	@Column(name = "contactNumber", length = 12, nullable = false)
	private String contactNumber;

	@Column(name = "address", length = 100, nullable = false)
	private String address;

	@Column(name = "deviceId", nullable = false, length = 50)
	private String deviceId;

	@Column(name = "signUpDate", nullable = false)
	private Long signUpDate;
	
	/*
	 * @OneToMany(mappedBy = "guestList") private GuestSignUp guest;
	 */
	 

	
	
	public GuestSignUp() {}


	public GuestSignUp(Integer id, String firstName, String lastName, String password, String email,
			String contactNumber, String address, String deviceId, Long signUpDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		this.deviceId = deviceId;
		this.signUpDate = signUpDate;
	}


	
	
	/*
	 * @OneToMany(mappedBy="guest") private List<AppointmentDateAndTime>
	 * appointDateTime;
	 */
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy =
	 * "guest")
	 * 
	 * //@JoinColumn(name = "guest_id", nullable = false, columnDefinition =
	 * "int default 0") private List<AppointmentDateAndTime> appointDateTime;
	 */
	 

	/*
	 * @OneToMany(mappedBy="team", cascade=CascadeType.ALL) private Set<Player>
	 * players;
	 */
	     
	
}

