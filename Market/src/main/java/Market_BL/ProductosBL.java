package Market_BL;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Market_DO.Producto;

/**
 * Clase para la optención de una lista de productos.
 * @author silverio
 */
public class ProductosBL {
	
	
	/**
	 * Función para la creación de una lista de productos buscada. Puede contener una cadena 
	 * para realizar un filtro o un valor nulo para obtener una lista completa.
	 * @param filterProducto filtro a aplicar, puede ser un valor null o contener una cadena texto.
	 * @return Lista final de productos
	 */
	public static List<Producto> darProductos(String filterProducto) {
		try {
			ResultSet resultSet;
			Producto item = null;
			//Lista de productos
			List<Producto> listProductos = new ArrayList<Producto>();
			//Si se recibe null como parámetro, no un filtro previo.
			if (filterProducto == null) {resultSet = Market_DA.ProductoDA.darProductos();} 
			//En otro caso se atiende al filtro para crear la la lista que contiene los productos
			else {resultSet = Market_DA.ProductoDA.darProductos(filterProducto);}
			//Bucle para añadir items		
			while (resultSet.next()) {
				/*comprobar que se obtiene de alguna forma lo que se necesita. */
				item = new Producto();
				item.setId(resultSet.getInt("Id"));
				item.setCategoria_Id(resultSet.getInt("Categoria_Id"));
				item.setMarca_Id(resultSet.getInt("Marca_Id"));
				item.setTienda_Id(resultSet.getInt("Tienda_Id"));
				item.setImagen(resultSet.getString("Imagen"));
				item.setDescripcion(resultSet.getString("Descripcion"));
				item.setCantidad(resultSet.getInt("Cantidad"));
				item.setPrecio(resultSet.getDouble("Precio"));
				//Añade el item a la lista de productos
				listProductos.add(item);
			}
			return listProductos;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
