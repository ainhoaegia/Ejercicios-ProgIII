package EJ07;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class VentanaUsuarioNivel extends VentanaUsuario{
	
	protected int nivel;
	private JSlider jsNivel;
	
	Usuario u = new Usuario( nombre, password );
	UsuarioNivel uNivel = new UsuarioNivel( nombre, password, nivel );

	private JPanel panelIzquierda;
	private JPanel panelDerecha;
	private JPanel panelSur;
	
	public static void main(String[] args) {
		VentanaUsuarioNivel vNivel = new VentanaUsuarioNivel( "NIVEL DEL USUARIO" );
		vNivel.setVisible( true );
	}
	
	public VentanaUsuarioNivel(String titulo) {
		super(titulo);
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );   
		this.setSize( 900, 300 ); 
		this.setLocationRelativeTo( null ); // CENTRAR LA VENTANA
		
		panelIzquierda = new JPanel();
		panelDerecha = new JPanel();
		panelSur = new JPanel();
		
		this.add( panelIzquierda, BorderLayout.EAST );
		this.add( panelDerecha, BorderLayout.WEST );
		this.add( panelSur, BorderLayout.SOUTH );
		
		panelIzquierda.add( new JLabel( "Nombre" ) );
		panelIzquierda.add( new JLabel( nombre ) );
		
		panelIzquierda.add( new JLabel( "Password:" ) );
		panelIzquierda.add( new JLabel( password ) );
		
		jsNivel = new JSlider( 10 );
		
		panelDerecha.add( jsNivel );
		
		JButton botonAtras = new JButton( "ATRAS" );
		panelSur.add( botonAtras );
		
		botonAtras.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaUsuario v = new VentanaUsuario( "EJERCICIO 7" );
				v.setLocation( getLocation().x, getLocation().y );
				v.setVisible( true );
				
				setVisible( false );
				dispose();
			}
		});
	}

}
