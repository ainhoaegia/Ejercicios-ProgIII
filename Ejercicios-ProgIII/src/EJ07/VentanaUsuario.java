package EJ07;

import java.awt.BorderLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class VentanaUsuario extends JFrame{
	
	private JTextField tfNombre;
	private JTextField tfPassword; // LA CONTRASEÑA NO TIENE QUE SER VISIBLE
	
	private String nombre;
	private String password;
	
	private JPanel panelNorte;
	private JPanel panelSur;
	
	Usuario u = new Usuario( nombre, password );
	
	public static void main(String[] args) {
		VentanaUsuario v = new VentanaUsuario( "EJERCICIO 7" );
		v.setVisible( true );
	}
	
	public VentanaUsuario(String titulo) {
		
		super( titulo );
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );   
		this.setSize( 900, 300 ); 
		this.setLocationRelativeTo( null ); // CENTRAR LA VENTANA
		
		panelNorte = new JPanel();
		panelSur = new JPanel();
		
		this.add( panelNorte, BorderLayout.CENTER );
		this.add( panelSur, BorderLayout.SOUTH );
		
		tfNombre = new JTextField( 15 );
		tfPassword = new JPasswordField( 15 );
		
		
		panelNorte.add( new JLabel( "Usuario: @" ) );
		panelNorte.add( tfNombre );
		
		panelNorte.add( new JLabel( "Contraseña:" ) );
		panelNorte.add( tfPassword );
		
		muestraUsuario();
		
	}
	
	public void muestraUsuario() {
		nombre = u.getNombre();
		password = u.getPassword();
		
		System.out.println( "Nombre: " + nombre + "Password: " + password);
	}
}
