package Market_DO;

/**
 * Esta clase almacena el ID de un producto y la puntuación
 * @author silverio
 * @version 201905302021
 */
public class ProductoPuntuacion {
	private int id;
	private float puntuacion;

	/**
	 * Este constructor recibe por parámentro el id y la puntuación inicial de producto.
	 * @param id del producto
	 * @param puntuacion puntuación del producto
	 */
	public ProductoPuntuacion(int id, float puntuacion) {
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
//	public void setId(int id) {this.id = id;}

	/**
	 * @return the puntuacion
	 */
	public float getPuntuacion() {return puntuacion;}

	/**
	 * @param puntuacion the puntuacion to set
	 */
	public void setPuntuacion(float puntuacion) {this.puntuacion = puntuacion;}
	


}
