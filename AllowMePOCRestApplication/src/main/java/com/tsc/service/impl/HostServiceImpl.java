package com.tsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsc.dao.HostDao;
import com.tsc.entities.Host;
import com.tsc.service.HostService;
@Service
public class HostServiceImpl implements HostService {

	@Autowired
	private HostDao hostDao;


	@Override
	public Host hostSignin(Host host) {
		return hostDao.hostSignin(host);
	}

}
