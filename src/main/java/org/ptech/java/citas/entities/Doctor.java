package org.ptech.java.citas.entities;
import org.ptech.java.citas.enums.*;


public class Doctor extends User{

    // ATTRIBUTES
    private Long medicalRecord;
    private Speciality speciality;

    // CONSTRUCTORS
    public Doctor() {
    }

    public Doctor(int id, String name, String lastName, DniType dniType, Long dni, Long medicalRecord,
            Speciality speciality) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dniType = dniType;
        this.dni = dni;
        this.medicalRecord = medicalRecord;
        this.speciality = speciality;
    } 

    // GETTERS AND SETTERS

    public Long getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(Long medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

}
