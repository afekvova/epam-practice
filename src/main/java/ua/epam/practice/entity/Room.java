package ua.epam.practice.entity;


import ua.epam.practice.entity.account.impl.Student;

import java.util.List;

public class Room {

    private int roomNumber, capacity;
    private boolean available;
    private List<Student> occupants;

    public Room(int roomNumber, int capacity, boolean available, List<Student> occupants) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.available = available;
        this.occupants = occupants;
    }

    public boolean checkAvailability() {
        return this.occupants.size() < this.capacity;
    }

    public void assignStudent(Student student) {
        this.occupants.add(student);
    }

    public void removeStudent(Student student) {
        this.occupants.remove(student);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public List<Student> getOccupants() {
        return occupants;
    }
}
