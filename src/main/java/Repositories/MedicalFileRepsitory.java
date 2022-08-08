package Repositories;

import Data.MedicalFile;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class MedicalFileRepsitory {



    public void createOne(MedicalFile file) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(file);
        em.getTransaction().commit();

    }

    public MedicalFile findOneById(int id) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        return em.find(MedicalFile.class, id);
    }

    public List<MedicalFile> findAll() {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        Query query = em.createQuery("Select m from MedicalFile m");
        return query.getResultList();
    }

    public void updateOne(MedicalFile file) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(file);
        em.getTransaction().commit();

    }

    public  void deleteOne(int id) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        MedicalFile file = findOneById(id);
        em.getTransaction().begin();
        em.remove(file);
        em.getTransaction().commit();

    }

}

