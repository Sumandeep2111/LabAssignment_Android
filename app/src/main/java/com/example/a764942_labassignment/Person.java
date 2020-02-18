package com.example.a764942_labassignment;

public class Person {

    int id;
    String name;
    String lastname;
    String phone;
    String address;

    public Person(int id, String name, String lastname, String phone, String address) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
