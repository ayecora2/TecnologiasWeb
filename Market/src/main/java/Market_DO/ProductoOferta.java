package Market_DO;

/**
 * Clase de Oferta de un Producto.
 * Almacena un producto en oferta, que se le pasa
 * mediante su constructor.
 * @author silverio
 *
 */
public class ProductoOferta {
	
	private int Id;
	private double Precio;
	private String Nombre;

	/**
	 * @param Id La id de la oferta
	 * @param Precio nuevo precio de oferta para el producto
	 * @param Nombre nombre del producto en oferta
	 */
	public ProductoOferta(int Id, double Precio, String Nombre) {
		this.Id = Id;
		this.Precio = Precio;
		this.Nombre = Nombre;
	}

	/**
	 * @return the id
	 */
	public int getId() {return Id;}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {Id = id;}

	/**
	 * @return the precio
	 */
	public double getPrecio() {return Precio;}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {Precio = precio;}

	/**
	 * @return the nombre
	 */
	public String getNombre() {return Nombre;}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {Nombre = nombre;}

}
