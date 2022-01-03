import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
public class main {

	public static void main(String[] args) {
		//boolean a = false;
		JFrame ventana_menu = new JFrame();
		//JFrame ventana_cliente = new JFrame();
		
		Dimension Pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        ventana_menu.setSize(Pantalla.width, Pantalla.height);
        //ventana_cliente.setSize(Pantalla.width, Pantalla.height);
        
		
		//ventana_ingresarCliente.setSize();
        ventana_menu.setTitle("Menu");
		
		Ingresar cliente = new Ingresar();
		menuu menuComidas = new menuu();
		
		ventana_menu.add(menuComidas.getPanel());
		//ventana_cliente.add(cliente.getPanel());
	
		ventana_menu.setVisible(true);
		//ventana_cliente.setVisible(a);
		
		
		
		
		
		
		

	}

}