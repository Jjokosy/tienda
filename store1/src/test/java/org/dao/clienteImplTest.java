/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.dao;

import java.util.List;
import org.bean.Cliente;
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
public class clienteImplTest {
    
    public clienteImplTest() {
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

    /*esta prueba es para registrar datos consta deeassad*/
    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        Cliente cliente = null;
        clienteImpl instance = new clienteImpl();
        instance.Registrar(cliente);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Actualizar method, of class clienteImpl.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Cliente cliente = null;
        clienteImpl instance = new clienteImpl();
        instance.Actualizar(cliente);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Listaclientes method, of class clienteImpl.
     */
    @Test
    public void testListaclientes() {
        System.out.println("Listaclientes");
        clienteImpl instance = new clienteImpl();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.Listaclientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Borrar method, of class clienteImpl.
     */
    @Test
    public void testBorrar() {
        System.out.println("Borrar");
        Cliente cliente = null;
        clienteImpl instance = new clienteImpl();
        instance.Borrar(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
