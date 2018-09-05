/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.testing;

import edu.cuc.metodosSimulacion.Metodos;
import edu.cuc.metodosSimulacion.Queues;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ghostemane
 */
public class SimulacionTes {
    
    public SimulacionTes() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testEnqueueIsEmpy(){
        Queues<String> queues = new Queues();
        queues.enqueue("PruebaTest");
        queues.enqueue("SegundaPruebaTest");
        assertEquals("Top no es igual al nodo creado",queues.getFirst(), queues.peek());
        assertEquals("El tamaño inicial no es uno", queues.size(), 2);
        
    }
    
    public void testDequeueIsEmpy(){
        Queues<String> queues = new Queues<>();
        queues.enqueue("SegundaPruebaTest");
        queues.dequeue();
        assertEquals("El tamaño es 0", queues.size(), 0);
        
    }
    
    public void TestAgregarArchivo(){
        Queues<String> queues = new Queues<>();
        queues.enqueue("Agregando archivo");
        assertEquals("El archivo a sido agregado con exito", queues.size(), 1);
        Metodos.agregarArchivos();
    }
    
    public void TestMostrarArchivo(JLabel mostrarTexto){
       Queues<String> queues = new Queues<>();
       queues.enqueue("Mostrar archivo");
       assertEquals("El archivo que agrego si se puede mostrar", queues.size(), mostrarTexto);
       Metodos.mostrarQueues(mostrarTexto);
    }
    
    public void TestBorrarArchivo(){
       Queues<String> queues = new Queues<>();
       queues.enqueue("Borrar Archivo");
       assertEquals("El archivo a sido borrado", queues.size(), null);
       Metodos.borrarArchivo();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
