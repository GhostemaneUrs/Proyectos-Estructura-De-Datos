
package edu.cuc.metodosSimulacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Ghostemane
 */
public class Metodos {
    private static final Queues<String> listaQueues = new Queues<>();

    
    

    public static void agregarArchivos() {
        try {
            String almacenador;
            FileReader lector = new FileReader("Spool.txt");
            BufferedReader buffer = new BufferedReader(lector);
            while ((almacenador = buffer.readLine()) != null) {
                listaQueues.enqueue(almacenador);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro el archivo");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al leer el archivo");
        }
    }

    public static void mostrarQueues(JLabel mostrarTexto) {
        String acomulador = "<html>";
        Iterator<String> it = listaQueues.iterator();
        while (it.hasNext()) {
            String next = it.next();
            acomulador += "\t"+next;
        }
        mostrarTexto.setText(acomulador);
    }
   
    public static void borrarArchivo() {
      listaQueues.dequeue();      
    }

    public static int verSegundos() {
        String nombreArchivo = listaQueues.peek();
        String[] division = nombreArchivo.split(",");
        int segundo = Integer.parseInt((division[1].replace(" ", "")));
        System.out.println(division[0]);
        System.out.println(segundo);
        return segundo;
    }
    
     public static String vernombres() {
        String nombreArchivo = listaQueues.peek();
        String[] division = nombreArchivo.split(",");
        return division[0];
    }
    
    public static boolean Vacio(){
        return listaQueues.IsEmpty();
    }
}
