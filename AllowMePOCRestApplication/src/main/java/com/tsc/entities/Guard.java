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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="guard")
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

@NamedQueries(value = {@NamedQuery(name = "guardAuthenticate", query = "SELECT g FROM  Guard g WHERE g.email = :email AND g.password =:password") })

public class Guard  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	//@NotEmpty(message = "{constraints.NotEmpty.message}")
	@Column(name="email",nullable = false,unique = true)
	private String email;
	
	//@NotEmpty(message = "{constraints.NotEmpty.message}")
	@Column(name="password",nullable = false)
	private String password;
	
	

}
