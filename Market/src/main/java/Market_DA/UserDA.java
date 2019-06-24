package Market_DA;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;

import Market_DO.User;
import Market_DO.Login;
/**
 * Clase encargada de obtener una lista de todos los usuarios almacenados en el sistema
 * y introducir nuevos usuarios en la Base de Datos.
 * @author silverio
 * @version 201905291515
 * @author ayecora
 *
 */
public class UserDA extends DataAccessCore{
	
	/**
	 * Devuelve una lista de usuarios almacenados en la Base de Datos
	 * @return devuelve la lista obtenida de todos los usuarios.
	 */
	public static ResultSet darUsuarios()
	{
		try{			
			 resultSet = statement.executeQuery("SELECT * FROM USERS");
			return resultSet;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Añade un usuario a la BBDD.
	 * @param usuario el usuario que se desea añadir
	 */
	@Autowired
	public static String addUsuarios(User usuario)
	{
		
		//introduce la información de la instancia y la introduce en la BBDD
		try {
			String sentencia="INSERT INTO USERS (NOMBRE, APELLIDO, EMAIL, TELEFONO, PASS, CIUDAD, DIRECCION, CP, USER_TYPE_ID) VALUES('"
					+usuario.getNombre()
					+"','"+usuario.getApellido()
					+"','"+usuario.getEmail()
					+"','"+usuario.getTelefono()
					+"','"+usuario.getPass()
					+"','"+usuario.getCiudad()
					+"','"+usuario.getDireccion()
					+"','"+usuario.getCP()
					+"',"+usuario.getUserType()+");";
					
			statement.executeUpdate(sentencia);
			 return "ok";
			 
		} catch (Exception e) {  //Imprime la traza en caso de excepción junto a un mensaje de aviso.
			System.out.println("\n>>>No ha sido posible introducir el usuario en la BBDD\n>>>\n");
			e.printStackTrace();
			return "KO";
			}
	}
	public static String[] loginUser(Login login)
	{
		/**Comprueba el user y password del login contra la base de datos y devuelve ok si es correcto y
		 * devuelve un par de string con el numbre del usuario y el tipo para crear la sesion
		 * **/
		    String email = login.getEmail();   
		    String password = login.getPass();
		    try{			
				resultSet = statement.executeQuery("select * from users where EMAIL='" + email + "' and PASS='" +password + "'");
				if (resultSet.next()) {
					String[] datos = {resultSet.getString("Nombre"),resultSet.getString("USER_TYPE_ID").toString()};
			        System.out.println("Login Correcto");
					return datos;
			    } else {
			        System.out.println("Invalid password try again");
			        return null;
			    }
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			}    
	}
}
