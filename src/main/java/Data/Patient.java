package Data;

import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    private String rijksregisternummer;
    private String name;
    private boolean sick;

    public Patient() {
    }

    public Patient(String rijksregisternummer, String name, boolean sick) {
        this.rijksregisternummer = rijksregisternummer;
        this.name = name;
        this.sick = sick;
    }

    public String getRijksregisternummer() {
        return rijksregisternummer;
    }

    public void setRijksregisternummer(String rijksregisternummer) {
        this.rijksregisternummer = rijksregisternummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

}
