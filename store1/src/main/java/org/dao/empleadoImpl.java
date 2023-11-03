/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.bean.Empleado;
import org.interfaces.iMetodos;
import org.servicio.Conectar;

public class empleadoImpl implements iMetodos<Empleado> {

    private EntityManager entityManager(){
        return Conectar.getConectar().getEmf().createEntityManager();
    }
    
   EntityManager em =entityManager();

    
    @Override
    public void Registrar(Empleado empleado) {
        try {
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
   
    }

    @Override
    public void Actualizar(Empleado empleado) {
        try {
            em.getTransaction().begin();
            em.merge(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Empleado> Listaclientes() {
        Query query=em.createQuery("SELECT e FROM Empleado e"); 
        return query.getResultList();
    }

    @Override
    public void Borrar(Empleado empleado) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(empleado));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
}
