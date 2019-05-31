package Market_DO;

import java.util.*;

/**
 * La clase producto identifica y describe a un producto
 * en concreto, además de almecenar sus características peculiares.
 * @author silverio
 * @version 201905271605
 */
public class Producto {
	
	private int id; //Id del producto.
	private int categoria_Id; //Identificador de la categoría del producto
	private int tienda_Id; //Identificador de la tienda
	private int marca_Id; //identificador de la marca
	private String nombre;
	private String modelo;
	private String imagen;
	private String descripcion; //la descripción del producto
	private int cantidad; //Su cantidad
	private double precio; //su precio
	private List<ProductoPuntuacion> productoPuntuacion; //Almacena una lista de las puntuaciones del producto

	/**
	 * Constructor que genera un producto mediante el paso de los parámetros.
	 * @param id id del producto
	 * @param categoria_Id id de la categoría del producto
	 * @param tienda_Id id de la tienda donde está el producto
	 * @param marca_Id id de la marca del producto
	 * @param nombre del producto.
	 * @param modelo del producto.
	 * @param imagen id de la imagen del producto
	 * @param descripcion descripción del producto
	 * @param cantidad número de items que hay del producto
	 * @param precio precio de cada unidad de producto
	 */
	public Producto(int id, int categoria_Id, int tienda_Id, int marca_Id, String nombre, String modelo, String imagen, String descripcion,
			int cantidad, double precio) {
		super();
		this.id = id;
		this.categoria_Id = categoria_Id;
		this.tienda_Id = tienda_Id;
		this.marca_Id = marca_Id;
		this.nombre = nombre;
		this.modelo = modelo;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
		//this.productoPuntuacion = productoPuntuacion;
	}
	/**
	 * Constructor sin parámetros que hereda de la superclase sus atributos.
	 * Luego mediante los setters se pueden configurar sus campos.
	 */
	public Producto() {	super();}
	
	/**
	 * @return the id
	 */
	public int getId() {return id;}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {this.id = id;}
	/**
	 * @return the categoria_Id
	 */
	public int getCategoria_Id() {return categoria_Id;}
	/**
	 * @param categoria_Id the categoria_Id to set
	 */
	public void setCategoria_Id(int categoria_Id) {this.categoria_Id = categoria_Id;}
	/**
	 * @return the marca_Id
	 */
	public int getMarca_Id() {return marca_Id;}
	/**
	 * @param marca_Id the marca_Id to set
	 */
	public void setMarca_Id(int marca_Id) {this.marca_Id = marca_Id;}
	/**
	 * @return the tienda_Id
	 */
	public int getTienda_Id() {return tienda_Id;}
	/**
	 * @param tienda_Id the tienda_Id to set
	 */
	public void setTienda_Id(int tienda_Id) {this.tienda_Id = tienda_Id;}
	/**
	 * @return the imagen
	 */
	public String getImagen() {return imagen;}
	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {this.imagen = imagen;}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {return descripcion;}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {return cantidad;}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {this.cantidad = cantidad;}
	/**
	 * @return the precio
	 */
	public double getPrecio() {return precio;}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {this.precio = precio;}
	/**
	 * @return the productoPuntuacion
	 */
	public List<ProductoPuntuacion> getProductoPuntuacion() {return productoPuntuacion;}
	/**
	 * @param productoPuntuacion the productoPuntuacion to set
	 */
	public void setProductoPuntuacion(List<ProductoPuntuacion> productoPuntuacion) {this.productoPuntuacion = productoPuntuacion;}
	/**
	 * @return the nombre
	 */
	public String getNombre() {return nombre;}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {this.nombre = nombre;}
	/**
	 * @return the modelo
	 */
	public String getModelo() {return modelo;}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {this.modelo = modelo;}	
}
