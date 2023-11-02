
package org.test;

import org.dao.calcularImpl;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PruebasUnitarias {
     @Test
    public void testCalcularIGV() {
        System.out.println("CalcularIGV");
        double impuesto = 0.18;
        double importe = 1500;
        calcularImpl instance = new calcularImpl();
        double expResult = 270;
        double result = instance.CalcularIGV(impuesto, importe);
        assertEquals(expResult, result, 0);

    }
}
