package com.sole.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.sole.controller.LoginController;
import com.sole.po.SoleUser;

@Service
public class LoginServiceImpl implements LoginService{
	
	private static final Log LOGGER = LogFactory.getLog(LoginController.class);

	public String VertifyUser(SoleUser user) {
		if (user.getUserName().equals("sole") && (user.getPassword().equals("sole"))) {
			LOGGER.debug("login success");
			return "index";
		} else {
			LOGGER.debug("login failed");
			return "login";
		}
	}

}
