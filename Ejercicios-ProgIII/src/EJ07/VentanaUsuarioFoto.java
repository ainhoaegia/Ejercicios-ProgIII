package EJ07;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class VentanaUsuarioFoto extends JFrame{
	
	private ImageIcon imagen = new ImageIcon("src/EJ07/fotoPersona.png");
	private JLabel imag = new JLabel(imagen);
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
		VentanaUsuarioFoto vFoto = new VentanaUsuarioFoto( "FOTO DEL USUARIO" );
		vFoto.setVisible( true );
	}
	
	public VentanaUsuarioFoto(String titulo) {
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
		taDatos.setText( "Nombre: " + nombre + "\n" + "Password: " + password );
		
		taDatos.setEditable( false );
		panelIzquierda.add( taDatos );
		
		
	// PANEL DERECHA
		
		panelDerecha.add( imag );
		
//		try {                
//			foto = ImageIO.read(new File("src/EJ07/fotoPersona.png"));
//		} catch (IOException ex) {}
//		
//		panelDerecha.add( new JLabel( new ImageIcon( foto )));
		
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
