package Repositories;

import Data.Patient;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class PatientRepository {


    public void createOne(Patient patient) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit();

    }

    public Patient findOneById(int id) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        return em.find(Patient.class, id);
    }

    public List<Patient> findAll() {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        Query query = em.createQuery("Select p from Patient p");
        return query.getResultList();
    }

    public void updateOne(Patient patient) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit();

    }

    public void deleteOne(int id) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        Patient patient = findOneById(id);
        em.getTransaction().begin();
        em.remove(patient);
        em.getTransaction().commit();

    }

}
