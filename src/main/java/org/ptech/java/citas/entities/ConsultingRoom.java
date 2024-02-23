package org.ptech.java.citas.entities;

public class ConsultingRoom {
    int id;
    String address;
    int number;

    
    public ConsultingRoom() {
    }
    public ConsultingRoom(int id, String address, int number) {
        this.id = id;
        this.address = address;
        this.number = number;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    
}
