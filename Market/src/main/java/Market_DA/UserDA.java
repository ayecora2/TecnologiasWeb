package Market_DA;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;

import Market_DO.User;

public class UserDA extends DataAccessCore{
	
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
	@Autowired
	public static void addUsuarios(User usuario)
	{

		try {
			 statement
			   .executeUpdate("INSERT INTO USERS VALUES("+usuario.getId()+","+usuario.getNombre()+","+usuario.getEmail()+","+usuario.getPass()+","+usuario.getCiudad()+","+usuario.getCP()+",1);");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
