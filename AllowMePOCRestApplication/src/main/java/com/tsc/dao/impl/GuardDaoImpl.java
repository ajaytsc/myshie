package com.tsc.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsc.constants.AllConstants;
import com.tsc.dao.GuardDao;
import com.tsc.entities.Guard;
@Repository
@Transactional
public class GuardDaoImpl implements GuardDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Guard guardSignin(Guard guard) {

		return (Guard) entityManager.createNamedQuery(AllConstants.GUARDAUTHENTICATE)
				.setParameter("email", guard.getEmail()).setParameter("password", guard.getPassword()).getSingleResult();

	}

	@Override
	public void guardSignup(Guard guard) {
		entityManager.persist(guard);
	}

	
	
}
