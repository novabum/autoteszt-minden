package Házik;

import java.util.Scanner;

public class PasswordValidater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj egy jelszót, ami legalább 8 karakter, van benne kis-nagybetű és legalább egy: ! @ $ #");
        String a = scanner.next();
//        String a = "654jhgJzf!#"; // true teszt
        boolean hibavan = false;
        if (isItLongEnough(a) & isThereASpecial(a) & isThereLowAndUp(a) & isThereANumber(a)) {
            System.out.println("Szuper a jelszó");
        } else {
            System.out.println("HIBA:");
            theProblemWith(a);
        }
//        System.out.println();
//        System.out.println("MyDebugger:");
//        System.out.println(isItLongEnough(a));
//        System.out.println(isThereASpecial(a));
//        System.out.println(isThereLowAndUp(a));
//        System.out.println(isThereANumber(a));
    }

    //6 Ha mondjuk 6, akkor 0-5 index, i kissebb hat
    private static boolean isThereASpecial(String a) {
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (b == '!' || b == '@' || b == '$' || b == '#') return true;
        }
        return false;
    }

    //Character.isLowerCase() és Character.isUpperCase()
    //használatával ellenőrizzük, hogy van-e benne kis és nagybetű
    private static boolean isThereLowAndUp(String a) {
        boolean isLow = false;
        boolean isUpper = false;

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (Character.isLowerCase(b)) isLow = true;
            if (Character.isUpperCase(b)) isUpper = true;
            if (isLow && isUpper) return true;
        }

        return false;
    }

    private static boolean isItLongEnough(String a) { //megnézzük, elég hosszú-e.
        return a.length() >= 8;
    }

    private static boolean isThereANumber(String a) {
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (Character.isDigit(b)) return true;
        }
        return false;
    }

    private static void theProblemWith(String a) {
        if (!isItLongEnough(a)) {
            System.out.println("- Nem elég hosszú ;)");
        }
        if (!isThereASpecial(a)) {
            System.out.println("- Nincs benne különleges karakter");
        }
        if (!isThereLowAndUp(a)) {
            System.out.println("- Nincs benne kis- ÉS NaGyBeTű");
        }
        if (!isThereANumber(a)) {
            System.out.println("- Nincs benne szám");
        }
    }
}
