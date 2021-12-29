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
	
	public JButton b_acompañamiento1;
	public JButton b_acompañamiento2;
	public JButton b_acompañamiento3;
	public JButton b_acompañamiento4;
	
	public JButton b_postre1;
	public JButton b_postre2;
	
	public JButton b_jugo1;
	public JButton b_jugo2;
	public JButton b_jugo3;
	
	//etiquetas
	public JLabel ensaladas;
	public JLabel acompañamientos;
	public JLabel postres;
	public JLabel jugos;
	
	
	
	
	
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
		
		
		b_ensalada2 = new JButton();
		b_ensalada2.setBounds(150, 50, 90, 80);
		ImageIcon ensalada2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Power salad.jpeg");
		b_ensalada2.setIcon(new ImageIcon(ensalada2.getImage().getScaledInstance(b_ensalada2.getWidth(), b_ensalada2.getHeight(), Image.SCALE_SMOOTH)));
		
		b_ensalada3 = new JButton();
		b_ensalada3.setBounds(50, 150, 90, 80);
		ImageIcon ensalada3 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Peace love salad.jpeg");
		b_ensalada3.setIcon(new ImageIcon(ensalada3.getImage().getScaledInstance(b_ensalada3.getWidth(), b_ensalada3.getHeight(), Image.SCALE_SMOOTH)));
		
		b_ensalada4 = new JButton();
		b_ensalada4.setBounds(150, 150, 90, 80);
		ImageIcon ensalada4 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Kombi salad.jpeg");
		b_ensalada4.setIcon(new ImageIcon(ensalada4.getImage().getScaledInstance(b_ensalada4.getWidth(), b_ensalada4.getHeight(), Image.SCALE_SMOOTH)));
		
		
		//>>ACOMPAÑAMIENTOS
		acompañamientos = new JLabel("Acompañamientos:");
		acompañamientos.setBounds(10, 250, 120, 25);
		
		b_acompañamiento1 = new JButton();
		b_acompañamiento1.setBounds(50, 280, 90, 80);
		ImageIcon acompañamiento1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Falafel 6 unidades.jpeg");
		b_acompañamiento1.setIcon(new ImageIcon(acompañamiento1.getImage().getScaledInstance(b_acompañamiento1.getWidth(), b_acompañamiento1.getHeight(), Image.SCALE_SMOOTH)));
		
		b_acompañamiento2 = new JButton();
		b_acompañamiento2.setBounds(150, 280, 90, 80);
		ImageIcon acompañamiento2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Mayo verde vegana.jpeg");
		b_acompañamiento2.setIcon(new ImageIcon(acompañamiento2.getImage().getScaledInstance(b_acompañamiento2.getWidth(), b_acompañamiento2.getHeight(), Image.SCALE_SMOOTH)));
		
		b_acompañamiento3 = new JButton();
		b_acompañamiento3.setBounds(50, 380, 90, 80);
		ImageIcon acompañamiento3 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Salsa extra.jpeg");
		b_acompañamiento3.setIcon(new ImageIcon(acompañamiento3.getImage().getScaledInstance(b_acompañamiento3.getWidth(), b_acompañamiento3.getHeight(), Image.SCALE_SMOOTH)));
		
		b_acompañamiento4 = new JButton();
		b_acompañamiento4.setBounds(150, 380, 90, 80);
		ImageIcon acompañamiento4 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Huevo duro.jpeg");
		b_acompañamiento4.setIcon(new ImageIcon(acompañamiento4.getImage().getScaledInstance(b_acompañamiento4.getWidth(), b_acompañamiento4.getHeight(), Image.SCALE_SMOOTH)));
		
		
		//>>POSTRES
		postres = new JLabel("Postres:");
		postres.setBounds(300, 20, 100, 25);
		
		b_postre1 = new JButton();
		b_postre1.setBounds(340, 50, 90, 80);
		ImageIcon postre1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/2 Prestigio + 1 Snicker (Vegano).jpeg");
		b_postre1.setIcon(new ImageIcon(postre1.getImage().getScaledInstance(b_postre1.getWidth(), b_postre1.getHeight(), Image.SCALE_SMOOTH)));
		
		b_postre2 = new JButton();
		b_postre2.setBounds(440, 50, 90, 80);
		ImageIcon postre2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Pie de limón.jpeg");
		b_postre2.setIcon(new ImageIcon(postre2.getImage().getScaledInstance(b_postre2.getWidth(), b_postre2.getHeight(), Image.SCALE_SMOOTH)));
		
		
		//>>JUGOS ##FALTA UNA IMAGEN DEL PROFE##
		jugos = new JLabel("Jugos:");
		jugos.setBounds(300, 250, 100, 25);
		

		b_jugo1 = new JButton();
		b_jugo1.setBounds(340, 280, 90, 80);
		ImageIcon jugo1 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/a.jpeg");
		b_jugo1.setIcon(new ImageIcon(jugo1.getImage().getScaledInstance(b_jugo1.getWidth(), b_jugo1.getHeight(), Image.SCALE_SMOOTH)));
		
		b_jugo2 = new JButton();
		b_jugo2.setBounds(440, 280, 90, 80);
		ImageIcon jugo2 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Jugo exprimido de Naranja.jpeg");
		b_jugo2.setIcon(new ImageIcon(jugo2.getImage().getScaledInstance(b_jugo2.getWidth(), b_jugo2.getHeight(), Image.SCALE_SMOOTH)));
		
		b_jugo3 = new JButton();
		b_jugo3.setBounds(340, 380, 90, 80);
		ImageIcon jugo3 = new ImageIcon("/Documentos/Universidad Segundo Semestre 2021/Taller de Progra 2/Codigos Java/Proyecto/src/Jugo de Pepino, Espirulina, Manzana, Piña y Jengibre.jpeg");
		b_jugo3.setIcon(new ImageIcon(jugo3.getImage().getScaledInstance(b_jugo3.getWidth(), b_jugo3.getHeight(), Image.SCALE_SMOOTH)));
		
		
		
		
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
		
	}
	public JPanel getPanel() {
		return panel2;
	}

}
