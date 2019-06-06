package Market_DO;

import java.util.List;

/**
 * La clase Tienda almacena la lista de los servicios que ofrece
 * así mismo la identifica entre varias un ID y un nombre.
 * Sus propiedades pueden ser dadas en el constructor o a posteriori
 * ser modificadas mediante sus correspondientes setters.
 * @author silverio
 * @author Abel
 */
public class Tienda {

	private String Name;
	private int Id;
	private List<Servicio> Servicios;
	
	/**
	 * @param Id de la instancia tienda
	 * @param Name nombre de la tienda
	 * @param Servicios lista de los servicios que ofrece la tienda
	 */
	public Tienda(int Id, String Name, List<Servicio> Servicios) {
		this.Name = Name;
		this.Id = Id;
		this.Servicios = Servicios;
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

	/**
	 * @return the servicios
	 */
	public List<Servicio> getServicios() {return Servicios;}

	/**
	 * @param servicios the servicios to set
	 */
	public void setServicios(List<Servicio> servicios) {Servicios = servicios;}
	

}
