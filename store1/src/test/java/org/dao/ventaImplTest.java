/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.dao;

import java.util.List;
import org.bean.Venta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordy
 */
public class ventaImplTest {
    
    public ventaImplTest() {
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

    /**
     * Test of Registrar method, of class ventaImpl.
     */
    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        Venta venta = null;
        ventaImpl instance = new ventaImpl();
        instance.Registrar(venta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class ventaImpl.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Venta venta = null;
        ventaImpl instance = new ventaImpl();
        instance.Actualizar(venta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listaclientes method, of class ventaImpl.
     */
    @Test
    public void testListaclientes() {
        System.out.println("Listaclientes");
        ventaImpl instance = new ventaImpl();
        List<Venta> expResult = null;
        List<Venta> result = instance.Listaclientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Borrar method, of class ventaImpl.
     */
    @Test
    public void testBorrar() {
        System.out.println("Borrar");
        Venta venta = null;
        ventaImpl instance = new ventaImpl();
        instance.Borrar(venta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
