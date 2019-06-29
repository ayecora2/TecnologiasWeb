package Market_DO;

/**
 * Clase para los estados de las compras
 * @author ayecora
 * @author Silverio
 *
 */
public enum CompraEstados {
	
	/**
	 * Estado de la compra confirmada, lo que implica que se ha realizado correctamente y finalizada.
	 */
	Confirmada,
	/**
	 * Estado Modificada, se ha añadido, o modificado alguno de sus parámetros.
	 */
	Modificada,
	/**
	 * Estado Cancelada, el objeto que almacena la compra va ser destruido.
	 */
	Cancelada
	
}
