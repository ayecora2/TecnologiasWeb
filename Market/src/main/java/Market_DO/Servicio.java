package Market_DO;

/**
 * La clase Servicio define el tipo de servicio a prestar.
 * Consta de un nombre y un ID único
 * @author silverio
 */
public class Servicio {

	private String Name;
	private int Id;
	
	/**
	 * Constructor de la clase Servicio
	 * @param Id del servico
	 * @param Name nombre del servicio.
	 */
	public Servicio(int Id, String Name) {
		this.Name = Name;
		this.Id = Id;
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
