package ua.epam.practice.entity;

import java.util.List;

public class Dormitory {

    private long dormitoryId;
    private String name, address;
    private List<Room> rooms;

    public Dormitory(long dormitoryId, String name, String address, List<Room> rooms) {
        this.dormitoryId = dormitoryId;
        this.name = name;
        this.address = address;
        this.rooms = rooms;
    }

    public long getDormitoryId() {
        return dormitoryId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
