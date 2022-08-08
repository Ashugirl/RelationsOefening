package View;

import Data.MedicalFile;
import Data.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PatientApp {
    public static void main(String[] args) {

        Patient patient = new Patient("12345678", "John Smith", false);
        Patient patient1 = new Patient("23456789", "Barbara Jones", true);
        Patient patient2 = new Patient("34567891", "Jane Brown", false);
        Patient patient3 = new Patient("45678912", "Phil Bert", true);

        MedicalFile medicalFile = new MedicalFile(patient, "none");
        MedicalFile medicalFile1 = new MedicalFile(patient1, "diabetes");
        MedicalFile medicalFile2 = new MedicalFile(patient2, "none");
        MedicalFile medicalFile3 = new MedicalFile(patient3, "Crohn's disease");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AvivaDatabase");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(medicalFile);
        em.getTransaction().commit();

    }
}
