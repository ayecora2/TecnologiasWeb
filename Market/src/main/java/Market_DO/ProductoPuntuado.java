package Market_DO;


/**
 * Esta clase almacena un producto y su puntuación
 * @author silverio
 * @version 201905302021
 */
public class ProductoPuntuado {
	private Producto producto; //Producto.
	private int puntuacion; //Puntuación
	
	public ProductoPuntuado(Producto producto, int puntuacion) {
		super();
		this.producto = producto;
		this.puntuacion = puntuacion;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
}
