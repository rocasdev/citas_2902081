package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

public class Appointment {
    int id;
    LocalDateTime dateTime;
    Doctor doctor;
    Patient patient;
    ConsultingRoom consultingRoom;
    AppointmentState appointmentState;
    public Appointment() {
    }
    public Appointment(int id, LocalDateTime dateTime, Doctor doctor, Patient patient, ConsultingRoom consultingRoom,
            AppointmentState appointmentState) {
        this.id = id;
        this.dateTime = dateTime;
        this.doctor = doctor;
        this.patient = patient;
        this.consultingRoom = consultingRoom;
        this.appointmentState = appointmentState;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public ConsultingRoom getConsultingRoom() {
        return consultingRoom;
    }
    public void setConsultingRoom(ConsultingRoom consultingRoom) {
        this.consultingRoom = consultingRoom;
    }
    public AppointmentState getAppointmentState() {
        return appointmentState;
    }
    public void setAppointmentState(AppointmentState appointmentState) {
        this.appointmentState = appointmentState;
    }
}