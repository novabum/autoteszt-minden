import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg, hány prímszámot szeretnél látni.");
        int primeCountToShow = scanner.nextInt();
        int shownPrimeCount = 0;
        int actualNumber = 2;
        while (shownPrimeCount < primeCountToShow) {
            boolean isPrimeVariable = isPrime(actualNumber);
            if (isPrimeVariable) {
                System.out.println(actualNumber);
                shownPrimeCount++;
            }
            actualNumber++;
        }
    }


    private static boolean isPrime(int actualNumber) {
            for (int i = 2; i <= actualNumber / 2; i++) {
            if (actualNumber % i == 0) {
                return false; //ha nem prímszám nincs értelme továbbmenni.
            }
        }
        return true;
    }

    private static boolean showFirstNPrime(int n) {
        int showPrimeCount = 0;
        int actualNumber = 2;
        int shownPrimeCount = 0;
        while (shownPrimeCount < n) {
            if (isPrime(actualNumber)) {
                System.out.println(actualNumber);
                shownPrimeCount++;
            }
            actualNumber++;
        }
        return false;
    }

}