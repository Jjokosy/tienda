/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.bean.Venta;
import org.interfaces.iMetodos;
import org.servicio.Conectar;

public class ventaImpl implements iMetodos<Venta> {

    private EntityManager entityManager(){
        return Conectar.getConectar().getEmf().createEntityManager();
    }
    
   EntityManager em =entityManager();

    
    @Override
    public void Registrar(Venta venta) {
        try {
            em.getTransaction().begin();
            em.persist(venta);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
   
    }

    @Override
    public void Actualizar(Venta venta) {
        try {
            em.getTransaction().begin();
            em.merge(venta);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Venta> Listaclientes() {
        Query query=em.createQuery("SELECT v FROM Venta v"); 
        return query.getResultList();
    }

    @Override
    public void Borrar(Venta venta) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(venta));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
}
