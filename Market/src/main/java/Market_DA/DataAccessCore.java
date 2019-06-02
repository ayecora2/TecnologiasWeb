package Market_DA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Market_DO.User;

/**
 * Clase para la interacción con la base de datos en memoria.
 * Esta clase en particular esta encargada de la introducción de los 
 * datos a usar en la práctica en la BBDD
 * 
 * @author silverio
 * @version 201905281427
 */
public class DataAccessCore {

	private static Connection connection = null;
	public static ResultSet resultSet = null;
	protected static Statement statement = null;

	/**
	 * Este médoto establece la conexión con la BBDD
	 */
	public static void conectarBBDD() {
		try {
			// Carga el Driver
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			// Establece la conexión
			connection = DriverManager.getConnection("jdbc:hsqldb:mem:memoria", "sa", "");
			// Iniciar valores BBDD
			iniciarBBDD();
		} catch (Exception ex) {ex.printStackTrace();}
	}

	/**
	 * Metodo para la creación de la tabla de Tipo de usuario, así como
	 * el añadir los dos tipos que se usarán por defecto. Admin y Usuario.
	 */
	private static void tablaTipoUsuario(){
		//Creación tipos de usuario
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS USERS_TYPE(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n" 
					+ "    NOMBRE varchar(40) UNIQUE\r\n" + ");");
		} catch (SQLException e1) {e1.printStackTrace();} // Imprimir la traza del error
		//Añadir dos tipos de usuario, Admin y usuario.
		try {
			statement.executeUpdate("INSERT INTO USERS_TYPE VALUES(1,'Admin');");
			statement.executeUpdate("INSERT INTO USERS_TYPE VALUES(2,'Usuario');");
		} catch (Exception e) {} // imprimir la traza del error	
	}
	
	/**
	 * Crea la tabla de usuarios con la nomenclatura:
	 * ID/PK(integer), Nombre(40), email(50), password(8), ciudad(50), CP(5), Tipo Usuario(Integer 1).
	 * Además añade tres usuarios básicos de pruebas Chary (Admin), Abel y Silverio.
	 */
	private static void tablaUsuarios() {	
		//Creación tabla de usuarios
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS USERS(\r\n"
					+ "    ID INTEGER IDENTITY PRIMARY KEY,\r\n" 
					+ "    NOMBRE varchar(40),\r\n" 
					+ "    APELLIDO varchar(40),\r\n" 
					+ "    EMAIL varchar(50),\r\n" 
					+ "    TELEFONO varchar(12),\r\n" 
					+ "    PASS varchar(8),\r\n"
					+ "    CIUDAD varchar(50),\r\n" 
					+ "    DIRECCION varchar(100), \r\n" 
					+ "    CP varchar(5), \r\n" 
					+ "    USER_TYPE_ID integer,\r\n" //enlace con la tabla de Tipos de Usuarios
					+ "    CONSTRAINT FK_UT_ID foreign key (USER_TYPE_ID) references USERS_TYPE(ID)\r\n" + ");");
		} catch (SQLException e1) {
			System.out.println("Error al crear la tabla de usuarios");
			e1.printStackTrace();
			} //Imprime la traza del error
		//Introducir usuarios básicos
		try { 
			//ID/PK(integer), Nombre(40), email(50), password(8), ciudad(50), CP(5), Tipo Usuario(Integer 1).
			statement.executeUpdate("INSERT INTO USERS (NOMBRE, APELLIDO, EMAIL, TELEFONO, PASS, CIUDAD, DIRECCION, CP, USER_TYPE_ID) VALUES('Charly','Bravo','charly@alumno.uned.es','9998887770','123','Leon','Calle Lola','24001',1);");
			statement.executeUpdate("INSERT INTO USERS (NOMBRE, APELLIDO, EMAIL, TELEFONO, PASS, CIUDAD, DIRECCION, CP, USER_TYPE_ID) VALUES('Silverio','Rosales','srosales2@alumno.uned.es','615324121','1234','Leon','Calle Tomás','24001',2);");				
			statement.executeUpdate("INSERT INTO USERS (NOMBRE, APELLIDO, EMAIL, TELEFONO, PASS, CIUDAD, DIRECCION, CP, USER_TYPE_ID) VALUES('Abel','Yécora','ayecora2@alumno.uned.es','623456788','1234','Logroño','Avenida Tomasolo','26001',2);");
		} catch (Exception e) {e.printStackTrace();} //Imprime la traza del error.
	}
	/**
	 * Método que creará la tabla de servicios e introducirá los servicios básicos
	 */
	private static void tablaServicios() {
		// Creación tabla de Servicios
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS SERVICIOS(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n"
					+ "    NOMBRE varchar(50) UNIQUE\r\n" + ");");
		} catch (SQLException e1) {e1.printStackTrace();} //Impresión de la traza de error
		//Introducción de servicios básicos.
		try { 
			statement.executeUpdate("INSERT INTO SERVICIOS VALUES(1,'Venta');");
			statement.executeUpdate("INSERT INTO SERVICIOS VALUES(2,'Financiación');");
			statement.executeUpdate("INSERT INTO SERVICIOS VALUES(3,'Servicio Postventa');");
			statement.executeUpdate("INSERT INTO SERVICIOS VALUES(4,'Reparto a domicilio');");
		} catch (Exception e) {e.printStackTrace();} //Impresión de la traza de error
	}
		
	/**
	 * Método para establecer la tienda y sus servicios.
	 * Este método unifica por razón de unificación de criterios, la definición
	 * de la única tienda con los servicios definidos que presta.
	 */
	private static void tablaTiendas() {
		//Creación tabla de tiendas.
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS TIENDAS(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n"
					+ "    NOMBRE varchar(50) UNIQUE\r\n" + ");");
		} catch (SQLException e1) {e1.printStackTrace();}

		try {statement.executeUpdate("INSERT INTO TIENDAS VALUES(1,'ElectroMarket');");
		} catch (Exception e) {}
		
		//Creación de la tabla y los servicios adjuntos a la tienda
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS TIENDA_SERVICIOS(\r\n"
					+ "    TIENDA_ID integer ,\r\n"
					+ "    SERVICIO_ID integer ,\r\n"
					+ "	   CONSTRAINT PK_TS primary key (TIENDA_ID, SERVICIO_ID) ,\r\n"
					+ "    CONSTRAINT FK_TS_TID foreign key (TIENDA_ID) references TIENDAS(ID),\r\n"
					+ "    CONSTRAINT FK_TS_SID foreign key (SERVICIO_ID) references SERVICIOS(ID)\r\n" + ");");
		} catch (SQLException e1) {e1.printStackTrace();}
		//Insercción de los servicios establecidos para la tienda 1 (única)
		try {
			statement.executeUpdate("INSERT INTO TIENDA_SERVICIOS VALUES(1,1);");
			statement.executeUpdate("INSERT INTO TIENDA_SERVICIOS VALUES(1,2);");
			statement.executeUpdate("INSERT INTO TIENDA_SERVICIOS VALUES(1,3);");
			statement.executeUpdate("INSERT INTO TIENDA_SERVICIOS VALUES(1,4);");
		} catch (Exception e) {}
	}

	/**
	 * El método crea la tabla Marcas y además inserta 6 marcas posibles de base.
	 */
	private static void tablaMarcas() {
		//Creación de la tabla MARCAS
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS MARCAS(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n"
					+ "    NOMBRE varchar(50) UNIQUE\r\n" + ");");
		} catch (SQLException e1) {e1.printStackTrace();} //Imprime la traza
		//Introducción de unas cuantas Marcas de base.
		try {
			statement.executeUpdate("INSERT INTO MARCAS VALUES(1,'Brawn');");
			statement.executeUpdate("INSERT INTO MARCAS VALUES(2,'Phillips');");
			statement.executeUpdate("INSERT INTO MARCAS VALUES(3,'LG');");
			statement.executeUpdate("INSERT INTO MARCAS VALUES(4,'Microsoft');");
			statement.executeUpdate("INSERT INTO MARCAS VALUES(5,'Sony');");
			statement.executeUpdate("INSERT INTO MARCAS VALUES(6,'IBM');");
			statement.executeUpdate("INSERT INTO MARCAS VALUES(7,'IOS');");
		} catch (Exception e) {System.out.println("\nError al intentar introducir las marcas por defecto.\n");}
	}
	
	/**
	 * Establece la tabla de categorías de los productos, y añade 4 categorias básicas.
	 * Videojuegos, Electrodomésticos, Informática y Telefonía
	 */
	private static void tablaCategorias() {
		//Creación de la tabla
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS CATEGORIAS(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n"
					+ "    NOMBRE varchar(50) UNIQUE\r\n" + ");");
		} catch (SQLException e1) {e1.printStackTrace();}
		//Insercción de varias categorías.
		try {
			statement.executeUpdate("INSERT INTO CATEGORIAS VALUES(1,'Videojuegos,');");
			statement.executeUpdate("INSERT INTO CATEGORIAS VALUES(2,'Electrodomésticos,');");
			statement.executeUpdate("INSERT INTO CATEGORIAS VALUES(3,'Informática,');");
			statement.executeUpdate("INSERT INTO CATEGORIAS VALUES(4,'Telefonía,');");
		} catch (Exception e) {e.printStackTrace();}
	}
	
	/**
	 * Método dedicado a la creación de la tabla de Productos y su estructura, así como
	 * inicializarla con la introducción de algunos productos base.
	 * Su nomenclatura es la siguiente:
	 * ID (integer identity PK), Categoría (id integer), marca(id Integer), tienda(id integer), imagen (250 chars), descripción (500)
	 * cantidad(integer), precio(decimal)
	 */
	private static void tablaProductos() {
		//Crear la tabla y su estructura
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS PRODUCTOS(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n" 
					+ "    CATEGORIA_ID integer,\r\n"
					+ "    TIENDA_ID integer,\r\n"  //Quizás debería eliminarse de la tabla. Sólo hay una tienda por ahora.
					+ "    MARCA_ID integer,\r\n" 
					+ "    NOMBRE varchar(50),\r\n"
					+ "    MODELO varchar(100),\r\n" 				
					+ "    IMAGEN varchar(250),\r\n"
					+ "    DESCRIPCION varchar(500),\r\n" 
					+ "    CANTIDAD integer,\r\n" 
					+ "    PRECIO decimal,\r\n"
					+ "    CONSTRAINT FK_P_C foreign key (CATEGORIA_ID) references CATEGORIAS(ID),\r\n"
					+ "    CONSTRAINT FK_P_M foreign key (MARCA_ID) references MARCAS(ID),\r\n"
					+ "    CONSTRAINT FK_P_T foreign key (TIENDA_ID) references TIENDAS(ID)\r\n" + ");");
		} catch (SQLException e1) {e1.printStackTrace();}
		//Insercción de algunos productos básicos
		try {
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(1,1,1,3,'Diablo II','Rol','diablo2.jpg','Juego de Rol',5,50);");
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(2,1,1,2,'Comamand And Conquer','Estrategia','CommandAndConquer.jpg','Juego de estretegía', 5, 45);");
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(3,2,1,3,'Set de Cocina','Blanco California','ElectrodomesticosDeCocina.jpg','Cocina completa',5,270);");
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(4,2,1,1,'Microondas','700Wattios','Microondas.jpg','Microondas',5,24);");
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(5,2,1,3,'Set Imprescindible','Africa People','tostadorayMaquinaDeCoser.jpg', 'Tostadora máquina coser', 5, 80);");
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(6,2,1,4,'Picadilly','Destrozadora','Batidoras.jpg','Batidora',5,35);");
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(7,2,1,5,'Aplastator','2000T','Exprimidoras.jpg', 'Exprimidor', 5, 15);");
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(8,2,1,6,'Dorator','Olieo IV','Freidoras.jpg','Freidora', 5, 26);");
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(9,3,1,6,'Holus','5000','computer.jpg','Ordenador PC', 2, 2666);");
			statement.executeUpdate("INSERT INTO PRODUCTOS VALUES(10,4,1,6,'Liberator','FreeSet','manoslibres.jpg','Set de manos libres', 400, 60);");
		} catch (Exception e) {e.printStackTrace();}
	}
	
	/**
	 * Creación de la tabla y su estructura para la puntuación de los productos.
	 * Se inserta algunas puntuaciones variables para algunos productos.
	 * Los valores a pasar de la tabla es el ID (integer PK == ID PK de Productos) y puntuación (integer)
	 */
	private static void tablaProductosPuntuacion() {
		//Creación de la tabla
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS PRODUCTOS_PUNTUACION(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n" 
					+ "    PUNTUACION integer,\r\n"
					+ "    CONSTRAINT FK_PP_P foreign key (ID) references PRODUCTOS(ID)\r\n" + ");");
		} catch (SQLException e1) {e1.printStackTrace();}
		//Inserta algunas puntuaciones a los productos
		try {
			statement.executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(1,5);"); //Conflicto, el primary key == con la ID y eso hace que se repita
			statement.executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(2,4);");
			statement.executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(3,5);");
			statement.executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(4,4);");
			statement.executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(5,3);");
			statement.executeUpdate("INSERT INTO PRODUCTOS_PUNTUACION VALUES(6,2);");
		} catch (Exception e) {e.printStackTrace();}
	}
	
	/**
	 * Creación de la tabla de Productos de oferta. Su nomenclatura es la siguiente:
	 * ID (integer identity PK)== Productos(ID), Precio (integer) + Nombre (char 50)
	 */
	private static void tablaProductosOfertas() {
		//Creación de la tabla.
		/* NOTA: el precio ¿debe ser integer o debe ser decimal? */
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS PRODUCTOS_OFERTAS(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n"
					+ "    PRECIO integer,\r\n" 
					+ "    NOMBRE varchar(50), \r\n"
					+ "    CONSTRAINT FK_PO_C foreign key (ID) references PRODUCTOS(ID)\r\n" + ");");
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	/**
	 * Creación de la tabla de estados de las compras e insercción de tres posibles estados de base.
	 * Su estructura será la siguiente:
	 * ID (Integer Identity PK) y Estado(varchar30) 
	 */
	private static void tablaComprasEstado() {
		//Creación de la tabla
		try {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS COMPRAS_ESTADOS(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n"
					+ "    ESTADO varchar(30)\r\n" + ");"); //Cambiado NOMBRE por ESTADO
		} catch (SQLException e1) {e1.printStackTrace();}
		//Insercción de los posibles estados
		try {
			statement.executeUpdate("INSERT INTO COMPRAS_ESTADOS VALUES(1,'Confirmada,');");
			statement.executeUpdate("INSERT INTO COMPRAS_ESTADOS VALUES(2,'Modificada,');");
			statement.executeUpdate("INSERT INTO COMPRAS_ESTADOS VALUES(3,'Cancelada,');");
		} catch (Exception e) {e.printStackTrace();}
	}
	
	/** Valores para iniciar la base de datos. */
	private static void iniciarBBDD() {
		try {
			// Ejecutamos los comandos de BBDD
			statement = connection.createStatement();
			//Creación de las tablas y introducción de datos básicos.
			tablaTipoUsuario();
			tablaUsuarios();
			tablaServicios();
			tablaTiendas();
			tablaMarcas();
			tablaCategorias();
			tablaProductos();
			tablaProductosPuntuacion();
			tablaProductosOfertas();
			tablaComprasEstado();
			// ------------
			//Las siguientes tablas no introducen dato alguno, por lo que no se crea un método dedicado a cada una, por ahora.
			//Creación tabla COMPRAS
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS CARRITO(\r\n"
					+ "    ID integer identity PRIMARY KEY,\r\n" 
					+ "    USER_ID integer,\r\n" 
					+ "    FECHA date,\r\n"
					+ "    ESTADO_ID integer,\r\n"
					+ "    CONSTRAINT FK_C_C foreign key (USER_ID) references USERS(ID),\r\n"
					+ "    CONSTRAINT FK_C_E foreign key (ESTADO_ID) references COMPRAS_ESTADOS(ID)\r\n" + ");");
			
			//Creación tabla COMPRAS_ITEMS
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS CARRITO_ITEMS(\r\n" 
					+ "    COMPRA_ID integer,\r\n"
					+ "    PRODUCTO_ID integer,\r\n"
					+ "    CANTIDAD integer,\r\n"
					+ "    CONSTRAINT PK_CI primary key (COMPRA_ID, PRODUCTO_ID) ,\r\n" //¿Es necesario doble key?
					+ "    CONSTRAINT FK_CI_C foreign key (COMPRA_ID) references CARRITO(ID),\r\n"
					+ "    CONSTRAINT FK_CI_P foreign key (PRODUCTO_ID) references PRODUCTOS(ID)\r\n" + ");");

		} catch (Exception ex) {ex.printStackTrace();}
	}
	public static void comprobarBBDD()
	{
		try{
			ResultSet resultSet;
			resultSet = statement.executeQuery("SELECT * FROM USERS");

		} catch (Exception ex) {
			conectarBBDD();
			//ex.printStackTrace();
		}
	}

	/**
	 * Cierra la conexión con la base de datos.
	 */
	public void cerrarConexionBBDD() {
		try {statement.executeQuery("SHUTDOWN COMPACT");} 
		catch (Exception ex) {ex.printStackTrace();}
	}
}