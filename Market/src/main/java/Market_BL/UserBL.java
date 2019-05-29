package Market_BL;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Market_DO.User;

public class UserBL {
	
	public static List<User> darUsuarios()
	{
		try {
			ResultSet resultSet;
			//Lista de Usuario
			List<User> listUsers = new ArrayList<User>();
			// se recibe el resultSet de Usuarios
			resultSet = Market_DA.UserDA.darUsuarios();
			
			//Bucle para añadir items a la lista	
			while (resultSet.next()) {
				// Añade el item a la lista de productos
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
						resultSet.getInt("User_Type_Id"))
				);
				//En este lugar no se añade a la ninguna lista a la nueva instancia de Producto.				
			}
			//Devuelve la lista de productos
			return listUsers;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	

}
