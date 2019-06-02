package Market_DO;
import java.io.*;

/**
 * Esta clase representa a un usuario.
 * El usuario puede ser un cliente, un vendedor, etc.
 * Almacena sus datos personales así como un identificador
 * único, una clave y el tipo de usuario.
 * @author silverio
 * @version 201929051557
 */
public final class User implements Serializable{
	//Campos privados que definen a una instancia.
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String pass;
    private String ciudad;
    private String direccion;
    private String CP;
    private int userType_Id;

	/**
	 * Constructor de la clase User, configura mediante parámetros la instancia a crear.
	 * @param Id del usuario
	 * @param Nombre del usuario
	 * @param apellido del usuario
	 * @param Email del usuario
	 * @param telefono del usuario
	 * @param Pass clave personal del usuario
	 * @param Ciudad de residencia habitual del usuario
	 * @param direccion del usuario
	 * @param CP Código Postal del usuario
	 * @param UserType Tipo de Usuario, 1 Admin, 2 Usuario generico (Cliente)
	 */
	public User(int Id, String Nombre,String apellido, String Email, String telefono, String Pass, String Ciudad, String direccion, String CP, int UserType) {
		this.id = Id;
		this.nombre =Nombre;
		this.apellido = apellido;
		this.email = Email;
		this.telefono = telefono;
		this.pass = Pass;
		this.ciudad = Ciudad;
		this.direccion = direccion;
		this.CP = CP;
		this.userType_Id = UserType;		
	}

	/**
	 * Crea un nuevo usuario, no requiere parámetros a priori.
	 * Se configuran a posteriori.
	 */
	public User() {super();	}
	
	/**
	 * @return the id
	 */
	public int getId() {return id;}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {this.id = id;}

	/**
	 * @return the nombre
	 */
	public String getNombre() {return nombre;}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {this.nombre = nombre;}

	/**
	 * @return the email
	 */
	public String getEmail() {return email;}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {this.email = email;}

	/**
	 * @return the pass
	 */
	public String getPass() {return pass;}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {this.pass = pass;}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {return ciudad;}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {this.ciudad = ciudad;}

	/**
	 * @return the cP
	 */
	public String getCP() {return CP;}

	/**
	 * @param cP the cP to set
	 */
	public void setCP(String cP) {this.CP = cP;}

	/**
	 * @return the userType
	 */
	public int getUserType() {return userType_Id;}

	/**
	 * @param userType the userType to set
	*/
	public void setUserType(int userType) {userType_Id = userType;}

	/**
	 * @return el número de teléfono del usuario
	 */
	public String getTelefono() {return telefono;}
	
	/**
	 * Establece el número de teléfono del usuario
	 * @param telefono teléfono del usuario
	 */
	public void setTelefono(String telefono) {this.telefono = telefono;}

	/**
	 * @return the apellido
	 */
	public String getApellido() {return apellido;}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {this.apellido = apellido;}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {return direccion;}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {this.direccion = direccion;}

	public int getUserType_Id() {return userType_Id;}

	public void setUserType_Id(int userType_Id) {this.userType_Id = userType_Id;}
}