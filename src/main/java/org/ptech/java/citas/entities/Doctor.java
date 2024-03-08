package org.ptech.java.citas.entities;
import org.ptech.java.citas.entities.enums.DniType;
import org.ptech.java.citas.entities.enums.Speciality;


public class Doctor extends User{

    // ATTRIBUTES
    private Long medicalRecord;
    private Speciality speciality;

    public Doctor(int id, String name, String lastName, DniType dniType, Long dni) {
        super(id, name, lastName, dniType, dni);
    }

    public Doctor(int id, String name, String lastName, DniType dniType, Long dni, Long medicalRecord,
            Speciality speciality) {
        super(id, name, lastName, dniType, dni);
        this.medicalRecord = medicalRecord;
        this.speciality = speciality;
    }

    //Override methods

    @Override
    public String toString(){
        return String.format("Nombre: %s \nApellido: %s \nRegistro Medico: %s \nEspecialidad: %s", super.name, super.lastName, this.medicalRecord, this.speciality);
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
