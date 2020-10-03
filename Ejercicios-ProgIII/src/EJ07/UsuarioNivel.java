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
	
	public void nivel() {
		if (nivelUsuario>10) {
			nivelUsuario = 10;
		} else if (nivelUsuario<0) {
			nivelUsuario =0;
		}
	}
}
