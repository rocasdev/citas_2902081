package org.ptech.java.citas.entities;

import java.util.ArrayList;
import java.util.List;

import org.ptech.java.citas.entities.enums.DniType;

public class Nurse extends User{
    private List<String> procedures;

    public Nurse(int id, String name, String lastName, DniType dniType, Long dni) {
        super(id, name, lastName, dniType, dni);
        this.procedures = new ArrayList<>();
    }

    public void addProcedure(String procedure){
        this.procedures.add(procedure);
    }

    public List<String> getProcedure(){
        return this.procedures;
    }

    
}
