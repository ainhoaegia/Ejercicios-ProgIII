package EJ07;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class VentanaUsuario extends JFrame{
	
	private JTextField tfNombre;
	private JTextField tfPassword;
	
	protected String nombre;
	protected String password;
	
	private JPanel panelNorte;
	private JPanel panelSur;
	
	private JButton botonFoto;
	private JButton botonNivel;
	
	
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
		
		panelNorte.add( new JLabel( "Nombre" ) );
		panelNorte.add( tfNombre );
		
		panelNorte.add( new JLabel( "Password:" ) );
		panelNorte.add( tfPassword );
		
		tfNombre.setText( u.getNombre() );
		tfPassword.setText( u.getPassword() );
		
		botonFoto = new JButton( "FOTO" );
		botonNivel = new JButton( "NIVEL" );
		
		panelSur.add( botonFoto );
		panelSur.add( botonNivel );
		
		botonFoto.setFocusable( true );
		botonNivel.setFocusable( true );
		
		botonFoto.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaUsuarioFoto vFoto = new VentanaUsuarioFoto( "FOTO" );
				vFoto.setLocation( getLocation().x, getLocation().y );
				vFoto.setVisible( true );
				
				setVisible( false );
				dispose();
				
			}
		});
		
		botonNivel.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaUsuarioNivel vNivel = new VentanaUsuarioNivel( "NIVEL" );
				vNivel.setLocation( getLocation().x, getLocation().y );
				vNivel.setVisible( true );
				
				setVisible( false );
				dispose();
			}
		});
		
		muestraUsuario();
		
	}
	
	public void muestraUsuario() {
		nombre = u.getNombre();
		password = u.getPassword();
		
		System.out.println( "Nombre: " + nombre + " --> Password: " + password);
	}
}
