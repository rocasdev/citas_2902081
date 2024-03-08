package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.DniType;

public class User {
    protected int id;
    protected String name;
    protected String lastName;
    protected DniType dniType;
    protected Long dni;
    
    public String toString(){
        return "Nombre: "+this.name;
    }

    public User(){
        
    }

    public User(int id, String name, String lastName, DniType dniType, Long dni) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dniType = dniType;
        this.dni = dni;
    }

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

    
}
