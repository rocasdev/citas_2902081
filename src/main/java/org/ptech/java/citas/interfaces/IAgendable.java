package org.ptech.java.citas.interfaces;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.ConsultingRoom;

public interface IAgendable {
    public boolean scheduleAppointment(LocalDateTime dateTime, ConsultingRoom consultingRoom);
    public boolean rescheduleappointment(LocalDateTime newDateTime, ConsultingRoom newConsultingRoom);
    public boolean cancelAppointment();
}
