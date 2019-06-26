package com.market.web;

import Market_DO.*;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Esta clase controladora, define los métodos para poder trabajar con los productos desde
 * la vista, accediendo y obteniendo los datos que sean necesarios definidos en ella para la
 * interrelación con la BBDD a través de las clases respectivas.
 * @author Silverio Manuel
 * @author Ábel Yecora.
 * @version 201906242108
 */
@Controller
public class ProductoController {

	@RequestMapping("Producto")
	public ModelAndView darProductos()
	{
		List<Producto> listProductos = Market_BL.ProductosBL.darProductos(null);
		ModelAndView MV = new ModelAndView("ProductosView");
		MV.addObject("listProductos", listProductos);	
		return MV;		
	}
	
	@RequestMapping(value = "/FilterProducto", method = RequestMethod.POST)
	public ModelAndView FilterProducto(String data)
	{
		List<Producto> listProductos = Market_BL.ProductosBL.darProductos(data);
		ModelAndView MV = new ModelAndView("ProductosView");
		MV.addObject("listProductos", listProductos);	
		return MV;	
	}
	
	@RequestMapping(value = "/addProducto", method = RequestMethod.POST)
	public String submit(@ModelAttribute("Productos")  List<Producto> Productos) {
	    // Code that uses the employee object 
	    return "employeeView";
	}
	
	@RequestMapping(value = "/darProductos", method = RequestMethod.POST)
	public String submit(Model model) {
	    // Code that uses the employee object
		List<Producto> Productos = null;
		model.addAttribute("msg", Productos);
	    return "darProductosView";
	}
	
	@RequestMapping(value = "productoRequest", method = RequestMethod.GET)
	public String UserLoginRequest() {return "productoRequest";}
}
