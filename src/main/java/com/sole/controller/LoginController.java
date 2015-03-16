package com.sole.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sole.po.SoleUser;
import com.sole.service.LoginService;
import com.sole.service.LoginServiceImpl;

@Controller
@Scope("prototype")
public class LoginController {
	private static final Log LOGGER = LogFactory.getLog(LoginController.class);
	
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		SoleUser user = new SoleUser();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		LOGGER.debug("username="+userName+"   password="+password);
		user.setUserName(userName);
		user.setPassword(password);
		
		LoginService loginService = new LoginServiceImpl();
		String result = loginService.VertifyUser(user);
		
		if ("index".equals(result)) {
			request.getSession().setAttribute("isLogin", "true");
		}
		
		return result;
	}
}
