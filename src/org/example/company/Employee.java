package org.example.company;

public class Employee {
    private final int id;
    private double salary;
    private String name;
    private String role;

    public Employee(int id, double salary, String name, String role){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.role = role;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

}
