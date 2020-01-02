/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtel.model;

/**
 *
 * @author Administrator
 */
public class Student {
    private int id;
    private String name;
    private String gender;
    private String address;
    private int age;

    public Student(int id, String name, String gender, String address, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public Student(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
    
    
}
