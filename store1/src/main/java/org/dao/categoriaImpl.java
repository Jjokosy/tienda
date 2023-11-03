
package org.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.bean.Categoria;
import org.bean.Venta;
import org.interfaces.iMetodos;
import org.servicio.Conectar;


public class categoriaImpl implements iMetodos<Categoria> {

  private EntityManager entityManager(){
        return Conectar.getConectar().getEmf().createEntityManager();
    }
    
   EntityManager em =entityManager();

    
    @Override
    public void Registrar(Categoria categoria) {
        try {
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
   
    }

    @Override
    public void Actualizar(Categoria categoria) {
        try {
            em.getTransaction().begin();
            em.merge(categoria);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Categoria> Listaclientes() {
        Query query=em.createQuery("SELECT c FROM Categoria c"); 
        return query.getResultList();
    }

    @Override
    public void Borrar(Categoria categoria) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(categoria));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }    
}
