/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.dao;

import java.util.List;
import org.bean.Producto;
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
public class productoImplTest {
    
    public productoImplTest() {
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
     * Test of Registrar method, of class productoImpl.
     */
    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        Producto producto = null;
        productoImpl instance = new productoImpl();
        instance.Registrar(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class productoImpl.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Producto producto = null;
        productoImpl instance = new productoImpl();
        instance.Actualizar(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listaclientes method, of class productoImpl.
     */
    @Test
    public void testListaclientes() {
        System.out.println("Listaclientes");
        productoImpl instance = new productoImpl();
        List<Producto> expResult = null;
        List<Producto> result = instance.Listaclientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Borrar method, of class productoImpl.
     */
    @Test
    public void testBorrar() {
        System.out.println("Borrar");
        Producto producto = null;
        productoImpl instance = new productoImpl();
        instance.Borrar(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
