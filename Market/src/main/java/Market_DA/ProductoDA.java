package Market_DA;

import java.sql.ResultSet;

import Market_DO.Producto;


/**
 * Esta clase herda de DataAccessCore, y es la encargada de obtener la lista de productos
 * o una lista parcial mediante un filtro. También esta clase se encarga de introducir nuevos
 * productos en la Base de Datos.
 * @author Silverio
 * @version 201905302123
 */
public class ProductoDA extends DataAccessCore{
	
	
	/**
	 * Método que devuelve todos los productos que esten en la Base de datos.
	 * @return lista de productos de la base de datos
	 * @return null en otro caso
	 */
	public static ResultSet darProductos(){
		try{	
			resultSet = statement.executeQuery("SELECT * FROM PRODUCTOS");  
			return resultSet;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null; //en caso de excepción devuelve NULL.
		}
	}
	
	/**
	 * Realiza una consulta a la Base de Datos utilizando un filtro para
	 * obtener una lista parcial que cumpla la condición dada por el filtro.
	 * @param filterProducto es el filtro a aplicar en la búsqueda parcial.
	 * @return devuelve la lista de productos que cumplen con el filtro
	 * @return null en otro caso.
	 */
	public static ResultSet darProductos(String filterProducto){
		//Realiza la operación de consulta a la base de datos con el filtro dado.
		try{				
			resultSet = statement.executeQuery(""
					+ "SELECT * FROM PRODUCTOS P"
					+ "INNER JOIN MARCAS M ON M.ID = P.MARCA_ID "
					+ "INNER JOIN CATEGORIA C ON C.ID = P.CATEGORIA_ID"
					+ "WHERE M.NOMBRE LIKE '%" + filterProducto + "%'  + OR "
					+ "WHERE C.NOMBRE LIKE '%" + filterProducto + "%'  + OR " 
					+ "WHERE P.NOMBRE LIKE '%" + filterProducto + "%'  + ");  		
			return resultSet;
			
		} catch (Exception ex) { //Impresión de la excepción y devolución de null.
			ex.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Método que recibe una instancia producto y la introduce en la base de datos.
	 * @param producto a introducir en la base de datos
	 * @return ro Resultado de la operación, False (sin éxito), True (realizada correctamente)
	 */
	public static boolean addProducto(Producto producto)
	{
		boolean ro = true; //Retorna el resultado de la operación
		//Extrae la información de la instancia producto y la introduce en la BBDD
		try {
			 statement.executeUpdate("INSERT INTO PRODUCTOS VALUES("
			+producto.getId()
			+","+producto.getCategoria_Id()
			+","+producto.getTienda_Id()
			+","+producto.getMarca_Id()
			+","+producto.getImagen()
			+","+producto.getDescripcion()
			+","+producto.getCantidad()
			+","+producto.getPrecio()+");");
			 
		} catch (Exception e) {  //Imprime la traza en caso de excepción junto a un mensaje de aviso.
			System.out.println("\n>>>No ha sido posible introducir el producto en la BBDD\n>>>\n");
			e.printStackTrace();
			return false; //en caso de fallo, retorna false
			}
		return ro; //Si todo va bien retorna True
	}

}
