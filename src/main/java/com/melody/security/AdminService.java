package com.melody.security;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import net.bull.javamelody.MonitoredWithSpring;

@MonitoredWithSpring
@Service
public class AdminService {

	@Secured("ROLE_USER")
	public String test() {

		return "test success";

	}
}
