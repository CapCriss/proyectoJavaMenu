import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class menu {
	//panel
	public JPanel panel2;
	
	//botones
	public JButton b_ensalada1;
	public JButton b_ensalada2;
	public JButton b_ensalada3;
	public JButton b_ensalada4;
	
	public JButton b_acompa�amiento1;
	public JButton b_acompa�amiento2;
	public JButton b_acompa�amiento3;
	public JButton b_acompa�amiento4;
	
	public JButton b_postre1;
	public JButton b_postre2;
	
	public JButton b_jugo1;
	public JButton b_jugo2;
	public JButton b_jugo3;
	
	//etiquetas
	public JLabel ensaladas;
	public JLabel acompa�amientos;
	public JLabel postres;
	public JLabel jugos;
	
	public JLabel precioEnsalada1;
	public JLabel precioEnsalada2;
	public JLabel precioEnsalada3;
	public JLabel precioEnsalada4;
	
	public JLabel precioAcompa�amiento1;
	public JLabel precioAcompa�amiento2;
	public JLabel precioAcompa�amiento3;
	public JLabel precioAcompa�amiento4;
	
	public JLabel precioPostre1;
	public JLabel precioPostre2;
	
	public JLabel precioJugo1;
	public JLabel precioJugo2;
	public JLabel precioJugo3;
	
	
	
	
	
	
	
	public menu() {
		panel2 = new JPanel();
		panel2.setLayout(null);
		
		//>>ENSALADAS
		ensaladas = new JLabel("Ensaladas:");
		ensaladas.setBounds(10, 20, 100, 25);
		
		b_ensalada1 = new JButton();
		b_ensalada1.setBounds(50, 50, 90, 80);
		ImageIcon ensalada1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Magic salad.jpeg");
		b_ensalada1.setIcon(new ImageIcon(ensalada1.getImage().getScaledInstance(b_ensalada1.getWidth(), b_ensalada1.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada1.setToolTipText("Magic Salad: M�gico y ex�tico sabor pollo teriyaki. Elige tu base + Pollo Teriyaki + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil");
		
		precioEnsalada1 = new JLabel("Magic salad $4.300");
		precioEnsalada1.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada1.setBounds(50, 112, 200, 50);
		
		b_ensalada2 = new JButton();
		b_ensalada2.setBounds(150, 50, 90, 80);
		ImageIcon ensalada2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Power salad.jpeg");
		b_ensalada2.setIcon(new ImageIcon(ensalada2.getImage().getScaledInstance(b_ensalada2.getWidth(), b_ensalada2.getHeight(), Image.SCALE_SMOOTH)));
		b_ensalada2.setToolTipText("Power Salad: Poderosa y con toda la energ�a del at�n para tu vida fitness. Elige tu base + Lomito de At�n + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil.");
		
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
		b_ensalada4.setToolTipText("Kombi salad: Exquisita combinaci�n de camarones y cubos de kanikama. Elige tu base + Mix de camarones y cubos de Kanikama + Apio + Lechuga + Zanahoria + Repollo morado + Choclo + Perejil.");
		
		precioEnsalada4 = new JLabel("Kombi salad $4.500");
		precioEnsalada4.setFont(new Font("arial",Font.PLAIN,11));
		precioEnsalada4.setBounds(150, 212, 200, 50);
		
		
		
		//>>ACOMPA�AMIENTOS
		acompa�amientos = new JLabel("Acompa�amientos:");
		acompa�amientos.setBounds(10, 250, 120, 25);
		
		b_acompa�amiento1 = new JButton();
		b_acompa�amiento1.setBounds(50, 280, 90, 80);
		ImageIcon acompa�amiento1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Falafel 6 unidades.jpeg");
		b_acompa�amiento1.setIcon(new ImageIcon(acompa�amiento1.getImage().getScaledInstance(b_acompa�amiento1.getWidth(), b_acompa�amiento1.getHeight(), Image.SCALE_SMOOTH)));
		b_acompa�amiento1.setToolTipText("Falafel 6 unidades: Disfruta de 6 unidades exquisito falafel frito.");
		
		precioAcompa�amiento1 = new JLabel("Falafel 6 Un. $2.700");
		precioAcompa�amiento1.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompa�amiento1.setBounds(45, 342, 200, 50);
		
		
		b_acompa�amiento2 = new JButton();
		b_acompa�amiento2.setBounds(150, 280, 90, 80);
		ImageIcon acompa�amiento2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Mayo verde vegana.jpeg");
		b_acompa�amiento2.setIcon(new ImageIcon(acompa�amiento2.getImage().getScaledInstance(b_acompa�amiento2.getWidth(), b_acompa�amiento2.getHeight(), Image.SCALE_SMOOTH)));
		b_acompa�amiento2.setToolTipText("Mayo verde vegana: Mayonesa verde y vegana. Plant based. Ideal para acompa�ar tu Salad o Falafels. 100 gramos");
		
		precioAcompa�amiento2 = new JLabel("Mayo verde vegana $890");
		precioAcompa�amiento2.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompa�amiento2.setBounds(150, 342, 200, 50);
		
		b_acompa�amiento3 = new JButton();
		b_acompa�amiento3.setBounds(50, 380, 90, 80);
		ImageIcon acompa�amiento3 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Salsa extra.jpeg");
		b_acompa�amiento3.setIcon(new ImageIcon(acompa�amiento3.getImage().getScaledInstance(b_acompa�amiento3.getWidth(), b_acompa�amiento3.getHeight(), Image.SCALE_SMOOTH)));
		b_acompa�amiento3.setToolTipText("Salsa extra: Elige tu salsa adicional =) La Mayo verde vegana puedes comprarla directamente como un acompa�amiento extra.");
		
		precioAcompa�amiento3 = new JLabel("Salsa extra $350");
		precioAcompa�amiento3.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompa�amiento3.setBounds(50, 442, 200, 50);
		
		b_acompa�amiento4 = new JButton();
		b_acompa�amiento4.setBounds(150, 380, 90, 80);
		ImageIcon acompa�amiento4 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Huevo duro.jpeg");
		b_acompa�amiento4.setIcon(new ImageIcon(acompa�amiento4.getImage().getScaledInstance(b_acompa�amiento4.getWidth(), b_acompa�amiento4.getHeight(), Image.SCALE_SMOOTH)));
		b_acompa�amiento4.setToolTipText("Huevo duro: Aprovecha de a�adirle prote�na con un huevito duro a tu ensalada de siempre.");
		
		precioAcompa�amiento4 = new JLabel("Huevo duro $350");
		precioAcompa�amiento4.setFont(new Font("arial",Font.PLAIN,11));
		precioAcompa�amiento4.setBounds(150, 442, 200, 50);
		
		
		//>>POSTRES
		postres = new JLabel("Postres:");
		postres.setBounds(300, 20, 100, 25);
		
		b_postre1 = new JButton();
		b_postre1.setBounds(340, 50, 90, 80);
		ImageIcon postre1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/2 Prestigio + 1 Snicker (Vegano).jpeg");
		b_postre1.setIcon(new ImageIcon(postre1.getImage().getScaledInstance(b_postre1.getWidth(), b_postre1.getHeight(), Image.SCALE_SMOOTH)));
		b_postre1.setToolTipText("2 Prestigio + 1 Snicker (Vegano): SIN AZ�CAR =) Exquisito surtido con mini dulces caseros: 2 Prestigios + 1 Snicker Productos saludables, sin l�cteos y sin gluten. 20 grs c/u.");
		
		precioPostre1 = new JLabel("2Prestigio + 1Snicker $1.900");
		precioPostre1.setFont(new Font("arial",Font.PLAIN,11));
		precioPostre1.setBounds(295, 112, 200, 50);
		
		
		b_postre2 = new JButton();
		b_postre2.setBounds(440, 50, 90, 80);
		ImageIcon postre2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Pie de lim�n.jpeg");
		b_postre2.setIcon(new ImageIcon(postre2.getImage().getScaledInstance(b_postre2.getWidth(), b_postre2.getHeight(), Image.SCALE_SMOOTH)));
		b_postre2.setToolTipText("Pie de lim�n: Pie de lim�n");
		
		precioPostre2 = new JLabel("Pie de lim�n $6.990");
		precioPostre2.setFont(new Font("arial",Font.PLAIN,11));
		precioPostre2.setBounds(440, 112, 200, 50);
		
		
		
		//>>JUGOS ##FALTA UNA IMAGEN DEL PROFE##
		jugos = new JLabel("Jugos:");
		jugos.setBounds(300, 250, 100, 25);
		

		b_jugo1 = new JButton();
		b_jugo1.setBounds(340, 280, 90, 80);
		ImageIcon jugo1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/a.jpeg");
		b_jugo1.setIcon(new ImageIcon(jugo1.getImage().getScaledInstance(b_jugo1.getWidth(), b_jugo1.getHeight(), Image.SCALE_SMOOTH)));
		b_jugo1.setToolTipText("Jugo de Betarraga, Zanahoria, Manzana y Lim�n: Jugo 100% Natural de 300 ml. 0% az�car a�adida! Formulado con verduras provenientes de nuestra tierra que aportan todo lo necesario para seguir nuestro d�a lleno de energ�a.");
		
		precioJugo1 = new JLabel("Jugo Betarraga ... $2.200");
		precioJugo1.setFont(new Font("arial",Font.PLAIN,11));
		precioJugo1.setBounds(310, 342, 200, 50);
		
		
		b_jugo2 = new JButton();
		b_jugo2.setBounds(440, 280, 90, 80);
		ImageIcon jugo2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Jugo exprimido de Naranja.jpeg");
		b_jugo2.setIcon(new ImageIcon(jugo2.getImage().getScaledInstance(b_jugo2.getWidth(), b_jugo2.getHeight(), Image.SCALE_SMOOTH)));
		b_jugo2.setToolTipText("Jugo exprimido de Naranja: Cl�sico jugo exprimido 100% naranja de calidad superior. 0% Az�car a�adida.");
		
		precioJugo2 = new JLabel("Jugo de Naranja $2.200");
		precioJugo2.setFont(new Font("arial",Font.PLAIN,11));
		precioJugo2.setBounds(440, 342, 200, 50);
		
		
		b_jugo3 = new JButton();
		b_jugo3.setBounds(340, 380, 90, 80);
		ImageIcon jugo3 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Jugo de Pepino, Espirulina, Manzana, Pi�a y Jengibre.jpeg");
		b_jugo3.setIcon(new ImageIcon(jugo3.getImage().getScaledInstance(b_jugo3.getWidth(), b_jugo3.getHeight(), Image.SCALE_SMOOTH)));
		b_jugo3.setToolTipText("Jugo de Pepino, Espirulina, Manzana, Pi�a y Jengibre: Delicioso jugo prensado 100% natural y con 0% de az�car a�adida.");
		precioJugo3 = new JLabel("Jugo Pepino ... $2.200");
		precioJugo3.setFont(new Font("arial",Font.PLAIN,11));
		precioJugo3.setBounds(340, 442, 200, 50);
		
		
		
		
		panel2.add(ensaladas);
		panel2.add(b_ensalada1);
		panel2.add(b_ensalada2);
		panel2.add(b_ensalada3);
		panel2.add(b_ensalada4);
		
		panel2.add(acompa�amientos);
		panel2.add(b_acompa�amiento1);
		panel2.add(b_acompa�amiento2);
		panel2.add(b_acompa�amiento3);
		panel2.add(b_acompa�amiento4);
		
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
		
		panel2.add(precioAcompa�amiento1);
		panel2.add(precioAcompa�amiento2);
		panel2.add(precioAcompa�amiento3);
		panel2.add(precioAcompa�amiento4);
		
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
