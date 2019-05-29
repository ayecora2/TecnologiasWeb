package Market_BL;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Market_DO.User;

/**
 * La clase tiene la función de leer de la Base de Datos, los datos de usuario, y convertirlos en una lista 
 * de instancias de la clase User con sus campos convertidos adecuadamente.
 * @author silverio
 * @version 201905291627
 */
public class UserBL {
	
	/**
	 * retorna la lista de usuarios extraida de la base de datos
	 * en formato texto, convertida en una lista de instancias de la clase User. En caso de error o de 
	 * excepción se devuelve NULL
	 * @return listUser lista de instancias de User
	 * @return null en otro caso
	 */
	public static List<User> darUsuarios()
	{
		try {
			ResultSet resultSet;
			//Creación de una lista de Usuarios
			List<User> listUsers = new ArrayList<User>();
			// se recibe el resultSet de Usuarios, la cuhal es una lista de usuarios
			resultSet = Market_DA.UserDA.darUsuarios();
			
			//Bucle para añadir items a la lista	
			while (resultSet.next()) {
				// Añade usuario a la lista de nueva de usuarios, extrayendo los datos de la BBDD
				listUsers.add(new User(
						resultSet.getInt("Id"),
						resultSet.getString("Nombre"),
						resultSet.getString("Apellido"),
						resultSet.getString("Email"),
						resultSet.getString("Telefono"),
						resultSet.getString("Pass"),
						resultSet.getString("Ciudad"),
						resultSet.getString("Direccion"),
						resultSet.getString("CP"),
						resultSet.getInt("UserType_Id"))
				);
			}
			return listUsers; // Devuelve la lista de usuarios
		} catch (Exception ex) {
			ex.printStackTrace();
			return null; //Devuelve Null en otro caso
		}
	}
}
