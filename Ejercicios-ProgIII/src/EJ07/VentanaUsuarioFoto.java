package EJ07;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VentanaUsuarioFoto extends VentanaUsuario{
	
	protected BufferedImage foto;
	
	Usuario u = new Usuario( nombre, password );
	UsuarioFoto uFoto = new UsuarioFoto( nombre, password, foto );

	private JPanel panelIzquierda;
	private JPanel panelDerecha;
	
	public static void main(String[] args) {
		VentanaUsuarioFoto vFoto = new VentanaUsuarioFoto(" FOTO DEL USUARIO ");
		vFoto.setVisible( true );
	}
	
	public VentanaUsuarioFoto(String titulo) {
		super(titulo);
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );   
		this.setSize( 900, 300 ); 
		this.setLocationRelativeTo( null ); // CENTRAR LA VENTANA
		
		this.add( panelIzquierda, BorderLayout.EAST );
		this.add( panelDerecha, BorderLayout.WEST );
		
		panelIzquierda.add( new JLabel( "Nombre" ) );
		panelIzquierda.add( new JLabel( nombre ) );
		
		panelIzquierda.add( new JLabel( "Password:" ) );
		panelIzquierda.add( new JLabel( password ) );
		
		JLabel lFoto = new JLabel(new ImageIcon(foto));
		
		
		try {                
			foto = ImageIO.read(new File("src/EJ07/fotoPersona.png"));
		} catch (IOException ex) {}
		
		panelDerecha.add(lFoto);
	}

}
