/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.bean.Proveedor;
import org.interfaces.iMetodos;
import org.servicio.Conectar;

/**
 *
 * @author Jordy
 */
public class proveedorImpl implements iMetodos<Proveedor> {
    
    private EntityManager entityManager(){
        return Conectar.getConectar().getEmf().createEntityManager();
    }
    
   EntityManager em =entityManager();

    
    @Override
    public void Registrar(Proveedor proveedor) {
        try {
            em.getTransaction().begin();
            em.persist(proveedor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
   
    }

    @Override
    public void Actualizar(Proveedor proveedor) {
        try {
            em.getTransaction().begin();
            em.merge(proveedor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Proveedor> Listaclientes() {
        Query query=em.createQuery("SELECT p FROM Proveedor p"); 
        return query.getResultList();
    }

    @Override
    public void Borrar(Proveedor proveedor) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(proveedor));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }    
}
