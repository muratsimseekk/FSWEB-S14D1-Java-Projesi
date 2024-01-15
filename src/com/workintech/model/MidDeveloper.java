package com.workintech.model;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Medium Developer " + getName() + " starts to working.");
        setSalary(getSalary() + 3000);
    }
}
