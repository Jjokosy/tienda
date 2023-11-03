/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.dao;

import java.util.List;
import org.bean.DetalleVenta;
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
public class detalleventaImplTest {
    
    public detalleventaImplTest() {
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
     * Test of Registrar method, of class detalleventaImpl.
     */
    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        DetalleVenta detalleventa = null;
        detalleventaImpl instance = new detalleventaImpl();
        instance.Registrar(detalleventa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class detalleventaImpl.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        DetalleVenta detalleventa = null;
        detalleventaImpl instance = new detalleventaImpl();
        instance.Actualizar(detalleventa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listaclientes method, of class detalleventaImpl.
     */
    @Test
    public void testListaclientes() {
        System.out.println("Listaclientes");
        detalleventaImpl instance = new detalleventaImpl();
        List<DetalleVenta> expResult = null;
        List<DetalleVenta> result = instance.Listaclientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Borrar method, of class detalleventaImpl.
     */
    @Test
    public void testBorrar() {
        System.out.println("Borrar");
        DetalleVenta detalleventa = null;
        detalleventaImpl instance = new detalleventaImpl();
        instance.Borrar(detalleventa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
