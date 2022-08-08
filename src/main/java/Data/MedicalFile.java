package Data;

import javax.persistence.*;

@Entity
public class MedicalFile {

    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    @JoinColumn(name = "patient_rijksregisternummer")
    private Patient patient;
    private String illness;

    public MedicalFile() {
    }

    public MedicalFile(Patient patient, String illness) {
       // this.id = id;
        this.patient = patient;
        this.illness = illness;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
