
package org.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.bean.Cliente;
import org.interfaces.iCliente;
import org.servicio.Conectar;

public class clienteImpl implements iCliente{

    private EntityManager entityManager(){
        return Conectar.getConectar().getEmf().createEntityManager();
    }
    
   EntityManager em =entityManager();

    
    @Override
    public void Registrar(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
   
    }

    @Override
    public void Actualizar(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Cliente> Listaclientes() {
        Query query=em.createQuery("SELECT c FROM Cliente c"); 
        return query.getResultList();
    }

    @Override
    public void Borrar(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(cliente));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
}
