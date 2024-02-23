package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.Appointment;
import org.ptech.java.citas.entities.AppointmentState;
import org.ptech.java.citas.entities.BloodType;
import org.ptech.java.citas.entities.ConsultingRoom;
import org.ptech.java.citas.entities.DniType;
import org.ptech.java.citas.entities.Doctor;
import org.ptech.java.citas.entities.Patient;
import org.ptech.java.citas.entities.Speciality;

public class Main {
    public static void main(String[] args) {

        Doctor d = new Doctor(0, "Andres Felipe", "Meza Tovar", DniType.CC, 1117964715L, 1020304050L, Speciality.MEDICINA_GENERAL);
        Patient p = new Patient(0, "Marshall Daniel", "Gallo Guiza", DniType.TI, 1006527086L, "gallo@info.com", 3002589647L, LocalDate.of(2006, Month.NOVEMBER, 12), 182.0, 62.5, BloodType.O, '-');
        ConsultingRoom cr = new ConsultingRoom();
        cr.setId(0);
        cr.setAddress("KR 100 #15-27A");
        cr.setNumber(5);
        Appointment ap = new Appointment(0, LocalDateTime.now(), d, p, cr, AppointmentState.REALIZADA);

        System.out.println("==== Doctores ====");
        System.out.println("Nombre: "+d.getName()+"\nApellido: "+d.getLastName()+"\nTipo Documento: "+d.getDniType()+"\nDocumento: "+d.getDni()+"\nRegistro Medico: "+d.getMedicalRecord()+"\nEspecialidad: "+d.getSpeciality());
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("==== Pacientes ====");
        System.out.println("Nombre: "+p.getNames()+"\nApellido: "+p.getLastName()+"\nTipo Documento: "+p.getDniType()+"\nDocumento: "+p.getDni()+"\nEmail: "+p.getEmail()+"\nFecha Nacimiento: "+p.getBirthdate()+"\nPeso: "+p.getWeight()+"\nAltura: "+p.getHeight()+"\nTipo De Sangre: "+p.getBloodType()+"\nFactor RH: "+p.getRhFactor());
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("==== Consultorios ====");
        System.out.println("Id: "+cr.getId()+"\nDireccion: "+cr.getAddress()+"\nNumero Consultorio: "+cr.getNumber());
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("==== Citas ====");
        System.out.println("Id: "+ap.getId()+"\nFecha: "+ap.getDateTime()+"\nNumero Consultorio: "+ap.getConsultingRoom().getNumber()+"\nPaciente: "+ap.getPatient().getNames()+" "+ap.getPatient().getLastName()+"\nDoctor: "+ap.getDoctor().getName()+" "+ap.getDoctor().getLastName());
    }
}