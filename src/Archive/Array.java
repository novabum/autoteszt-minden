package Archive;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 4;
//        int c = 7;

//        int[] intArray = {2, 1, 5};
//        System.out.println(Arrays.toString(intArray));
//        System.out.println(intArray[2]);
//        intArray[0] = 5;
//
//        int[] intArray2 = new int[10];
//        intArray2[0] = 5;
//        intArray2[1] = 5;
//        intArray2[2] = 5;
//        intArray2[6] = 5;
//        System.out.println(Arrays.toString(intArray2));
//
//        String[] StringArray = new String[3];
//        StringArray[0] = "Hello";
//        StringArray[1] = "Fuckface";
//        StringArray[2] = "!!!";
//        System.out.println(Arrays.toString(StringArray));

        //tegyük használhatóvá a tudásunkat. Kérjünk be x számot és ezek legyenek eltárolva egy arrayben
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg, hány számot szeretnél megadni");
        int count = scanner.nextInt();
        int[] Array1 = new int[count];
        for (int i=1; i <= count; i++){
        System.out.println("Add meg az "+i+". számot!");
        Array1[i-1] = scanner.nextInt();
        }
        System.out.println("Ezeket a számokat adtad meg: " + Arrays.toString(Array1));

    }
}
