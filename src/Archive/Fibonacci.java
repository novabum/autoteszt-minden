package Archive;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Hány darab Fibonacci számot szeretnél látni?");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < count; i++) {
            int c = a + b;
            System.out.print(c+", ");
            b = a;
            a = c;
        }
    }
}
