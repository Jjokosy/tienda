/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.dao;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordy
 */
public class calcularImplTest {
    
   
    /**
     * Test of CalcularIGV method, of class calcularImpl.
     */
    @Test
    public void CalcularIGV() {
        System.out.println("CalcularIGV");
        double impuesto = 0.18;
        double importe = 1500;
        calcularImpl instance = new calcularImpl();
        double expResult = 270;
        double result = instance.CalcularIGV(impuesto, importe);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void validacionruc(String ruc){
    System.out.println("ValidarRuc");
    }
    
}
