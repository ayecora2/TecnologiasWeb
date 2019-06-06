package Market_DO;

/**
 * Clase para generar items en la lista de la compra y comprados
 * @author ayecora
 * @author Silverio
 *
 */
public class CompraItems {

	private int Id; //ID de la compra
	private int Producto_Id; //ID del producto
	private int Cantidad; //Cantidad de items
	
	/**
	 * @param id
	 * @param producto_Id
	 * @param cantidad
	 */
	public CompraItems(int id, int producto_Id, int cantidad) {
		super();
		Id = id;
		Producto_Id = producto_Id;
		Cantidad = cantidad;
	}
	/**
	 * Constructor para crear el objeto y a posteriori ser inicializado mediante los sets.
	 */
	public CompraItems() {
		super();
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
	 * @return the producto_Id
	 */
	public int getProducto_Id() {return Producto_Id;}
	
	/**
	 * @param producto_Id the producto_Id to set
	 */
	public void setProducto_Id(int producto_Id) {Producto_Id = producto_Id;}
	
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {return Cantidad;}
	
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {Cantidad = cantidad;}
}
