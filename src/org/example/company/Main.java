package org.example.company;

public class Main {
    public static void main(String[] args) {
        Employee jozsi = new Employee(
                6,
                300000.43,
                "József",
                "Acountant"
        );
        System.out.println(jozsi.getName());
    }
}
