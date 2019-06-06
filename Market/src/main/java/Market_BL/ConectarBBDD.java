package Market_BL;

import Market_DA.DataAccessCore;

/**
 * Clase para conectar con la base de datos
 * @author silverio
 * @author ayecora
 * @version 201906012138
 */
public class ConectarBBDD {
	
	public static void conectarBBDD()
	{
		//conecta a la Base de Datos
		DataAccessCore.conectarBBDD();
	}
	
	public static void desconectarBBDD() {DataAccessCore.cerrarConexionBBDD();}
}
