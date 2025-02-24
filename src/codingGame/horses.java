package codingGame;

import java.util.Arrays;
import java.util.Scanner;

public class horses {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("add");

        int N = in.nextInt();
        Integer[] horsePower = new Integer[N];
        Integer[] diffs = new Integer[N-1];

        for (int i = 0; i < N; i++) {
            horsePower[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(horsePower)); //debug
        Arrays.sort(horsePower);
        System.out.println(Arrays.toString(horsePower)); //debug

        for (int i = N-1; i > 0; i--) {
            diffs[i-1] = horsePower[i] - horsePower[i-1];
        }

        System.out.println(Arrays.toString(diffs)); //debug

        Arrays.sort(diffs);
        for (int i = 0; i < diffs.length - 1; i++) {
            if (diffs[i] > 0) {
                System.out.println((diffs[i]));
                return;
            }
        }
    }
}
