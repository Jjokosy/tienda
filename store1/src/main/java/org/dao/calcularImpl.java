
package org.dao;

import org.interfaces.iCalculos;

public class calcularImpl implements iCalculos {

    @Override
    public double CalcularIGV(double impuesto, double importe) {
        return impuesto * importe ;
    }

    @Override
    public String validacionRuc(String ruc) {
        String resultado;
        if(ruc.equalsIgnoreCase("12345678")){
        resultado="CONTRIBUYENTE ACTIVO";
        } else{
            resultado="CONTRIBUYENTE INACTIVO";
        }
        return resultado;
    }
    
}
