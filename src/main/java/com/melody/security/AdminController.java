package com.melody.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.bull.javamelody.MonitoredWithSpring;

@MonitoredWithSpring
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "/admin/test", method = RequestMethod.GET)
	public String test() {

		return adminService.test();

	}

}
