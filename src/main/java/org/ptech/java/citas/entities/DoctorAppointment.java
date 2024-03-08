package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.interfaces.IAgendable;

public class DoctorAppointment extends Appointment implements IAgendable{

    @Override
    public boolean scheduleAppointment(LocalDateTime dateTime, ConsultingRoom consultingRoom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scheduleAppointment'");
    }

    @Override
    public boolean rescheduleappointment(LocalDateTime newDateTime, ConsultingRoom newConsultingRoom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rescheduleappointment'");
    }

    @Override
    public boolean cancelAppointment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelAppointment'");
    }
    
}
