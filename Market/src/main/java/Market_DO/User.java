package Market_DO;


/**
 * Esta clase representa a un usuario.
 * El usuario puede ser un cliente, un vendedor, etc.
 * Almacena sus datos personales así como un identificador
 * único, una clave y el tipo de usuario.
 * @author silverio
 */
public class User {
	

    private int Id;
    private String Nombre;
    private String Email;
    private String Pass;
    private String Ciudad;
    private String CP;
    private int UserType_Id;
    
	/**
	 * Crea un nuevo usuario, no requiere parámetros a priori.
	 * Se configuran a posteriori.
	 */

	public User(int Id, String Nombre, String Email, String Pass, String Ciudad, String CP, int UserType) {
		// TODO Auto-generated constructor stub
		this.Id =Id;
		this.Nombre =Nombre;
		this.Email =Email;
		this.Pass =Pass;
		this.Ciudad =Ciudad;
		this.CP =CP;
		this.UserType_Id =UserType;
		
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
	 * @return the nombre
	 */
	public String getNombre() {return Nombre;}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {Nombre = nombre;}

	/**
	 * @return the email
	 */
	public String getEmail() {return Email;}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {Email = email;}

	/**
	 * @return the pass
	 */
	public String getPass() {return Pass;}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {Pass = pass;}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {return Ciudad;}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {Ciudad = ciudad;}

	/**
	 * @param string 
	 * @param string 
	 * @return the cP
	 */
	public String getCP() {return CP;}

	/**
	 * @param cP the cP to set
	 */
	public void setCP(String cP) {CP = cP;}

	/**
	 * @return the userType
	 */
	public int getUserType() {return UserType_Id;}

	/**
	 * @param userType the userType to set
	*/
	public void setUserType(int userType) {UserType_Id = userType;}
}