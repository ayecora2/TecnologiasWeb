package Market_DA;

import java.sql.ResultSet;


public class ProductoDA extends DataAccessCore{
	
	public static ResultSet darProductos()
	{
		try{	
			resultSet = statement.executeQuery("SELECT * FROM PRODUCTOS");  
			return resultSet;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public static ResultSet darProductos(String filterProducto)
	{
		try{	
			
			resultSet = statement.executeQuery(""
					+ "SELECT * FROM PRODUCTOS P"
					+ "INNER JOIN MARCAS M ON M.ID = P.MARCA_ID "
					+ "INNER JOIN CATEGORIA C ON C.ID = P.CATEGORIA_ID"
					+ "WHERE M.NOMBRE LIKE '%" + filterProducto + "%'  + OR "
					+ "WHERE C.NOMBRE LIKE '%" + filterProducto + "%'  + OR " 
					+ "WHERE P.NOMBRE LIKE '%" + filterProducto + "%'  + ");  
			
			return resultSet;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
