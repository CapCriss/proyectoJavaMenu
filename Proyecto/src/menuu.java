import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;
import java.util.*;
import java.util.stream.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class menuu {
	//panel
	public JPanel panel2;

	//Jlist
	public JList menu;
	
	//botones
	public JButton b_ensalada1;
	public JButton b_ensalada2;
	public JButton b_ensalada3;
	public JButton b_ensalada4;
	
	public JButton b_acompañamiento1;
	public JButton b_acompañamiento2;
	public JButton b_acompañamiento3;
	public JButton b_acompañamiento4;
	
	public JButton b_postre1;
	public JButton b_postre2;
	
	public JButton b_jugo1;
	public JButton b_jugo2;
	public JButton b_jugo3;
	
	public JButton nuevocliente;
	public JButton eliminarproducto;
	public JButton pagar;
	
	
	//etiquetas
	
	public JLabel preciofinaltexto;
	public JLabel preciofinalnumeros;
	
	public JLabel ensaladas;
	public JLabel acompañamientos;
	public JLabel postres;
	public JLabel jugos;
	
	public JLabel precioEnsalada1;
	public JLabel precioEnsalada2;
	public JLabel precioEnsalada3;
	public JLabel precioEnsalada4;
	
	public JLabel precioAcompañamiento1;
	public JLabel precioAcompañamiento2;
	public JLabel precioAcompañamiento3;
	public JLabel precioAcompañamiento4;
	
	public JLabel precioPostre1;
	public JLabel precioPostre2;
	
	public JLabel precioJugo1;
	public JLabel precioJugo2;
	public JLabel precioJugo3;
	
	
	
	
	
	
	
	public menuu() {
		panel2 = new JPanel();
		panel2.setLayout(null);
		
		//Lista de compra
		DefaultListModel<String> listamenu = new DefaultListModel<>();  
		JList<String> menu = new JList<>(listamenu);  
		menu.setBounds(850, 100, 400, 480);
		ArrayList<String> MenuArray = new ArrayList<String>();
		
		//contador para total de precio (inicializado en 0)
		int preciototal[]=new int [50];
		for(int i=0;i<preciototal.length;i++)
		{
				preciototal[i]=0;
		}
		int sumatoriadeprecio=0;
		
		
		//Etiqueta "Precio total"
		
		preciofinaltexto=new JLabel("TOTAL:");
		preciofinaltexto.setBounds(850, 550, 180, 70);
		
		//precio final en numeros
		String sumatoriadepreciotexto=Integer.toString(sumatoriadeprecio); 
		preciofinalnumeros=new JLabel();
		preciofinalnumeros.setText("$"+sumatoriadepreciotexto);
		preciofinalnumeros.setBounds(1210, 550, 180, 70);
		
		//Boton eliminar producto
		
		eliminarproducto = new JButton("Eliminar Producto");
		eliminarproducto.setBounds(850, 600, 180, 70);
		
		//Boton Pagar
		
		pagar=new JButton("Terminar compra");
		pagar.setBounds(1070, 600, 180, 70);
		
		//>>ENSALADAS
		ensaladas = new JLabel("Ensaladas:");
		ensaladas.setBounds(10, 20, 100, 25);
		
		b_ensalada1 = new JButton();
		b_ensalada1.setBounds(50, 50, 90, 80);
		ImageIcon ensalada1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Magic salad.jpeg");
		b_ensalada1.setIcon(new ImageIcon(ensalada1.getImage().getScaledInstance(b_ensalada1.getWidth(), b_ensalada1.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada1.setToolTipText("Magic Salad: Mágico y exótico sabor pollo teriyaki. Elige tu base + Pollo Teriyaki + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil");
		
		precioEnsalada1 = new JLabel("Magic salad $4.300");
		precioEnsalada1.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada1.setBounds(50, 112, 200, 50);
		
		b_ensalada2 = new JButton();
		b_ensalada2.setBounds(150, 50, 90, 80);
		ImageIcon ensalada2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Power salad.jpeg");
		b_ensalada2.setIcon(new ImageIcon(ensalada2.getImage().getScaledInstance(b_ensalada2.getWidth(), b_ensalada2.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada2.setToolTipText("Power Salad: Poderosa y con toda la energía del atún para tu vida fitness. Elige tu base + Lomito de Atún + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil.");
		
		precioEnsalada2 = new JLabel("Power salad $4.300");
		precioEnsalada2.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada2.setBounds(150, 112, 200, 50);
		
		
		b_ensalada3 = new JButton();
		b_ensalada3.setBounds(50, 150, 90, 80);
		ImageIcon ensalada3 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Peace love salad.jpeg");
		b_ensalada3.setIcon(new ImageIcon(ensalada3.getImage().getScaledInstance(b_ensalada3.getWidth(), b_ensalada3.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada3.setToolTipText("Peace love salad: Naturalmente vegana con nuestros deliciosos Falafel al estilo Maskisalad. Elige tu base + 2 Falafel + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil.");
		
		precioEnsalada3 = new JLabel("Peace love salad $4.300");
		precioEnsalada3.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada3.setBounds(25, 212, 200, 50);
		
		b_ensalada4 = new JButton();
		b_ensalada4.setBounds(150, 150, 90, 80);
		ImageIcon ensalada4 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Kombi salad.jpeg");
		b_ensalada4.setIcon(new ImageIcon(ensalada4.getImage().getScaledInstance(b_ensalada4.getWidth(), b_ensalada4.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada4.setToolTipText("Kombi salad: Exquisita combinación de camarones y cubos de kanikama. Elige tu base + Mix de camarones y cubos de Kanikama + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil.");
		
		precioEnsalada4 = new JLabel("Kombi salad $4.500");
		precioEnsalada4.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada4.setBounds(150, 212, 200, 50);
		
		
		
		//>>ACOMPAÑAMIENTOS
		acompañamientos = new JLabel("Acompañamientos:");
		acompañamientos.setBounds(10, 250, 120, 25);
		
		b_acompañamiento1 = new JButton();
		b_acompañamiento1.setBounds(50, 280, 90, 80);
		ImageIcon acompañamiento1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Falafel 6 unidades.jpeg");
		b_acompañamiento1.setIcon(new ImageIcon(acompañamiento1.getImage().getScaledInstance(b_acompañamiento1.getWidth(), b_acompañamiento1.getHeight(), Image.SCALE_SMOOTH)));
		b_acompañamiento1.setToolTipText("Falafel 6 unidades: Disfruta de 6 unidades exquisito falafel frito.");
		
		precioAcompañamiento1 = new JLabel("Falafel 6 Un. $2.700");
		precioAcompañamiento1.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompañamiento1.setBounds(45, 342, 200, 50);
		
		
		b_acompañamiento2 = new JButton();
		b_acompañamiento2.setBounds(150, 280, 90, 80);
		ImageIcon acompañamiento2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Mayo verde vegana.jpeg");
		b_acompañamiento2.setIcon(new ImageIcon(acompañamiento2.getImage().getScaledInstance(b_acompañamiento2.getWidth(), b_acompañamiento2.getHeight(), Image.SCALE_SMOOTH)));
		b_acompañamiento2.setToolTipText("Mayo verde vegana: Mayonesa verde y vegana. Plant based. Ideal para acompañar tu Salad o Falafels. 100 gramos");
		
		precioAcompañamiento2 = new JLabel("Mayo verde vegana $890");
		precioAcompañamiento2.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompañamiento2.setBounds(150, 342, 200, 50);
		
		b_acompañamiento3 = new JButton();
		b_acompañamiento3.setBounds(50, 380, 90, 80);
		ImageIcon acompañamiento3 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Salsa extra.jpeg");
		b_acompañamiento3.setIcon(new ImageIcon(acompañamiento3.getImage().getScaledInstance(b_acompañamiento3.getWidth(), b_acompañamiento3.getHeight(), Image.SCALE_SMOOTH)));
		b_acompañamiento3.setToolTipText("Salsa extra: Elige tu salsa adicional =) La Mayo verde vegana puedes comprarla directamente como un acompañamiento extra.");
		
		precioAcompañamiento3 = new JLabel("Salsa extra $350");
		precioAcompañamiento3.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompañamiento3.setBounds(50, 442, 200, 50);
		
		b_acompañamiento4 = new JButton();
		b_acompañamiento4.setBounds(150, 380, 90, 80);
		ImageIcon acompañamiento4 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Huevo duro.jpeg");
		b_acompañamiento4.setIcon(new ImageIcon(acompañamiento4.getImage().getScaledInstance(b_acompañamiento4.getWidth(), b_acompañamiento4.getHeight(), Image.SCALE_SMOOTH)));
		b_acompañamiento4.setToolTipText("Huevo duro: Aprovecha de añadirle proteína con un huevito duro a tu ensalada de siempre.");
		
		precioAcompañamiento4 = new JLabel("Huevo duro $350");
		precioAcompañamiento4.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompañamiento4.setBounds(150, 442, 200, 50);
		
		
		//>>POSTRES
		postres = new JLabel("Postres:");
		postres.setBounds(300, 20, 100, 25);
		
		b_postre1 = new JButton();
		b_postre1.setBounds(340, 50, 90, 80);
		ImageIcon postre1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/2 Prestigio + 1 Snicker (Vegano).jpeg");
		b_postre1.setIcon(new ImageIcon(postre1.getImage().getScaledInstance(b_postre1.getWidth(), b_postre1.getHeight(), Image.SCALE_SMOOTH)));
		b_postre1.setToolTipText("2 Prestigio + 1 Snicker (Vegano): SIN AZÚCAR =) Exquisito surtido con mini dulces caseros: 2 Prestigios + 1 Snicker Productos saludables, sin lácteos y sin gluten. 20 grs c/u.");
		
		precioPostre1 = new JLabel("2Prestigio + 1Snicker $1.900");
		precioPostre1.setFont(new Font("arial",Font.PLAIN,11));
		precioPostre1.setBounds(295, 112, 200, 50);
		
		
		b_postre2 = new JButton();
		b_postre2.setBounds(440, 50, 90, 80);
		ImageIcon postre2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Pie de limón.jpeg");
		b_postre2.setIcon(new ImageIcon(postre2.getImage().getScaledInstance(b_postre2.getWidth(), b_postre2.getHeight(), Image.SCALE_SMOOTH)));
		b_postre2.setToolTipText("Pie de limón: Pie de limón");
		
		precioPostre2 = new JLabel("Pie de limón $6.990");
		precioPostre2.setFont(new Font("arial",Font.PLAIN,11));
		precioPostre2.setBounds(440, 112, 200, 50);
		
		
		
		//>>JUGOS ##FALTA UNA IMAGEN DEL PROFE##
		jugos = new JLabel("Jugos:");
		jugos.setBounds(300, 250, 100, 25);
		

		b_jugo1 = new JButton();
		b_jugo1.setBounds(340, 280, 90, 80);
		ImageIcon jugo1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/a.jpeg");
		b_jugo1.setIcon(new ImageIcon(jugo1.getImage().getScaledInstance(b_jugo1.getWidth(), b_jugo1.getHeight(), Image.SCALE_SMOOTH)));
		b_jugo1.setToolTipText("Jugo de Betarraga, Zanahoria, Manzana y Limón: Jugo 100% Natural de 300 ml. 0% azúcar añadida! Formulado con verduras provenientes de nuestra tierra que aportan todo lo necesario para seguir nuestro día lleno de energía.");
		
		precioJugo1 = new JLabel("Jugo Campestre $2.200");
		precioJugo1.setFont(new Font("arial",Font.PLAIN,11));
		precioJugo1.setBounds(310, 342, 200, 50);
		
		
		b_jugo2 = new JButton();
		b_jugo2.setBounds(440, 280, 90, 80);
		ImageIcon jugo2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Jugo exprimido de Naranja.jpeg");
		b_jugo2.setIcon(new ImageIcon(jugo2.getImage().getScaledInstance(b_jugo2.getWidth(), b_jugo2.getHeight(), Image.SCALE_SMOOTH)));
		b_jugo2.setToolTipText("Jugo exprimido de Naranja: Clásico jugo exprimido 100% naranja de calidad superior. 0% Azúcar añadida.");
		
		precioJugo2 = new JLabel("Jugo de Naranja $2.200");
		precioJugo2.setFont(new Font("arial",Font.PLAIN,11));
		precioJugo2.setBounds(440, 342, 200, 50);
		
		
		b_jugo3 = new JButton();
		b_jugo3.setBounds(340, 380, 90, 80);
		ImageIcon jugo3 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Jugo de Pepino, Espirulina, Manzana, Piña y Jengibre.jpeg");
		b_jugo3.setIcon(new ImageIcon(jugo3.getImage().getScaledInstance(b_jugo3.getWidth(), b_jugo3.getHeight(), Image.SCALE_SMOOTH)));
		b_jugo3.setToolTipText("Jugo de Pepino, Espirulina, Manzana, Piña y Jengibre: Delicioso jugo prensado 100% natural y con 0% de azúcar añadida.");
		precioJugo3 = new JLabel("Jugo tropical $2.200");
		precioJugo3.setFont(new Font("arial",Font.PLAIN,11));
		precioJugo3.setBounds(340, 442, 200, 50);
		
		//Funcion botones
		
		eliminarproducto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				int index = menu.getSelectedIndex();
				listamenu.remove( index );
				MenuArray.remove(index);
				
			}
		});
		
		
		b_ensalada1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Magic Salad(1)                                                                                      $4300");
				MenuArray.add("Magic Salad(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=4300;
						break;}
				}
			}
		});
		
		b_ensalada2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Power Salad(1)                                                                                     $4300");
				MenuArray.add("Power Salad(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=4300;
						break;}
				}
			}
		});
		
		b_ensalada3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Peace love Salad(1)                                                                            $4300");
				MenuArray.add("Peace love salad (1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=4300;
						break;}
				}
			}
		});
		
		b_ensalada4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Kombi Salad(1)                                                                                     $4500");
				MenuArray.add("Kombi Salad(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=4500;
						break;}
				}
			}
		});
		
		b_acompañamiento1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Falafel 6 Un.(1)                                                                                      $2700");
				MenuArray.add("Falafel 6 Un.(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=2700;
						break;}
				}
			}
		});
		
		b_acompañamiento2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Mayo verde vegana(1)                                                                         $890");
				MenuArray.add("Mayo verde vegana(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=890;
						break;}
				}
			}
		});
		
		b_acompañamiento3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Salsa extra(1)                                                                                        $350");
				MenuArray.add("Salsa extra(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=350;
						break;}
				}
			}
		});
		
		b_acompañamiento4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Huevo duro(1)                                                                                       $350");
				MenuArray.add("Huevo duro(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=350;
						break;}
				}
			}
		});
		
		b_postre1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("2Prestigio + 1Snicker(1)                                                                      $1900");
				MenuArray.add("2Prestigio + 1Snicker(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=1900;
						break;}
				}
			}
		});
		
		b_postre2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Pie de limón(1)                                                                                      $6900");
				MenuArray.add("Pie de limón(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=6900;
						break;}
				}
			}
		});
		
		b_jugo1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Jugo Campestre(1)                                                                              $2200");
				MenuArray.add("Jugo Campestre(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=2200;
						break;}
				}
			}
		});
		
		b_jugo2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Jugo de naranja(1)                                                                               $2200");
				MenuArray.add("Jugo de naranja(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=2200;
						break;}
				}
			}
		});
		
		b_jugo3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				listamenu.addElement("Jugo tropical(1)                                                                                    $2200");
				MenuArray.add("Jugo tropical(1)");
				for(int i=0;i<preciototal.length;i++)
				{
					if(preciototal[i]<=0) {
						preciototal[i]=2200;
						break;}
				}
			}
		});
		
		
		panel2.add(menu);
		panel2.add(eliminarproducto);
		panel2.add(pagar);
		panel2.add(preciofinaltexto);
		panel2.add(preciofinalnumeros);
		
		panel2.add(ensaladas);
		panel2.add(b_ensalada1);
		panel2.add(b_ensalada2);
		panel2.add(b_ensalada3);
		panel2.add(b_ensalada4);
		
		panel2.add(acompañamientos);
		panel2.add(b_acompañamiento1);
		panel2.add(b_acompañamiento2);
		panel2.add(b_acompañamiento3);
		panel2.add(b_acompañamiento4);
		
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
		
		panel2.add(precioAcompañamiento1);
		panel2.add(precioAcompañamiento2);
		panel2.add(precioAcompañamiento3);
		panel2.add(precioAcompañamiento4);
		
		panel2.add(precioPostre1);
		panel2.add(precioPostre2);
		
		panel2.add(precioJugo1);
		panel2.add(precioJugo2);
		panel2.add(precioJugo3);
		
		
		
	}
	public JPanel getPanel() {
		return panel2;
	}

}