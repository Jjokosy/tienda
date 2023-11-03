/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.dao;

import java.util.List;
import org.bean.Proveedor;
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
public class proveedorImplTest {
    
    public proveedorImplTest() {
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
     * Test of Registrar method, of class proveedorImpl.
     */
    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        Proveedor proveedor = null;
        proveedorImpl instance = new proveedorImpl();
        instance.Registrar(proveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class proveedorImpl.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Proveedor proveedor = null;
        proveedorImpl instance = new proveedorImpl();
        instance.Actualizar(proveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listaclientes method, of class proveedorImpl.
     */
    @Test
    public void testListaclientes() {
        System.out.println("Listaclientes");
        proveedorImpl instance = new proveedorImpl();
        List<Proveedor> expResult = null;
        List<Proveedor> result = instance.Listaclientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Borrar method, of class proveedorImpl.
     */
    @Test
    public void testBorrar() {
        System.out.println("Borrar");
        Proveedor proveedor = null;
        proveedorImpl instance = new proveedorImpl();
        instance.Borrar(proveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
