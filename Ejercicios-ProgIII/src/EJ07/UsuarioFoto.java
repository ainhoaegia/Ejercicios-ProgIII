package EJ07;

import java.awt.Image;

public class UsuarioFoto extends Usuario{

	public UsuarioFoto(String nombre, String password) {
		super(nombre, password);
	}

	protected Image fotoUsuario; // Foto del usuario
	
	public UsuarioFoto(String nombre, String password, Image fotoUsuario) {
		super(nombre, password);
		this.fotoUsuario = fotoUsuario;
	}
	
	public Image getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(Image fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}
}
