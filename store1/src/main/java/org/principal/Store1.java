

package org.principal;

import java.util.List;
import org.bean.Cliente;
import org.bean.Venta;
import org.dao.calcularImpl;
import org.dao.clienteImpl;
public class Store1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        clienteImpl cliente=new clienteImpl();
        List<Venta>ventas=null;
        //cliente.Registrar(new Cliente(3,"jordy",ventas));
       /*List<Cliente> ListaClientes = cliente.Listaclientes();
       for(Cliente c :ListaClientes ){
           System.out.println("NOMBRE       : "+c.getNombre());
       }*/
       
        calcularImpl calcular = new calcularImpl();
        System.out.println(calcular.CalcularIGV(1.8, 1500));
    }
}
