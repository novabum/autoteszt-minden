package org.example.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    //fel tud venni alkalmazottakat 1-et, többet is egyszerre. és ki is tud rúgni alkalmazottakat.
//több céget szeretnénk készíteni
    private String name;
    private final List<Employee> employees = new ArrayList<>(); //final - nem felülírható, de módosítható.

    public Company(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void hire(Employee employee){
        employees.add(employee);
    }

    public void fire(Employee employee){
        employees.remove(employee);
    }





}
