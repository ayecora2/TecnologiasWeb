package com.market.web;

import Market_DO.*;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("User")
	public ModelAndView sarUsers() 
	{
		List<User> listUsers = Market_BL.UserBL.darUsuarios();
		ModelAndView MV = new ModelAndView("UserView");
		MV.addObject("listUsuarios", listUsers);

		return MV;

	}

	@RequestMapping(value = "AddUser", method = RequestMethod.GET)
	public String addUsers() {

		return "UserCreate";
	}
	
	@RequestMapping(value = "UserCreateRequest", method = RequestMethod.GET)
	public String UserCreateRequest() {

		return "UserCreateRequest";
	}
	
	@RequestMapping(value = "UserLogin", method = RequestMethod.GET)
	public String UserLogin() {

		return "loginform";
	}
	@RequestMapping(value = "UserLoginRequest", method = RequestMethod.GET)
	public String UserLoginRequest() {

		return "loginRequest";
	}
	
	@RequestMapping(value = "UserLogout", method = RequestMethod.GET)
	public String UserLogout() {

		return "Logout";
	}
	

}
