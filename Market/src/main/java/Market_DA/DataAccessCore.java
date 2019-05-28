package Market_DA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataAccessCore {
	
	public static Connection connection = null;
	public static ResultSet resultSet = null;
	protected static Statement statement = null;
	
	public static void conectarBBDD()
	{
		try {

			//Driver
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			//Connexión con la base de datos en local dentro del paquete
			connection = DriverManager.getConnection("jdbc:hsqldb:file:src/main/resources/mydb", "sa", "");
			//Iniciar valores BBDD
			iniciarBBDD();
			} catch (Exception ex) {
			 ex.printStackTrace();
			}		 
	}
	
	/** Valores para iniciar la base de datos. */
	private static void iniciarBBDD()
	{
		try {
			//Ejecutamos los comandos de BBDD
			statement = connection.createStatement();
			 
			statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS USERS_TYPE(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    NOMBRE varchar(40) UNIQUE\r\n" + 
			   		");");

			try {
				statement
				   .executeUpdate("INSERT INTO USERS_TYPE VALUES(1,'Admin');");			
				statement
				   .executeUpdate("INSERT INTO USERS_TYPE VALUES(2,'Usuario');");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS USERS(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    NOMBRE varchar(40),\r\n" + 
			   		"    EMAIL varchar(50),\r\n" + 
			   		"    PASS varchar(8),\r\n" + 
			   		"    CIUDAD varchar(50),\r\n" + 
			   		"    CP varchar(5), \r\n" + 
			   		"    USER_TYPE_ID integer,\r\n" + 
			   		"    CONSTRAINT FK_UT_ID foreign key (USER_TYPE_ID) references USERS_TYPE(ID)\r\n" + 
			   		");");
			 
			 try {
				 statement
				   .executeUpdate("INSERT INTO USERS VALUES(1,'Silverio Rosales', 'srosales2@alumno.uned.es', '123','Mallorca','07015',1);");
				 statement
				   .executeUpdate("INSERT INTO USERS VALUES(2,'Comprador', 'srosales2@alumno.uned.es', '1234','Mallorca','07015',2);");
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			//------------
			 //Servicios
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS SERVICIOS(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    NOMBRE varchar(50) UNIQUE\r\n" + 
			   		");");
			 
			 try {
				 statement
				   .executeUpdate("INSERT INTO SERVICIOS VALUES(1,'Entrada para minusvúlidos');");
				 statement
				   .executeUpdate("INSERT INTO SERVICIOS VALUES(2,'Parking gratuito para clientes durante 2 horas');");
				 statement
				   .executeUpdate("INSERT INTO SERVICIOS VALUES(3,'Parking gratuito para clientes durante 1 hora');");
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS TIENDAS(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    NOMBRE varchar(50) UNIQUE\r\n" + 
			   		");");
			 
			 try {
				 statement
				   .executeUpdate("INSERT INTO TIENDAS VALUES(1,'Jp Mallorca');");
				 statement
				   .executeUpdate("INSERT INTO TIENDAS VALUES(2,'Jp Madrid');");
				 statement
				   .executeUpdate("INSERT INTO TIENDAS VALUES(3,'Jp Barcelona');");
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS TIENDA_SERVICIOS(\r\n" + 
			   		"    TIENDA_ID integer ,\r\n" + 
			   		"    SERVICIO_ID integer ,\r\n" + 
			   		"	CONSTRAINT PK_TS primary key (TIENDA_ID, SERVICIO_ID) ,\r\n" + 
			   		"    CONSTRAINT FK_TS_TID foreign key (TIENDA_ID) references TIENDAS(ID),\r\n" + 
			   		"    CONSTRAINT FK_TS_SID foreign key (SERVICIO_ID) references SERVICIOS(ID)\r\n" + 
			   		");");
			 
			 try {
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(1,1);");
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(1,2);");
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(2,2);");
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(3,3);");
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			 //------------
			 //Productos
			 
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS MARCAS(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    NOMBRE varchar(50) UNIQUE\r\n" + 
			   		");");
			 
			 try {
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(1,'Rowwenta');");
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(2,'Phhillpis');");
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(3,'Sonyi');");
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(4,'Samsungg');");
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(5,'Xiaomimi');");
				 statement
				   .executeUpdate("INSERT INTO MARCAS VALUES(6,'IOSS');");
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS CATEGORIAS(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    NOMBRE varchar(50) UNIQUE\r\n" + 
			   		");");
			 
			 try {
				 statement
				   .executeUpdate("INSERT INTO CATEGORIAS VALUES(1,'Videojuegos,');");
				 statement
				   .executeUpdate("INSERT INTO CATEGORIAS VALUES(2,'Electrodomésticos,');");
				 statement
				   .executeUpdate("INSERT INTO CATEGORIAS VALUES(3,'Informática,');");
				 statement
				   .executeUpdate("INSERT INTO CATEGORIAS VALUES(4,'Telefonía,');");
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			 
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS PRODUCTOS(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    CATEGORIA_ID integer,\r\n" + 
			   		"    MARCA_ID integer,\r\n" + 
			   		"    TIENDA_ID integer,\r\n" + 
			   		"    IMAGEN varchar(250),\r\n" + 
			   		"    DESCRIPCION varchar(500),\r\n" + 
			   		"    CANTIDAD integer,\r\n" + 
			   		"    PRECIO decimal,\r\n" + 
			   		"    CONSTRAINT FK_P_C foreign key (CATEGORIA_ID) references CATEGORIAS(ID),\r\n" + 
			   		"    CONSTRAINT FK_P_M foreign key (MARCA_ID) references MARCAS(ID),\r\n" + 
			   		"    CONSTRAINT FK_P_T foreign key (TIENDA_ID) references TIENDAS(ID)\r\n" + 
			   		");");
			 try {
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS VALUES(1, 1, 3, 1, 'diablo2.jpg', 'Juego de Rol', 5, 50);");  
				 statement
				   .executeUpdate("UPDATE INTO PRODUCTOS VALUES(2, 1, 3, 2, 'CommandAndConquer.jpg', 'Juego de estretegía', 5, 45);");
				 statement
				   .executeUpdate("UPDATE INTO PRODUCTOS VALUES(3, 2, 2, 1, 'ElectrodomesticosDeCocina.jpg', 'Cocina completa', 5, 250);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS VALUES(4, 2, 1, 1, 'Microondas.jpg', 'Microondas', 5, 24);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS VALUES(5, 2, 1, 1, 'tostadorayMaquinaDeCoser.jpg', 'Tostadora máquina coser', 5, 80);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS VALUES(6, 2, 1, 1, 'Batidoras.jpg', 'Batidora', 5, 35);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS VALUES(7, 2, 1, 1, 'Exprimidoras.jpg', 'Exprimidor', 5, 15);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS VALUES(8, 2, 1, 1, 'Freidoras.jpg', 'Freidora', 5, 26);");
			} catch (Exception e) {
				// TODO: handle exception
			}

			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS PRODUCTOS_PUNTUACION(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    PUNTUACION integer,\r\n" + 
			   		"    CONSTRAINT FK_PP_P foreign key (ID) references PRODUCTOS(ID)\r\n" + 
			   		");");
			 
			 try {
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(1,5);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(1,4);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(2,4);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(3,5);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(4,4);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(5,3);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(3,5);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(3,4);");
				 statement
				   .executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(6,2);");
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS PRODUCTOS_OFERTAS(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    PRECIO integer,\r\n" + 
			   		"    NOMBRE varchar(50), \r\n" + 
			   		"    CONSTRAINT FK_PO_C foreign key (ID) references PRODUCTOS(ID)\r\n" + 
			   		");");
			 
			//------------
			 //Compras
			 
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS COMPRAS_ESTADOS(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    NOMBRE varchar(30)\r\n" + 
			   		");");
			 
			 try {
				 statement
				   .executeUpdate("INSERT INTO COMPRAS_ESTADOS VALUES(1,'Confirmada,');");
				 statement
				   .executeUpdate("INSERT INTO COMPRAS_ESTADOS VALUES(2,'Modificada,');");
				 statement
				   .executeUpdate("INSERT INTO COMPRAS_ESTADOS VALUES(3,'Cancelada,');");
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS COMPRAS(\r\n" + 
			   		"    ID integer identity PRIMARY KEY,\r\n" + 
			   		"    USER_ID integer,\r\n" + 
			   		"    FECHA date,\r\n" + 
			   		"   	ESTADO_ID integer,\r\n" + 
			   		"    CONSTRAINT FK_C_C foreign key (USER_ID) references USERS(ID),\r\n" + 
			   		"    CONSTRAINT FK_C_E foreign key (ESTADO_ID) references COMPRAS_ESTADOS(ID)\r\n" + 
			   		");");
			 
			 statement
			   .executeUpdate("CREATE TABLE IF NOT EXISTS COMPRAS_ITEMS(\r\n" + 
			   		"    COMPRA_ID integer,\r\n" + 
			   		"    PRODUCTO_ID integer,\r\n" + 
			   		"    CANTIDAD integer,\r\n" + 
			   		"    CONSTRAINT PK_CI primary key (COMPRA_ID, PRODUCTO_ID) ,\r\n" + 
			   		"    CONSTRAINT FK_CI_C foreign key (COMPRA_ID) references COMPRAS(ID),\r\n" + 
			   		"    CONSTRAINT FK_CI_P foreign key (PRODUCTO_ID) references PRODUCTOS(ID)\r\n" + 
			   		");");
			 
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void cerrarConexionBBDD()
	{
		try {
		statement.executeQuery("SHUTDOWN COMPACT");
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
}
