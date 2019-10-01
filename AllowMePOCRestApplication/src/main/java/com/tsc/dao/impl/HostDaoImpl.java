package com.tsc.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsc.constants.AllConstants;
import com.tsc.dao.HostDao;
import com.tsc.entities.GuestSignUp;
import com.tsc.entities.Host;
@Repository
@Transactional
public class HostDaoImpl implements HostDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public Host hostSignin(Host host) {
		
		  return (Host)entityManager
					.createNamedQuery(AllConstants.HOSTGETAUTHENTICATE).setParameter("email",
			  host.getEmail()).setParameter("password",host.getPassword()) .getSingleResult();
	}




}
