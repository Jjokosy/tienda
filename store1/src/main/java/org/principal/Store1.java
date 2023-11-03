

package org.principal;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bean.Categoria;
import org.bean.Cliente;
import org.bean.DetalleVenta;
import org.bean.Empleado;
import org.bean.Producto;
import org.bean.Proveedor;
import org.bean.Venta;
import org.dao.calcularImpl;
import org.dao.categoriaImpl;
import org.dao.clienteImpl;
import org.dao.empleadoImpl;
import org.dao.productoImpl;
import org.dao.proveedorImpl;
import org.dao.ventaImpl;
public class Store1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        clienteImpl cliente=new clienteImpl();
        List<Venta>ventas=new ArrayList<>();
        List<DetalleVenta>listaventas=new ArrayList<>();
        List<Producto>productos = new ArrayList<>();
       
        
        //Cliente
        
        //cliente.Registrar(new Cliente(3,"jordy",ventas));
      /*List<Cliente> ListaClientes = cliente.Listaclientes();
       for(Cliente c :ListaClientes ){
           System.out.println("NOMBRE       : "+c.getNombre());*/
       }
       
       
       //Empleado
       //empleadoImpl empleado= new empleadoImpl();
     //empleado.Actualizar(new Empleado(2,"martin martin",ventas));
       
      
        //ventaImpl venta = new ventaImpl();
        //venta.Registrar(new Venta(1,new Date(),new Cliente(1),new Empleado(1),listaventas));
       
        // Proveedor
        
       /*proveedorImpl prove=new proveedorImpl();
       prove.Registrar(new Proveedor(2,"Papeleria el Inca",productos));*/
     
       //Categoria
       
       //categoriaImpl categoria= new categoriaImpl();
       //categoria.Registrar(new Categoria(1,"Alimentos secos",productos) );
       //categoria.Registrar(new Categoria(1,"Papeleria y Material de oficina ",productos) );

       //Producto
       
       //productoImpl producto=new productoImpl();
       //producto.Registrar(new Producto(1,"Arroz Blanco",24,,listaventas,new Proveedor(1),new Categoria(1)));
       
        calcularImpl calcular = new calcularImpl();
        System.out.println(calcular.CalcularIGV(1.8, 1500));
    }
}
