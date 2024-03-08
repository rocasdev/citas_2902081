package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.DniType;
import org.ptech.java.citas.entities.enums.Speciality;

public class PolymorphismTests {
    public static void main(String[] args) {
        User u = new Doctor(1,"Andres","Meza", DniType.CC, 1117964715L, 1006527086L, Speciality.MEDICINA_GENERAL);
        System.out.println(u.toString());
    }
}