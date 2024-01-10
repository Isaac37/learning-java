package com.vision3;


public class Student {
    String name;
    String surname;
    String address;

    public Student(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public  void  setName (String name) {
        this.name = name;
    }
    public  void  setSurname (String surname) {
        this.surname = surname;
    }

    public  void  setAddress (String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String a() {
        return ("name is " + this.getName());
    }

    public static void main(String[] args) {
        Student Isaac = new Student("Isaac", "Kumbula", "11980 Bazooka");
        System.out.println(Isaac.a());

    }


}