package org.ptech.java.citas.entities;

public class ConsultingRoom {
    int id;
    String address;
    int code;

    
    public ConsultingRoom() {
    }
    public ConsultingRoom(int id, String address, int code) {
        this.id = id;
        this.address = address;
        this.code = code;
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
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    
}
