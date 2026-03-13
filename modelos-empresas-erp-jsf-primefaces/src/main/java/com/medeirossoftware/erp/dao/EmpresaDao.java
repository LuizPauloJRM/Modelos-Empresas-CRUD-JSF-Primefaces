package com.medeirossoftware.erp.dao;

import javax.persistence.EntityManager;

import com.medeirossoftware.erp.model.Empresa;
import com.medeirossoftware.erp.util.JpaUtil;

public class EmpresaDao {

    public void salvar(Empresa empresa) {

        EntityManager em = JpaUtil.getEntityManager();

        try {

            em.getTransaction().begin();

            em.persist(empresa);

            em.getTransaction().commit();

        } catch (Exception e) {

            em.getTransaction().rollback();
            e.printStackTrace();

        } finally {

            em.close();

        }

    }

}