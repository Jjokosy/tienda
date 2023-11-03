/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.bean.Producto;
import org.interfaces.iMetodos;
import org.servicio.Conectar;

/**
 *
 * @author Jordy
 */

public class productoImpl implements iMetodos<Producto> {
private EntityManager entityManager(){
        return Conectar.getConectar().getEmf().createEntityManager();
    }
    
   EntityManager em =entityManager();

    
    @Override
    public void Registrar(Producto producto) {
        try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
   
    }

    @Override
    public void Actualizar(Producto producto) {
        try {
            em.getTransaction().begin();
            em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Producto> Listaclientes() {
        Query query=em.createQuery("SELECT p FROM Producto p"); 
        return query.getResultList();
    }

    @Override
    public void Borrar(Producto producto) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(producto));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }    
    
}
