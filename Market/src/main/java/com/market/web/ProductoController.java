package com.market.web;

import Market_DO.*;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductoController {

	@RequestMapping("Producto")
	public ModelAndView darProductos()
	{
		List<Producto> listProductos = Market_BL.ProductosBL.darProductos(null);
		ModelAndView MV = new ModelAndView("ProductosView");
		MV.addObject("listProductos", listProductos);
//		MV.setViewName();
		
		return MV;
		
	}
	
	//@RequestMapping("FilterProducto")
	@RequestMapping(value = "/FilterProducto", method = RequestMethod.POST)
	public ModelAndView FilterProducto(String data)
	{
		List<Producto> listProductos = Market_BL.ProductosBL.darProductos(data);
		ModelAndView MV = new ModelAndView("ProductosView");
		MV.addObject("listProductos", listProductos);
//		MV.setViewName();
		
		return MV;
		
	}
	
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
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
}
