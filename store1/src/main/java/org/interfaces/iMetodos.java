
package org.interfaces;

import java.util.List;


public interface iMetodos<T> {
    public void Registrar(T t);
    
    public void Actualizar(T t);
    
    public List<T> Listaclientes();
    
    public void Borrar(T t);
}
