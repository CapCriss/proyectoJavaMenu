/* Desarrollado por: 
- Christopher Alejandro Moyano Delgado
-Cristian Andrés Riquelme González
-Matias Ulloa Toro
*/
package proyectomati;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class menuu extends JFrame{
	//panel
	public JPanel panel2;

	//Jlist
	public JList menu;
	
	//botones
	public JButton b_ensalada1;
	public JButton b_ensalada2;
	public JButton b_ensalada3;
	public JButton b_ensalada4;
	
	public JButton b_acompaniamiento1;
	public JButton b_acompaniamiento2;
	public JButton b_acompaniamiento3;
	public JButton b_acompaniamiento4;
	
	public JButton b_postre1;
	public JButton b_postre2;
	
	public JButton b_jugo1;
	public JButton b_jugo2;
	public JButton b_jugo3;
	
        
	public JButton b_eliminarproducto;
	public JButton b_pagar;
	public JButton b_historial;
                  
	
	//etiquetas
	
	public JLabel preciofinaltexto;
	public JLabel preciofinalnumeros;
	
	public JLabel ensaladas;
	public JLabel acompaniamientos;
	public JLabel postres;
	public JLabel jugos;
	
	public JLabel precioEnsalada1;
	public JLabel precioEnsalada2;
	public JLabel precioEnsalada3;
	public JLabel precioEnsalada4;
	
	public JLabel precioAcompaniamiento1;
	public JLabel precioAcompaniamiento2;
	public JLabel precioAcompaniamiento3;
	public JLabel precioAcompaniamiento4;
	
	public JLabel precioPostre1;
	public JLabel precioPostre2;
	
	public JLabel precioJugo1;
	public JLabel precioJugo2;
	public JLabel precioJugo3;
	
	// Array
	List<Integer>totalarr = new ArrayList<>();
	
                   //Variables
                   public int sumatoriadeprecio=0;
	
	//Pantalla
                   Dimension Pantalla = Toolkit.getDefaultToolkit().getScreenSize();
                   
	
	public menuu() {
		panel2 = new JPanel();
		panel2.setLayout(null);
		
		//Lista de compra
		DefaultListModel<String> listamenu = new DefaultListModel<>();  
		JList<String> menu = new JList<>(listamenu);  
		menu.setBounds(850, 50, 390, 480);
		ArrayList<String> MenuArray = new ArrayList<String>();
		
		//contador para total de precio (inicializado en 0)
		
		
		//Etiqueta "Precio total"
		
		preciofinaltexto=new JLabel("TOTAL:");
		preciofinaltexto.setBounds(850, 550, 180, 70);
		
		//precio final en numeros
		preciofinalnumeros=new JLabel();
		preciofinalnumeros.setText("$"+sumatoriadeprecio);
		preciofinalnumeros.setBounds(1210, 550, 180, 70);
		
		//Boton eliminar producto
		
		b_eliminarproducto = new JButton("Eliminar Producto");
		b_eliminarproducto.setBounds(850, 600, 180, 70);
		
		//Boton Pagar
		
		b_pagar=new JButton("Terminar compra");
		b_pagar.setBounds(1070, 600, 180, 70);
		
                                    //boton Historial
                                    b_historial = new JButton("Historial de clientes");
                                    b_historial.setBounds(630,600,180,70);
		//>>ENSALADAS
		ensaladas = new JLabel("Ensaladas:");
		ensaladas.setBounds(10, 20, 100, 25);
		
		b_ensalada1 = new JButton();
		b_ensalada1.setBounds(50, 50, 90, 80);
		ImageIcon ensalada1 = new ImageIcon(getClass().getResource("/imagenes/Magic salad.jpeg"));
		b_ensalada1.setIcon(new ImageIcon(ensalada1.getImage().getScaledInstance(b_ensalada1.getWidth(), b_ensalada1.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada1.setToolTipText("Magic Salad: M�gico y ex�tico sabor pollo teriyaki. Elige tu base + Pollo Teriyaki + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil");
		
		precioEnsalada1 = new JLabel("Magic salad $4.300");
		precioEnsalada1.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada1.setBounds(50, 112, 200, 50);
		
		b_ensalada2 = new JButton();
		b_ensalada2.setBounds(150, 50, 90, 80);
		ImageIcon ensalada2 = new ImageIcon(getClass().getResource("/imagenes/Power salad.jpeg"));
		b_ensalada2.setIcon(new ImageIcon(ensalada2.getImage().getScaledInstance(b_ensalada2.getWidth(), b_ensalada2.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada2.setToolTipText("Power Salad: Poderosa y con toda la energ�a del at�n para tu vida fitness. Elige tu base + Lomito de At�n + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil.");
		
		precioEnsalada2 = new JLabel("Power salad $4.300");
		precioEnsalada2.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada2.setBounds(150, 112, 200, 50);
		
		
		b_ensalada3 = new JButton();
		b_ensalada3.setBounds(50, 150, 90, 80);
		ImageIcon ensalada3 = new ImageIcon(getClass().getResource("/imagenes/Peace love salad.jpeg"));
		b_ensalada3.setIcon(new ImageIcon(ensalada3.getImage().getScaledInstance(b_ensalada3.getWidth(), b_ensalada3.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada3.setToolTipText("Peace love salad: Naturalmente vegana con nuestros deliciosos Falafel al estilo Maskisalad. Elige tu base + 2 Falafel + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil.");
		
		precioEnsalada3 = new JLabel("Peace love salad $4.300");
		precioEnsalada3.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada3.setBounds(25, 212, 200, 50);
		
		b_ensalada4 = new JButton();
		b_ensalada4.setBounds(150, 150, 90, 80);
		ImageIcon ensalada4 = new ImageIcon(getClass().getResource("/imagenes/Kombi salad.jpeg"));
		b_ensalada4.setIcon(new ImageIcon(ensalada4.getImage().getScaledInstance(b_ensalada4.getWidth(), b_ensalada4.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada4.setToolTipText("Kombi salad: Exquisita combinaci�n de camarones y cubos de kanikama. Elige tu base + Mix de camarones y cubos de Kanikama + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil.");
		
		precioEnsalada4 = new JLabel("Kombi salad $4.500");
		precioEnsalada4.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada4.setBounds(150, 212, 200, 50);
		
		//>>ACOMPA�AMIENTOS
		acompaniamientos = new JLabel("Acompaniamientos:");
		acompaniamientos.setBounds(10, 250, 120, 25);
		
		b_acompaniamiento1 = new JButton();
		b_acompaniamiento1.setBounds(50, 280, 90, 80);
		ImageIcon acompaniamiento1 =new ImageIcon(getClass().getResource("/imagenes/Falafel 6 unidades.jpeg"));
		b_acompaniamiento1.setIcon(new ImageIcon(acompaniamiento1.getImage().getScaledInstance(b_acompaniamiento1.getWidth(), b_acompaniamiento1.getHeight(), Image.SCALE_SMOOTH)));
		b_acompaniamiento1.setToolTipText("Falafel 6 unidades: Disfruta de 6 unidades exquisito falafel frito.");
		
		precioAcompaniamiento1 = new JLabel("Falafel 6 Un. $2.700");
		precioAcompaniamiento1.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompaniamiento1.setBounds(45, 342, 200, 50);
		
		
		b_acompaniamiento2 = new JButton();
		b_acompaniamiento2.setBounds(150, 280, 90, 80);
		ImageIcon acompaniamiento2 =new ImageIcon(getClass().getResource("/imagenes/Mayo verde vegana.jpeg"));
		b_acompaniamiento2.setIcon(new ImageIcon(acompaniamiento2.getImage().getScaledInstance(b_acompaniamiento2.getWidth(), b_acompaniamiento2.getHeight(), Image.SCALE_SMOOTH)));
		b_acompaniamiento2.setToolTipText("Mayo verde vegana: Mayonesa verde y vegana. Plant based. Ideal para acompa�ar tu Salad o Falafels. 100 gramos");
		
		precioAcompaniamiento2 = new JLabel("Mayo verde vegana $890");
		precioAcompaniamiento2.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompaniamiento2.setBounds(150, 342, 200, 50);
		
		b_acompaniamiento3 = new JButton();
		b_acompaniamiento3.setBounds(50, 380, 90, 80);
		ImageIcon acompaniamiento3 = new ImageIcon(getClass().getResource("/imagenes/Salsa extra.jpeg"));
		b_acompaniamiento3.setIcon(new ImageIcon(acompaniamiento3.getImage().getScaledInstance(b_acompaniamiento3.getWidth(), b_acompaniamiento3.getHeight(), Image.SCALE_SMOOTH)));
		b_acompaniamiento3.setToolTipText("Salsa extra: Elige tu salsa adicional =) La Mayo verde vegana puedes comprarla directamente como un acompa�amiento extra.");
		
		precioAcompaniamiento3 = new JLabel("Salsa extra $350");
		precioAcompaniamiento3.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompaniamiento3.setBounds(50, 442, 200, 50);
		
		b_acompaniamiento4 = new JButton();
		b_acompaniamiento4.setBounds(150, 380, 90, 80);
		ImageIcon acompaniamiento4 =new ImageIcon(getClass().getResource("/imagenes/Huevo duro.jpeg"));
		b_acompaniamiento4.setIcon(new ImageIcon(acompaniamiento4.getImage().getScaledInstance(b_acompaniamiento4.getWidth(), b_acompaniamiento4.getHeight(), Image.SCALE_SMOOTH)));
		b_acompaniamiento4.setToolTipText("Huevo duro: Aprovecha de a�adirle prote�na con un huevito duro a tu ensalada de siempre.");
		
		precioAcompaniamiento4 = new JLabel("Huevo duro $350");
		precioAcompaniamiento4.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompaniamiento4.setBounds(150, 442, 200, 50);
		
		
		//>>POSTRES
		postres = new JLabel("Postres:");
		postres.setBounds(300, 20, 100, 25);
		
		b_postre1 = new JButton();
		b_postre1.setBounds(340, 50, 90, 80);
		ImageIcon postre1 = new ImageIcon(getClass().getResource("/imagenes/2 Prestigio + 1 Snicker (Vegano).jpeg"));
		b_postre1.setIcon(new ImageIcon(postre1.getImage().getScaledInstance(b_postre1.getWidth(), b_postre1.getHeight(), Image.SCALE_SMOOTH)));
		b_postre1.setToolTipText("2 Prestigio + 1 Snicker (Vegano): SIN AZ�CAR =) Exquisito surtido con mini dulces caseros: 2 Prestigios + 1 Snicker Productos saludables, sin l�cteos y sin gluten. 20 grs c/u.");
		
		precioPostre1 = new JLabel("2Prestigio + 1Snicker $1.900");
		precioPostre1.setFont(new Font("arial",Font.PLAIN,11));
		precioPostre1.setBounds(295, 112, 200, 50);
		
		
		b_postre2 = new JButton();
		b_postre2.setBounds(440, 50, 90, 80);
		ImageIcon postre2 = new ImageIcon(getClass().getResource("/imagenes/Pie de limón.jpeg"));
		b_postre2.setIcon(new ImageIcon(postre2.getImage().getScaledInstance(b_postre2.getWidth(), b_postre2.getHeight(), Image.SCALE_SMOOTH)));
		b_postre2.setToolTipText("Pie de limón: Pie de limón");
		
		precioPostre2 = new JLabel("Pie de limón $6.990");
		precioPostre2.setFont(new Font("arial",Font.PLAIN,11));
		precioPostre2.setBounds(440, 112, 200, 50);
		
		
		
		//>>JUGOS 
		jugos = new JLabel("Jugos:");
		jugos.setBounds(300, 250, 100, 25);
		

		b_jugo1 = new JButton();
		b_jugo1.setBounds(340, 280, 90, 80);
		ImageIcon jugo1 =  new ImageIcon(getClass().getResource("/imagenes/Jugo de beterraga, zanahoria, manzana y limón.jpg"));
		b_jugo1.setIcon(new ImageIcon(jugo1.getImage().getScaledInstance(b_jugo1.getWidth(), b_jugo1.getHeight(), Image.SCALE_SMOOTH)));
		b_jugo1.setToolTipText("Jugo de Betarraga, Zanahoria, Manzana y Lim�n: Jugo 100% Natural de 300 ml. 0% az�car a�adida! Formulado con verduras provenientes de nuestra tierra que aportan todo lo necesario para seguir nuestro d�a lleno de energ�a.");
		
		precioJugo1 = new JLabel("Jugo Campestre $2.200");
		precioJugo1.setFont(new Font("arial",Font.PLAIN,11));
		precioJugo1.setBounds(310, 342, 200, 50);
		
		
		b_jugo2 = new JButton();
		b_jugo2.setBounds(440, 280, 90, 80);
		ImageIcon jugo2 = new ImageIcon(getClass().getResource("/imagenes/Jugo exprimido de Naranja.jpeg"));
		b_jugo2.setIcon(new ImageIcon(jugo2.getImage().getScaledInstance(b_jugo2.getWidth(), b_jugo2.getHeight(), Image.SCALE_SMOOTH)));
		b_jugo2.setToolTipText("Jugo exprimido de Naranja: Clásico jugo exprimido 100% naranja de calidad superior. 0% Azúcar añadida.");
		
		precioJugo2 = new JLabel("Jugo de Naranja $2.200");
		precioJugo2.setFont(new Font("arial",Font.PLAIN,11));
		precioJugo2.setBounds(440, 342, 200, 50);
		
		
		b_jugo3 = new JButton();
		b_jugo3.setBounds(340, 380, 90, 80);
		ImageIcon jugo3 =new ImageIcon(getClass().getResource("/imagenes/Jugo de Pepino, Espirulina, Manzana, Piña y Jengibre.jpeg"));
		b_jugo3.setIcon(new ImageIcon(jugo3.getImage().getScaledInstance(b_jugo3.getWidth(), b_jugo3.getHeight(), Image.SCALE_SMOOTH)));
		b_jugo3.setToolTipText("Jugo de Pepino, Espirulina, Manzana, Pi�a y Jengibre: Delicioso jugo prensado 100% natural y con 0% de az�car a�adida.");
		precioJugo3 = new JLabel("Jugo tropical $2.200");
		precioJugo3.setFont(new Font("arial",Font.PLAIN,11));
		precioJugo3.setBounds(340, 442, 200, 50);
		
		//Funcion botones
		
		b_eliminarproducto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				int index = menu.getSelectedIndex();
				listamenu.remove(index);
				MenuArray.remove(index);
				sumatoriadeprecio-=totalarr.get(index);
                                                                           totalarr.remove(index);
                                                                          preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		
		b_ensalada1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Magic Salad(1)                                                                                      $4300");
				MenuArray.add("Magic Salad(1)");
                                                                           totalarr.add(4300);
                                                                           sumatoriadeprecio+=4300;
                                                                           preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_ensalada2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Power Salad(1)                                                                                     $4300");
				MenuArray.add("Power Salad(1)");
				totalarr.add(4300);
                                                                          sumatoriadeprecio+=4300;
                                                                          preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_ensalada3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Peace love Salad(1)                                                                            $4300");
				MenuArray.add("Peace love salad (1)");
				totalarr.add(4300);
                                                                           sumatoriadeprecio+=4300;
                                                                           preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_ensalada4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Kombi Salad(1)                                                                                     $4500");
				MenuArray.add("Kombi Salad(1)");
				totalarr.add(4500);
                                                                           sumatoriadeprecio+=4500;
                                                                           preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_acompaniamiento1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Falafel 6 Un.(1)                                                                                      $2700");
				MenuArray.add("Falafel 6 Un.(1)");
				totalarr.add(2700);
                                                                           sumatoriadeprecio+=2700;
                                                                           preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_acompaniamiento2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Mayo verde vegana(1)                                                                         $890");
				MenuArray.add("Mayo verde vegana(1)");
                                                                           totalarr.add(890);
                                                                           sumatoriadeprecio+=890;
                                                                           preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_acompaniamiento3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Salsa extra(1)                                                                                        $350");
				MenuArray.add("Salsa extra(1)");
				totalarr.add(350);
                                                                          sumatoriadeprecio+=350;
                                                                          preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_acompaniamiento4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Huevo duro(1)                                                                                       $350");
				MenuArray.add("Huevo duro(1)");
				totalarr.add(350);
                                                                          sumatoriadeprecio+=350;
                                                                          preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_postre1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("2Prestigio + 1Snicker(1)                                                                      $1900");
				MenuArray.add("2Prestigio + 1Snicker(1)");
				totalarr.add(1900);
                                                                           sumatoriadeprecio+=1900;
                                                                           preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_postre2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Pie de lim�n(1)                                                                                      $6900");
				MenuArray.add("Pie de lim�n(1)");
				totalarr.add(6900);
                                                                          sumatoriadeprecio+=6900;
                                                                          preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_jugo1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Jugo Campestre(1)                                                                              $2200");
				MenuArray.add("Jugo Campestre(1)");
				totalarr.add(2200);
                                                                           sumatoriadeprecio+=2200;
                                                                           preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_jugo2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Jugo de naranja(1)                                                                               $2200");
				MenuArray.add("Jugo de naranja(1)");
				totalarr.add(2200);
                                                                           sumatoriadeprecio+=2200;
                                                                           preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
		
		b_jugo3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Jugo tropical(1)                                                                                    $2200");
				MenuArray.add("Jugo tropical(1)");
				totalarr.add(2200);
                                                                           sumatoriadeprecio+=2200;
                                                                           preciofinalnumeros.setText("$"+sumatoriadeprecio);
			}
		});
                                     b_pagar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
                                                                 if(sumatoriadeprecio<=0)
                                                                 {
                                                                     JOptionPane.showMessageDialog(null, "Ingrese algún producto");
                                                                 }else
                                                                 {
                                                                    Cliente ventanaCliente = new Cliente(sumatoriadeprecio);
                                                                    ventanaCliente.setSize(Pantalla.width/2,Pantalla.height/2);
                                                                    ventanaCliente.setLocationRelativeTo(null);
                                                                    ventanaCliente.setTitle("Ingresar Cliente");  
                                                                    ventanaCliente.setVisible(true); 
                                                                     dispose();
                                                                 }
                                                                  
			}
		});
                                     b_historial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
			Historial ventanaHistorial = new Historial();
                                                        ventanaHistorial.setSize(Pantalla.width/2,Pantalla.height/2);
                                                        ventanaHistorial.setLocationRelativeTo(null);
                                                        ventanaHistorial.setTitle("Historial de clientes");
                                                        ventanaHistorial.setVisible(true);
			}
		});
		
		
		panel2.add(menu);
		panel2.add(b_eliminarproducto);
		panel2.add(b_pagar);
		panel2.add(preciofinaltexto);
		panel2.add(preciofinalnumeros);
		
		panel2.add(ensaladas);
		panel2.add(b_ensalada1);
		panel2.add(b_ensalada2);
		panel2.add(b_ensalada3);
		panel2.add(b_ensalada4);
		
		panel2.add(acompaniamientos);
		panel2.add(b_acompaniamiento1);
		panel2.add(b_acompaniamiento2);
		panel2.add(b_acompaniamiento3);
		panel2.add(b_acompaniamiento4);
		
		panel2.add(postres);
		panel2.add(b_postre1);
		panel2.add(b_postre2);
		
		panel2.add(jugos);
		panel2.add(b_jugo1);
		panel2.add(b_jugo2);
		panel2.add(b_jugo3);
		
		panel2.add(precioEnsalada1);
		panel2.add(precioEnsalada2);
		panel2.add(precioEnsalada3);
		panel2.add(precioEnsalada4);
		
		panel2.add(precioAcompaniamiento1);
		panel2.add(precioAcompaniamiento2);
		panel2.add(precioAcompaniamiento3);
		panel2.add(precioAcompaniamiento4);
		
		panel2.add(precioPostre1);
		panel2.add(precioPostre2);
		
		panel2.add(precioJugo1);
		panel2.add(precioJugo2);
		panel2.add(precioJugo3);
                                      panel2.add(b_historial);
                
                                     add(panel2);
	}
        
	public JPanel getPanel() {
		return panel2;
	}
                  
                   public static void main(String[] args) {
    
		Dimension Pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		menuu menuComidas = new menuu();
                                      menuComidas.setSize(Pantalla.width,Pantalla.height);
                                      menuComidas.setTitle("Menu");
                                     menuComidas.setVisible(true);
                                    
		                               
	}

}