package Market_BL;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Market_DO.Producto;
import Market_DO.ProductoPuntuado;

/**
 * Clase para la optención de una lista de productos como instancias de la clase Producto,
 * @author silverio
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
				// Hay que comprobar previamente que no existe ya ese producto (ID)
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
						resultSet.getDouble("Precio"))
				);
				//En este lugar no se añade a la ninguna lista a la nueva instancia de Producto.				
			}
			//Devuelve la lista de productos
			return listProductos;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	public static List<ProductoPuntuado> bestProduct() {
		try {
			ResultSet resultSet;
			//Lista de productos
			List<ProductoPuntuado> listProductos = new ArrayList<ProductoPuntuado>();
			
			//Ejecuta la búsqueda de los 5 productos con más puntuacion
			resultSet = Market_DA.ProductoDA.bestProduct() ;
			
			//Bucle para añadir items		
			while (resultSet.next()) {
				// Añade el item a la lista de productos
				// Hay que comprobar previamente que no existe ya ese producto (ID)
			
				listProductos.add(new ProductoPuntuado(new Producto(
						resultSet.getInt("Id"),
						resultSet.getInt("Categoria_Id"),
						resultSet.getInt("Tienda_Id"),
						resultSet.getInt("Marca_Id"),
						resultSet.getString("Nombre"),
						resultSet.getString("Modelo"),
						resultSet.getString("Imagen"),
						resultSet.getString("Descripcion"),
						resultSet.getInt("Cantidad"),
						resultSet.getDouble("Precio")),
						resultSet.getInt("C11"))
				);
				//En este lugar no se añade a la ninguna lista a la nueva instancia de Producto.				
			}
			//Devuelve la lista de productos
			return listProductos;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
