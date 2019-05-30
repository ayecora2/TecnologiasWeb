package Market_DO;

/**
 * Clase destinada a representar una marca.
 * @author silverio
 */
public class Marca {
	
	private String Name; //Nombre de la marca
	private int Id; //ID de la marca

	/**
	 * Constructor de la clase Marca por parámetros.
	 * @param Id de la marca
	 * @param Name nombre de la marca
	 */
	public Marca(int Id, String Name) {
		this.Name = Name;
		this.Id = Id;
	}

	/**
	 * Constructor sin parámetros.
	 */
	public Marca() {super();}

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
