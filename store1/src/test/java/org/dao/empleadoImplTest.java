/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.dao;

import java.util.List;
import org.bean.Empleado;
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
public class empleadoImplTest {
    
    public empleadoImplTest() {
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
     * Test of Registrar method, of class empleadoImpl.
     */
    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        Empleado empleado = null;
        empleadoImpl instance = new empleadoImpl();
        instance.Registrar(empleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class empleadoImpl.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Empleado empleado = null;
        empleadoImpl instance = new empleadoImpl();
        instance.Actualizar(empleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listaclientes method, of class empleadoImpl.
     */
    @Test
    public void testListaclientes() {
        System.out.println("Listaclientes");
        empleadoImpl instance = new empleadoImpl();
        List<Empleado> expResult = null;
        List<Empleado> result = instance.Listaclientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Borrar method, of class empleadoImpl.
     */
    @Test
    public void testBorrar() {
        System.out.println("Borrar");
        Empleado empleado = null;
        empleadoImpl instance = new empleadoImpl();
        instance.Borrar(empleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
