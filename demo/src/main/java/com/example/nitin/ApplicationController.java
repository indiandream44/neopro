package com.example.nitin;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	@Value("${app.user.name}")
	private String userName;
	@Value("${app.user.password}")
	private String password;

	public ApplicationController() {
		super();
	}

	@RequestMapping("/")
	public ModelAndView root() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/welcome")
	public ModelAndView welcome(Model model, HttpServletRequest request) throws IllegalAccessException {
		LOGGER.info("Expecting User name is {} and password is {}", userName, password);
		String userNameStr = (String) request.getParameter("userName");
		String passwordStr = (String) request.getParameter("password");
		LOGGER.info("User name is {} and password is {}", userNameStr, passwordStr);
		if (!userName.equalsIgnoreCase(userNameStr) || !password.equalsIgnoreCase(passwordStr)) {
			throw new IllegalAccessException("Invalid user name or password.");
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", userNameStr);
		mv.setViewName("welcome");
		return mv;
	}

}
