package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.BloodType;
import org.ptech.java.citas.entities.enums.DniType;


import java.time.LocalDate;

public class Patient extends User {
    private String email;
    private Long phoneNumber;
    private LocalDate birthdate;
    private Double height;
    private Double weight;
    private BloodType bloodType;
    private char rhFactor;
    
    public Patient(int id, String name, String lastName, DniType dniType, Long dni) {
        super(id, name, lastName, dniType, dni);
    }

    public Patient(String email, Long phoneNumber,
            LocalDate birthdate, Double height, Double weight, BloodType bloodType, char rhFactor) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return name;
    }

    public void setNames(String name) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public char getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }

}
