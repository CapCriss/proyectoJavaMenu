/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomati;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public class Historial extends JFrame {
    String [] cabezera = {"Nombre","Dirección", "Telefono"," Delivery","Total Compra","Estado del pedido"};
    File archivo = new File("src/Historial.txt");
    String [][] datos;

    public Historial() {
        if(contarLineas(archivo)>0)
        {
            datos=new String[contarLineas(archivo)][6];
            try {
                if(archivo.exists())
                {
                    int fila=0,columna=0;
                    BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
                    String lineaLeida;
                    while((lineaLeida=archivoLeer.readLine())!=null)
                    {
                        datos[fila][columna]=lineaLeida;
                        columna++;
                        if(columna%6==0)
                        {
                            fila++;
                            columna=0;
                        }
                    }
                   DefaultTableModel mod = new DefaultTableModel(datos,cabezera);
                   JTable tabla = new JTable(mod);
                   JScrollPane scroll = new JScrollPane(tabla);
                   scroll.setBounds(40,40,400,200);
                    add(scroll);
                }
                else
                {
                    JPanel panel = new JPanel();
                    panel.setLayout(null);
                    JLabel sinArchivo = new JLabel("No hay clientes Inscritos");
                    sinArchivo.setBounds(50, 112, 200, 50);
                    sinArchivo.setFont(new Font("arial",Font.PLAIN,11));
                    panel.add(sinArchivo);
                    add(panel);
                }
            } catch (Exception e) {
            }
        }
    }
    
    
    public int contarLineas(File archivo)
    {
        int contador = 0;
        try
        {
            if(archivo.exists())
            {
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
                while(archivoLeer.readLine() !=null )
                {
                    contador++;
                }
                archivoLeer.close();
            }
           
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return contador;
    }
    
}
