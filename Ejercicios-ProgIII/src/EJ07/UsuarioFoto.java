package EJ07;

import java.awt.image.BufferedImage;

public class UsuarioFoto extends Usuario{

	public UsuarioFoto(String nombre, String password) {
		super(nombre, password);
	}

	protected BufferedImage fotoUsuario; // Foto del usuario
	
	public UsuarioFoto(String nombre, String password, BufferedImage fotoUsuario) {
		super(nombre, password);
		this.fotoUsuario = fotoUsuario;
	}
	
	public BufferedImage getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(BufferedImage fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}
}
