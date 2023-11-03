/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.bean.DetalleVenta;
import org.bean.Proveedor;
import org.interfaces.iMetodos;
import org.servicio.Conectar;

/**
 *
 * @author Jordy
 */
public class detalleventaImpl implements iMetodos<DetalleVenta> {
    
    private EntityManager entityManager(){
        return Conectar.getConectar().getEmf().createEntityManager();
    }
    
   EntityManager em =entityManager();

    
    @Override
    public void Registrar(DetalleVenta detalleventa) {
        try {
            em.getTransaction().begin();
            em.persist(detalleventa);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
   
    }

    @Override
    public void Actualizar(DetalleVenta detalleventa) {
        try {
            em.getTransaction().begin();
            em.merge(detalleventa);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<DetalleVenta> Listaclientes() {
        Query query=em.createQuery("SELECT d FROM DetalleVenta d"); 
        return query.getResultList();
    }

    @Override
    public void Borrar(DetalleVenta detalleventa) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(detalleventa));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }    
}
