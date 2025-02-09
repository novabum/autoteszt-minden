import java.util.Arrays;
import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg hány számot szeretnél megadni");
        int darab = scanner.nextInt();
        int[] szamok = new int[darab];
        for (int i = 0; i < darab; i++) {
            System.out.println("Add meg a " + i + ".számot");
            szamok[i] = scanner.nextInt();
        }
        System.out.println("Ezeket a számokat adtad meg: " + Arrays.toString(szamok));
        //számoljuk ki a legynagyobbat
        int max = szamok[0];
        //azért j = 1, mert saját magával nem kell összehasonlítani
        for (int j = 1; j < darab; j++) {
            if (szamok[j] > max) {
                max = szamok[j];
            }
        }
        System.out.println("A legnagyobb megadott szám: " + max);

    }
}
