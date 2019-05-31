package com.market.web;

import Market_DO.*;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
