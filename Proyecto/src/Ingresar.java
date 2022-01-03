import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class Ingresar {
	//atributos generales
	public JPanel panel1;
	public JTextField nombre;
	public JList clientesGuardados;
	
	
	//botones
	public JButton boton_añadir;
	
	//etiquetas
	public JLabel nombreEtiqueta;
	public JLabel clientesEtiqueta;
	
	ArrayList<String> arrList = new ArrayList<>();
	
	public Ingresar() {
		panel1 = new JPanel();
		panel1.setLayout(null);
		
		nombre = new JTextField();
		nombre.setBounds(20, 40, 150, 25);
		
		nombreEtiqueta = new JLabel("Ingrese nombre del cliente");
		nombreEtiqueta.setBounds(180, 40, 200, 25);
		
		boton_añadir = new JButton("Añadir");
		boton_añadir.setBounds(40, 70, 80, 25);
		
		clientesEtiqueta = new JLabel("Clientes:");
		clientesEtiqueta.setBounds(20, 100, 100, 25);
		
		//ArrayList<String> arrList = new ArrayList<>();
		
		DefaultListModel<String> nombreGuardado = new DefaultListModel<>();
		JList<String> clientesGuardados = new JList <>(nombreGuardado);
		clientesGuardados.setBounds(20, 120, 400, 200);
		
		
		
		// funcion de botones
		boton_añadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				nombreGuardado.addElement(nombre.getText());
				
				arrList.add(nombre.getText());
				nombre.setText(null);
			}
		});
		
		
		
		
		
		
		panel1.add(nombre);
		panel1.add(nombreEtiqueta);
		panel1.add(clientesEtiqueta);
		panel1.add(boton_añadir);
		panel1.add(clientesGuardados);
	
	}
	
	
	public JPanel getPanel() {
		return panel1;
	}
	
	public String[] getClientes_guardados() {
		String [] nombres = new String[arrList.size()];
		
		for(int i = 0; i < arrList.size(); i++) {
			nombres[i] = arrList.get(i);
		}
			
		return nombres;
	}
	
	
}