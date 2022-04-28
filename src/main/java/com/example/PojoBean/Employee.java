package com.example.PojoBean;

import org.springframework.context.event.SmartApplicationListener;

//pojo class to represent employee
public class Employee {
    //default field
    String name;
    //public field
    public String id;
    //private field
    private double salary;

    //args constructor to initiliaze fields
    public Employee(String name, String id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
