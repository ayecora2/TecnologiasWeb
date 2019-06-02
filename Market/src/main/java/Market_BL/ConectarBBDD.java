package Market_BL;

import Market_DA.DataAccessCore;

public class ConectarBBDD {
	public static void conectarBBDD()
	{
		DataAccessCore.comprobarBBDD();
	}
}
