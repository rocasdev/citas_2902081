package org.ptech.java.citas.entities;

import java.time.LocalDateTime;
import org.ptech.java.citas.entities.enums.AppointmentState;

public class Appointment {
    int id;
    LocalDateTime dateTime;
    ConsultingRoom consultingRoom;
    public Appointment() {
    }
    public Appointment(int id, LocalDateTime dateTime, Doctor doctor, Patient patient, ConsultingRoom consultingRoom,
            AppointmentState appointmentState) {
        this.id = id;
        this.dateTime = dateTime;
        this.consultingRoom = consultingRoom;
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
    public ConsultingRoom getConsultingRoom() {
        return consultingRoom;
    }
    public void setConsultingRoom(ConsultingRoom consultingRoom) {
        this.consultingRoom = consultingRoom;
    }
}