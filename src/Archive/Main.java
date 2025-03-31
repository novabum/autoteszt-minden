package Archive;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
//        Diákosztályozó szuperalkalmazás ver.01
        Scanner scanner = new Scanner(System.in);
//        int diakszam = scanner.nextInt();
//
//        for (int i = 0; i <= diakszam; i++) {
//            System.out.println("Osztályozd a soron következő diákot");
//            int osztalyzat = scanner.nextInt();
//            if (osztalyzat >= 0 & osztalyzat <= 60)
//                System.out.println("Büdös nagy egyes öcsém!");
//                else if (osztalyzat >= 61 & osztalyzat <= 70)
//                    System.out.println("Ez már legalább egy kettes!");
//                else if (osztalyzat >= 71 & osztalyzat <= 80)
//                    System.out.println("Ez már hármas!");
//                else if (osztalyzat >= 81 & osztalyzat <= 90)
//                    System.out.println("Ez négyes!");
//                else if (osztalyzat >= 81 & osztalyzat <= 90)
//                    System.out.println("Pedáns disznó!");
//                else
//                System.out.println("Error baszd meg");
//                --i;
//        }

        System.out.println("Hány diákot szeretnék osztályozni?");
        int count = scanner.nextInt();
        for (int i = 1; i < (count + 1); i++) {
            System.out.print("Tanuló " + i + ": ");
            int score = scanner.nextInt();
            if (score >= 0 && score <= 60) {
                System.out.println("Tanuló " + i + ": F osztályzatot kapott");
            } else if (score >= 61 && score <= 70) {
                System.out.println("Tanuló " + i + ": D osztályzatot kapott");
            } else if (score >= 71 && score <= 80) {
                System.out.println("Tanuló " + i + ": C osztályzatot kapott");
            } else if (score >= 81 && score <= 90) {
                System.out.println("Tanuló " + i + ": B osztályzatot kapott");
            } else if (score >= 91 && score <= 100) {
                System.out.println("Tanuló " + i + ": A osztályzatot kapott");
            } else {
                System.out.println("Csak 0-100 közötti szám adható meg");
                --i;
            }
//
//        }





    }
}}