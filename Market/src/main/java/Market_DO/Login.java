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
		private String User; //Usurio
		private String Pass; //Pass
		
		/**
		 * Constructor que toma como paramámetros el User y Pass
		 * @param User Username
		 * @param Pass Password
		 */
		public Login(String User, String Pass) {
			this.User = User;
			this.Pass = Pass;
		}
		/**
		 * Crea un nuevo usuario, no requiere parámetros a priori.
		 * Se configuran a posteriori.
		 */
		public Login() {super();	}

		public String getUser() {
			return User;
		}

		public void setUser(String User) {
			this.User = User;
		}

		public String getPass() {
			return Pass;
		}

		public void setPass(String Pass) {
			this.Pass = Pass;
		}
	
}
