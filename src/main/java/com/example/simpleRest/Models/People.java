package com.example.simpleRest.Models;

public class People {

    private String name;
    private String lastName;
    private String phone;
    private int identification;

    public People(String n,String ln, String p) {
        name = n;
        lastName = ln;
        phone = p;
        identification = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }


}
