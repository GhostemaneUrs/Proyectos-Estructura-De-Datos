/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.testing;

import edu.cuc.metodosSimulacion.Queues;
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
public class SimuladorTesting {
    
    public SimuladorTesting() {
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
    
    @After
    public void tearDown() {
    }

    public void testEnqueueIsEmpy(){
        Queues<String> queues = new Queues();
        queues.enqueue("PruebaTest");
        assertEquals("La cola a sido agregada correctamente", queues.getFirst(), queues.dequeue());
    }
}
