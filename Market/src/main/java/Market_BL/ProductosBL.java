package Market_BL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Market_DO.Producto;

/**
 * Clase para la optención de una lista de productos como instancias de la clase Producto,
 * @author Abel Yécora
 * @author Silverio Rosales
 * @version 201905291600
 */

public class ProductosBL {
	
	/**
	 * Función para la creación de una lista de productos buscada. Puede contener una cadena 
	 * para realizar un filtro o un valor nulo para obtener una lista completa.
	 * @param filterProducto filtro a aplicar, puede ser un valor null o contener una cadena texto.
	 * @return Lista final de productos o null en otro caso.
	 */
	public static List<Producto> darProductos(String filterProducto) {
		try {
			ResultSet resultSet;
			//Lista de productos
			List<Producto> listProductos = new ArrayList<Producto>();
			//Si se recibe null como parámetro, no un filtro previo.
			if (filterProducto == null) {resultSet = Market_DA.ProductoDA.darProductos();} 
			//En otro caso se atiende al filtro para crear la la lista que contiene los productos
			else {resultSet = Market_DA.ProductoDA.darProductos(filterProducto);}
			//Bucle para añadir items		
			while (resultSet.next()) {
				// Añade el item a la lista de productos
						Producto producto = new Producto();							
						producto.setId(resultSet.getInt("Id"));
						producto.setCategoria_Id(resultSet.getInt("Categoria_Id"));
						producto.setTienda_Id(resultSet.getInt("Tienda_Id"));
						producto.setMarca_Id(resultSet.getInt("Marca_Id"));
						producto.setNombre(resultSet.getString("Nombre"));
						producto.setModelo(resultSet.getString("Modelo"));
						producto.setImagen(resultSet.getString("Imagen"));
						producto.setDescripcion(resultSet.getString("Descripcion"));
						producto.setCantidad(resultSet.getInt("Cantidad"));
						producto.setPrecio(resultSet.getFloat("Precio"));
				//En este lugar no se añade a la ninguna lista a la nueva instancia de Producto.	
				listProductos.add(producto);
			}
			//Devuelve la lista de productos
			return listProductos;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	/**
	 * Funcion para devolver una lista de los 4 productos mejor puntuados
	 * @author ayecora
	 * @return List<Producto>
	 */
	public static List<Producto> bestProduct() {
		try {
			//Lista de productos
			List<Producto> listProductos = new ArrayList<Producto>();			
			//Ejecuta la búsqueda de los 5 productos con más puntuacion
			ResultSet resultSet = Market_DA.ProductoDA.bestProduct() ;			
			//Bucle para añadir a una lista instancias de los productos seleccionados	
			while (resultSet.next()) {
				// Añade el item a la lista de productos	
				listProductos.add(new Producto(
						resultSet.getInt("Id"),
						resultSet.getInt("Categoria_Id"),
						resultSet.getInt("Tienda_Id"),
						resultSet.getInt("Marca_Id"),
						resultSet.getString("Nombre"),
						resultSet.getString("Modelo"),
						resultSet.getString("Imagen"),
						resultSet.getString("Descripcion"),
						resultSet.getInt("Cantidad"),
						resultSet.getFloat("Precio"),
						resultSet.getFloat("C11"))); //¿Qué es C11? cambiar nomenclatura o describirla. Debe ser Double
			}
			//Devuelve la lista de productos
			return listProductos;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null; //Devuelve null en otro caso.
		}
	}
	
	/**
	 * Comprueba la existenacia de un producto en la base de datos. Para ello, se le pasa el ID del producto.
	 * @param Resault rs resultados de una búsqueda en la base de datos.
	 * @param ID del producto a buscar, si el ID es negativo indica que la búsqueda será por campo (String).
	 * @param campo es el parámetro a buscar que no sea el ID (nombre, modelo, imagen, descripción)
	 * @return true en caso de que exista.
	 * @return false en caso de que no exista el producto en la base de datos.
	 */
	public static boolean existeProducto(ResultSet rs, int id, String campo) {
		try { //realiza búsqueda entre los resultados.
			if(id < 0) {rs.getString(campo);} //búsqueda por campo
			else {rs.getInt("Id");}  //Búsqueda por ID		
		} catch (SQLException e) {return false;} //Si ha habido excepción entonces no existe. 
		return true;
	}

}
