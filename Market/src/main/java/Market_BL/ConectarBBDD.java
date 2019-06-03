package Market_BL;

import Market_DA.DataAccessCore;

/**
 * @author silverio
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
