package com.market.web;


import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Market_DO.Producto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * Realizando la conexión con la BBDD y además extrayendo los productos mejor puntuados.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Home(Locale locale, Model model) {

		Market_BL.ConectarBBDD.conectarBBDD();
		List<Producto> listProductosPuntuados = Market_BL.ProductosBL.bestProduct();
		ModelAndView MV = new ModelAndView("HomeView");
		MV.addObject("listProductosPuntuados", listProductosPuntuados);
//		MV.setViewName();		
		return MV;
	}
	@RequestMapping(value = "/Documentacion", method = RequestMethod.GET)
	public String Doc() {
		return "Documentacion";
	}
}
