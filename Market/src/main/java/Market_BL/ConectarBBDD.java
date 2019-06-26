package Market_BL;

import Market_DA.DataAccessCore;

/**
 * Clase para conectar o desconectar con la base de datos
 * @author silverio
 * @author ayecora
 * @version 201906261516
 */
public class ConectarBBDD {
	
	/**
	 * Este método realiza la conexión con la Base de Datos.
	 */
	public static void conectarBBDD(){DataAccessCore.conectarBBDD();}
	
	/**
	 * Método que realiza el cierre de la conexión con la Base de datos.
	 */
	public static void desconectarBBDD() {DataAccessCore.cerrarConexionBBDD();}
}
