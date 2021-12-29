import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
public class main {

	public static void main(String[] args) {
		
		JFrame ventana_menu = new JFrame();
		
		Dimension Pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        ventana_menu.setSize(Pantalla.width, Pantalla.height);
        
		
		//ventana_ingresarCliente.setSize();
        ventana_menu.setTitle("Menu");
		
		ingresarCliente cliente = new ingresarCliente();
		menu menuComidas = new menu();
		
		ventana_menu.add(menuComidas.getPanel());
		//ventana_ingresarCliente.add(cliente.getPanel());
	
		ventana_menu.setVisible(true);
		
		
		
		
		

	}

}
