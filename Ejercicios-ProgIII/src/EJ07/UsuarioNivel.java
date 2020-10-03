package EJ07;

public class UsuarioNivel extends Usuario{

	public UsuarioNivel(String nombre, String password) {
		super(nombre, password);
	}
	
	protected int nivelUsuario; // Niveles de acceso, por ejemplo
	
	public UsuarioNivel(String nombre, String password, int nivelUsuario) {
		super(nombre, password);
		this.nivelUsuario = nivelUsuario;
	}
	
}
