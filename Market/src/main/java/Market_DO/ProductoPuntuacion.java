package Market_DO;

/**
 * Esta clase almacena el ID de un producto y la puntuación
 * @author silverio
 */
public class ProductoPuntuacion {
	private int id;
	private int puntuacion;

	/**
	 * Este constructor recibe por parámentro el id y la puntuación inicial de producto.
	 * @param id del producto
	 * @param puntuacion puntuación del producto
	 */
	public ProductoPuntuacion(int id, int puntuacion) {
		this.id = id;
		this.puntuacion = puntuacion;
	}

	/**
	 * @return the id
	 */
	public int getId() {return id;}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {this.id = id;}

	/**
	 * @return the puntuacion
	 */
	public int getPuntuacion() {return puntuacion;}

	/**
	 * @param puntuacion the puntuacion to set
	 */
	public void setPuntuacion(int puntuacion) {this.puntuacion = puntuacion;}
	


}
