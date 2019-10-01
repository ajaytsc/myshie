package com.tsc.service;

import com.tsc.entities.Guard;

public interface GuardService {

	Guard guardSignin(Guard guard);

	void guardSignup(Guard guard);

}
