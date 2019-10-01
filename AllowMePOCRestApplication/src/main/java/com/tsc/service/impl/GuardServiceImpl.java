package com.tsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsc.dao.GuardDao;
import com.tsc.entities.Guard;
import com.tsc.service.GuardService;

@Service
public class GuardServiceImpl implements GuardService {
	@Autowired
	private GuardDao guardDao;
	
	@Override
	public Guard guardSignin(Guard guard) {
		
		 return guardDao.guardSignin(guard);
	}

	@Override
	public void guardSignup(Guard guard) {
		guardDao.guardSignup(guard);
		
	}

}
