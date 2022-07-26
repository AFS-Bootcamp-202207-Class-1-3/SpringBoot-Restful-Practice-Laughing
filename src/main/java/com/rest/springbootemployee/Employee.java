package com.rest.springbootemployee;

class Employee{
    private int id;
    private String name;
    private int age;
    private String gender;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    private int salary;

    public Employee(int id, String name, int age, String gender, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
}