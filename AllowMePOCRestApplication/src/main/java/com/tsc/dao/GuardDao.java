package com.tsc.dao;

import com.tsc.entities.Guard;

public interface GuardDao {

	Guard guardSignin(Guard guard);

	void guardSignup(Guard guard);

}
