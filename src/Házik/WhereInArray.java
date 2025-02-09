package Házik;

import java.util.Scanner;

public class WhereInArray {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Milyen számot keresünk a tömbben?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean foundIt = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == a){
                foundIt = true;
                System.out.println(a + " Megtalálható a tömb " + (i + 1) + ". pozíciójában");
            }
        }
        if (!foundIt) System.out.println(a + " nem található a tömbben.");
    }
}
