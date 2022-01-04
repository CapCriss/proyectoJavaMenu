/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomati;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends JFrame {

    //creacion de archivo 
    File archivo = new File("src/Historial.txt");
    FileWriter escribir;
    PrintWriter linea;

    //panel
    public JPanel panel;

    //etiquetas
    public JLabel nombreClienteLabel;
    public JLabel direccionLabel;
    public JLabel telefonoLabel;
    public JLabel deliveryLabel;

    //campo de texto
    public TextField nombreCliente;
    public TextField direccion;
    public TextField telefono;

    //comboBox
    public JComboBox delivery;

    //botones
    public JButton listoButton;

    public Cliente(int suma) {
        panel = new JPanel();
        panel.setLayout(null);

        nombreClienteLabel = new JLabel("Nombre del Cliente: ");
        nombreClienteLabel.setBounds(10, 20, 120, 25);
        nombreCliente = new TextField();
        nombreCliente.setBounds(140, 20, 300, 25);

        direccionLabel = new JLabel("Direccion: ");
        direccionLabel.setBounds(10, 50, 120, 25);
        direccion = new TextField();
        direccion.setBounds(140, 50, 300, 25);

        telefonoLabel = new JLabel("Telefono: ");
        telefonoLabel.setBounds(10, 80, 120, 25);
        telefono = new TextField();
        telefono.setBounds(140, 80, 300, 25);

        deliveryLabel = new JLabel("Delivery: ");
        deliveryLabel.setBounds(10, 110, 120, 25);
        delivery = new JComboBox(getDelivery());
        delivery.setBounds(140, 110, 300, 25);

        listoButton = new JButton();
        listoButton.setText("Listo");
        listoButton.setBounds(500, 150, 100, 50);

        //funcion botones 
        listoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!archivo.exists()) {
                    try {
                        archivo.createNewFile();
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println(nombreCliente.getText());
                        linea.println(direccion.getText());
                        linea.println(telefono.getText());
                        linea.println(delivery.getSelectedItem());
                        linea.println(suma);
                        linea.println("Preparación");
                        linea.close();
                        escribir.close();

                    } catch (IOException ex) {
                        Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println(nombreCliente.getText());
                        linea.println(direccion.getText());
                        linea.println(telefono.getText());
                        linea.println(delivery.getSelectedItem());
                        linea.println(suma);
                        linea.println("Preparación");
                        linea.close();
                        escribir.close();

                    } catch (IOException ex) {
                        Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        });

        panel.add(nombreClienteLabel);
        panel.add(nombreCliente);
        panel.add(direccionLabel);
        panel.add(direccion);
        panel.add(telefonoLabel);
        panel.add(telefono);
        panel.add(deliveryLabel);
        panel.add(delivery);
        panel.add(listoButton);

        add(panel);

    }

    private String[] getDelivery() {
        String desicion[] = {"Si", "No"};
        return desicion;
    }

    public JPanel getPanel() {
        return panel;
    }

}
