package Market_DA;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;

import Market_DO.User;

/**
 * Clase encargada de obtener una lista de todos los usuarios almacenados en el sistema
 * y introducir nuevos usuarios en la Base de Datos.
 * @author silverio
 * @version 201905291515
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
	public static void addUsuarios(User usuario)
	{
		//Extrae la información de la instancia y la introduce en la BBDD
		try {
			 statement.executeUpdate("INSERT INTO USERS VALUES("
			+usuario.getId()
			+","+usuario.getNombre()
			+","+usuario.getApellido()
			+","+usuario.getEmail()
			+","+usuario.getTelefono()
			+","+usuario.getPass()
			+","+usuario.getCiudad()
			+","+usuario.getDireccion()
			+","+usuario.getCP()
			+","+usuario.getUserType()+");");
			 
		} catch (Exception e) {  //Imprime la traza en caso de excepción junto a un mensaje de aviso.
			System.out.println("\n>>>No ha sido posible introducir el usuario en la BBDD\n>>>\n");
			e.printStackTrace();
			}
	}
}