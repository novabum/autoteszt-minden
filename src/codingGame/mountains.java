package codingGame;

import java.util.Arrays;
import java.util.Scanner;

public class mountains {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] mountain = new int[8];

        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
                mountain[i] = in.nextInt(); // represents the height of one mountain.
            }
            Arrays.sort(mountain);
            System.out.println(Arrays.toString(mountain));
            System.out.println(7); // The index of the mountain to fire on.
        }
    }
}
