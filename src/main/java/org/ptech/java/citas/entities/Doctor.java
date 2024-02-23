package org.ptech.java.citas.entities;

public class Doctor {

    // ATTRIBUTES
    private int id;
    private String name;
    private String lastName;
    private DniType dniType;
    private Long dni;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DniType getDniType() {
        return dniType;
    }

    public void setDniType(DniType dniType) {
        this.dniType = dniType;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

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
