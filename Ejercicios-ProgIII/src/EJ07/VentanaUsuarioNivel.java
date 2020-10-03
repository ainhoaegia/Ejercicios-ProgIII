package EJ07;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class VentanaUsuarioNivel extends JFrame{
	
	protected int nivel;
	private JSlider jsNivel;
	private VentanaUsuario v;
	private JPanel panelCentro;
	private JPanel panelIzquierda;
	private JPanel panelDerecha;
	private JPanel panelSur;
	private String nombre;
	private String password;
	private JTextArea taDatos;
	
	Usuario u = new Usuario( nombre, password );
	
	public static void main(String[] args) {
		VentanaUsuarioNivel vNivel = new VentanaUsuarioNivel( "NIVEL DEL USUARIO" );
		vNivel.setVisible( true );
	}
	
	public VentanaUsuarioNivel(String titulo) {
		super(titulo);
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );   
		this.setSize( 900, 300 ); 
		this.setLocationRelativeTo( null ); // CENTRAR LA VENTANA
		
		
	// PANELES
		
		panelCentro = new JPanel( new GridLayout( 1, 2 ) );
		panelIzquierda = new JPanel( new BorderLayout() );
		panelDerecha = new JPanel( new BorderLayout() );
		panelCentro.add( panelIzquierda );
		panelCentro.add( panelDerecha );
		panelSur = new JPanel();
		
		this.add( panelCentro, BorderLayout.CENTER );
		this.add( panelSur, BorderLayout.SOUTH );
		
		
	// VARIABLES
		
		nombre = u.getNombre();
		password = u.getPassword();
		
		
	// PANEL IZQUIERDA
		
		taDatos = new JTextArea();
		taDatos.setText( "Nombre: " + nombre + "\n" + "Password: " + password + "\n" +
						"Por favor, indique a la derecha el nivel del usuario del 0 al 10" );
		
		taDatos.setEditable( false );
		panelIzquierda.add( taDatos );
		
		
	// PANEL DERECHA
		
		jsNivel = new JSlider( 0, 10 );
		
		jsNivel.setMajorTickSpacing( 10 );
		jsNivel.setMinorTickSpacing( 1 );
		jsNivel.setPaintTicks( true );
		jsNivel.setPaintLabels( true );
		jsNivel.setSnapToTicks( true );
		
		panelDerecha.add( jsNivel );
		
		
	// PANEL SUR
		
		JButton botonAtras = new JButton( "ATRAS" );
		panelSur.add( botonAtras );
		
		botonAtras.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				v = new VentanaUsuario( "EJERCICIO 7" );
				v.setLocation( getLocation().x, getLocation().y );
				v.setVisible( true );
				
				setVisible( false );
				dispose();
			}
		});
	}

}
