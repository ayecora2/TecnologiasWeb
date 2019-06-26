package com.market.web;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Market_DO.Producto;

/**
 * Manejador de las peticiones para la aplicación página home.
 * Este controlador maneja las peticiones/llamadas relacionadas con la página principal Home.
 * Al ser el primer controlador en ser llamado desde la página inicial, se encargará también
 * de establecer la conexión con la base de datos.
 * @author Silverio Manuel
 * @author Ábel Yécora
 * @version 201906261523
 */
@Controller
public class HomeController {
	
	/**
	 * El constructor de esta clase controladora, al pertenecer a la primera vista y acción
	 * que se realiza al acceder a la página principal, realiza la conexión con la Base de Datos.
	 */
	public HomeController(){Market_BL.ConectarBBDD.conectarBBDD();}
	
	/**
	 * Obtiene una lista de productos mejor puntuados de la base de datos,
	 * los cuales se almacenan en una lista. Crea un objeto ModelAndView con la vista que
	 * requiere renderizar y añade al HashMap que represetan el ModelAndView la lista de productos
	 * con su etiqueta (key) "listProductosPuntuados".
	 * @return MV el Modelo y Vista con la lista de productos mejor puntuados.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Home() {
		List<Producto> listProductosPuntuados = Market_BL.ProductosBL.bestProduct(); //Obtiene la lista de productos mejores.
		ModelAndView MV = new ModelAndView("HomeView"); //Creación del objeto MAV con el nombre de la vista a renderizar.
		MV.addObject("listProductosPuntuados", listProductosPuntuados); 	
		return MV; //Retorna del modelo y la vista en el objeto ModelAndView
	}
	
	/**
	 * Método para facilitar el acceso a la documentación.
	 * @return la ruta a la documentación requerida.
	 */
	@RequestMapping(value = "/Documentacion", method = RequestMethod.GET)
	public String Doc() {return "Documentacion";}
}
