package Market_DO;

/**
 * 
 * Clase para generar un objeto de tipo de usuario
 * @author silverio
 * @author Abel
 *
 */

public class UserType {
	
	private String Name; //ID del usuario
	private int Id; //tipo de usuario
	
	/**
	 * Constructor que toma como paramámetros el ID y nombre
	 * @param Id ID del usuario
	 * @param Name Nombre del usuario
	 */
	public UserType(int Id, String Name) {
		this.Name = Name;
		this.Id = Id;
	}
	
	/**
	 * Constructor sin parámetros, estos se pueden introducir a posteriori.
	 */
	public UserType() {
		super(); //Hereda de la superclase
	}

	/**
	 * @return the name
	 */
	public String getName() {return Name;}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {Name = name;}

	/**
	 * @return the id
	 */
	public int getId() {return Id;}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {Id = id;}
}
