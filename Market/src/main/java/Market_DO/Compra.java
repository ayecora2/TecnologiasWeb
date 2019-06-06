package Market_DO;

import java.sql.Date;

/**
 * 
 * Clase para generar objetos compra
 * @author ayecora
 * @author Silverio
 *
 */
public class Compra {

	private int Id; //Id de la compra
	private int User_Id; //El ID del usuario que realiza la compra
	private Date Fecha; //Fecha de la compra
	private int Estado; //Estado en que se encuentra la compra
	

	/**
	 * @param id de la compra
	 * @param user_Id ID del usuario
	 * @param fecha Fecha de la compra
	 * @param estado Estado en que se encuetra la compra
	 */
	public Compra(int id, int user_Id, Date fecha, int estado) {
		super();
		Id = id;
		User_Id = user_Id;
		Fecha = fecha;
		Estado = estado;
	}

	/**
	 * Constructor sin parámetros, útil si se desea crear el objeto y configurar sus campos
	 * a posteriori.
	 */
	public Compra() {
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
	 * @return the user_Id
	 */
	public int getUser_Id() {return User_Id;}

	/**
	 * @param user_Id the user_Id to set
	 */
	public void setUser_Id(int user_Id) {User_Id = user_Id;}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {return Fecha;}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {Fecha = fecha;}

	/**
	 * @return the estado
	 */
	public int getEstado() {return Estado;}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {Estado = estado;}	
}
