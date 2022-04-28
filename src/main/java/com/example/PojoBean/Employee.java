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

    //getter and setter methods

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }


    }
