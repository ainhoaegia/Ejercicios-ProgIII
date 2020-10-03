package EJ07;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaUsuarioNivel extends VentanaUsuario{
	
	public static void main(String[] args) {
		VentanaUsuarioNivel vNivel = new VentanaUsuarioNivel( "NIVEL DEL USUARIO" );
		vNivel.setVisible( true );
	}
	
	public VentanaUsuarioNivel(String titulo) {
		super(titulo);
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );   
		this.setSize( 900, 300 ); 
		this.setLocationRelativeTo( null ); // CENTRAR LA VENTANA
		
		// TODO Nombre , contraseña, paneles.
		// TODO Jslider para nivel
	}

}
