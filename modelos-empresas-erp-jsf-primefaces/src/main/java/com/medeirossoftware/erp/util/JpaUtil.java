package com.medeirossoftware.erp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("Medeiros-Software");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}