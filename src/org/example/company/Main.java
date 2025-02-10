package org.example.company;

public class Main {
    public static void main(String[] args) {

        Employee jozsi = new Employee(
                6,
                300000.43,
                "József",
                "Acountant"
        );
//        System.out.println(jozsi.getName());

        Employee laci = new Employee(
                8,
                430000.43,
                "Lacika",
                "CEO"
        );

        Company webler = new Company("Webler Oktatóstúdió");
        webler.hire(jozsi);
        webler.hire(laci);

        int size = webler.getEmployees().size();
        for (int i = 0; i < size; i++){
            Employee employee = webler.getEmployees().get(i);
            System.out.println(employee.getName()+" "+employee.getRole());
        }
        //ALT CTRL V = változóba tud extractolni!!!

Employee employee1 = new Employee( 1, 564654.44, "Nyunyóka", "Professional Koldus");
Employee employee1 = new Employee( 1, 564654.44, "Marharépa", "Tetőács");
Employee employee1 = new Employee( 1, 564654.44, "SzuperÁcs", "Tetőács");


    }
}
