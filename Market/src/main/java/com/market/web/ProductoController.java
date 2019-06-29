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

	/**
	 * Este método obtiene una lista de los productos disponibles en la base de datos.
	 * Y especifica la vista para renderizar (ProductosView).
	 * @return devuelve una lista de objetos Producto, de todos los productos disponibles.
	 */
	@RequestMapping("Producto")
	public ModelAndView darProductos()
	{
		List<Producto> listProductos = Market_BL.ProductosBL.darProductos(null);
		ModelAndView MV = new ModelAndView("ProductosView");
		MV.addObject("listProductos", listProductos);	
		return MV;		
	}
	
	/**
	 * Este método obtiene una lista de los productos disponibles en la base de datos cuyo criterío de búsqueda,
	 * cumple el valor obtenido en la cadena de texto data. Además la vista para renderizar indicada es (ProductosView).
	 * @param data filtro a aplicar en la búsqueda.
	 * @return  devuelve una lista de objetos Producto, de todos los productos disponibles del tipo especificado.
	 */
	@RequestMapping(value = "/FilterProducto", method = RequestMethod.POST)
	public ModelAndView FilterProducto(String data)
	{
		List<Producto> listProductos = Market_BL.ProductosBL.darProductos(data);
		ModelAndView MV = new ModelAndView("ProductosView");
		MV.addObject("listProductos", listProductos);	
		return MV;	
	}
	
	/**
	 * Método para añadir un producto a la lista almacenada en la Base de datos.
	 * @param productos una lista que almacena objetos de tipo Producto.
	 * @return el tipo de vista a renderizar.
	 */
	@RequestMapping(value = "/addProducto", method = RequestMethod.POST)
	public String submit(@ModelAttribute("Productos")  List<Producto> productos) {
	    // Code that uses the Producto object 
	    return "addProducto";
	}
	
	/**
	 * Método para la entrega de productos, retorna un objeto Model que almacena el nombre de la
	 * vista a renderizar, así como la lista de productos.
	 * @param model objeto Model donde se almacenará la lista de los productos.
	 * @return el objeto tipo Model con la lista de productos y el nombre de la vista a renderizar. 
	 */
	@RequestMapping(value = "/darProductos", method = RequestMethod.POST)
	public String submit(Model model) {
	    // Code that uses the Producto object
		List<Producto> productos = null;
		model.addAttribute("msg", productos);
	    return "darProductosView";
	}
	
	/**
	 * Método para obtener las especificaciones de un producto determinado.
	 * @return devuelve la vista a renderizar.
	 */
	@RequestMapping(value = "productoRequest", method = RequestMethod.GET)
	public String productoRequest() {return "productoRequest";}
}
