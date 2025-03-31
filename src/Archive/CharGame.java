package Archive;

import java.util.Arrays;
import java.util.Scanner;
//EZ a program a kisbetűs karakterekből nagybetűset és vica versa készít. Nagyon izgi

public class CharGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány darab karaktert szeretnél megadni?");
        int darab = scanner.nextInt();

        char[] userChars = new char[darab];
        for (int i = 0; i < darab; i++) {
            System.out.println("Add meg a " + i + ". karaktert");
            userChars[i] = scanner.next().charAt(0);
        }
        System.out.println("A megadott karakterek: " + Arrays.toString(userChars));

        char[] reversedChars = new char[darab];
        for (int i = 0; i < darab; i++) {
            if (userChars[i] > 91) {
                reversedChars[i] = (char) (userChars[i] - 32);
            } else {
                reversedChars[i] = (char) (userChars[i] + 32);
            }
        }
        System.out.println(Arrays.toString(reversedChars));
    }
}

