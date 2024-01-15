package com.workintech.model;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer " + getName() + " starts to working . ");
        setSalary(getSalary() + 4000);
    }
}
