
package org.interfaces;

import java.util.List;
import org.bean.Cliente;

public interface iCliente {
    public void Registrar(Cliente cliente);
    
    public void Actualizar(Cliente cliente);
    
    public List<Cliente> Listaclientes();
    
    public void Borrar(Cliente cliente);
}
