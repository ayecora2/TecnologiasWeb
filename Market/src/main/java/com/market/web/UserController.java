package com.market.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Market_DO.Producto;
import Market_DO.User;

@Controller
public class UserController {
	
	@RequestMapping("User")
	public ModelAndView conectarBBDD()
	{
		List<User> listUsers = Market_BL.UserBL.darUsuarios();
		ModelAndView MV = new ModelAndView("UserView");
		MV.addObject("listUsuarios", listUsers);
		
		return MV;
		
	}
}
