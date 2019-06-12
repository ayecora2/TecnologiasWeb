package Market_DO;

import java.io.*;

/**
 * Objeto DTO para bean login.
 * @author Abel
 * @author Silverio
 */

public final class Login implements Serializable{


	 /**
	 * Valor del serialversion
	 */
	private static final long serialVersionUID = 8386747024348057685L;
		private String Email; //Email
		private String Pass; //Pass
		
		/**
		 * Constructor que toma como paramámetros el Email y Pass
		 * @param Email Email
		 * @param Pass Password
		 */
		public Login(String Email, String Pass) {
			this.Email = Email;
			this.Pass = Pass;
		}
		/**
		 * Crea un nuevo login, no requiere parámetros a priori.
		 * Se configuran a posteriori.
		 */
		public Login() {super();}

		/**
		 * Devuelve el email
		 * @return email del usuario
		 */
		public String getEmail() {return Email;}

		/**
		 * Establece el email del usuario
		 * @param Email del usuario
		 */
		public void setEmail(String Email) {this.Email = Email;}

		/**
		 * Devuelve la clave del usuario
		 * @return clave del usuario
		 */
		public String getPass() {return Pass;}

		/**
		 * Establece la clave del usuario
		 * @param Pass clave del usuario
		 */
		public void setPass(String Pass) {this.Pass = Pass;}
	
}
