package Calculator.Simple.Objects;

import java.util.Scanner;

public class UserInteractionHandler {
    private static final Scanner IN = new Scanner(System.in);

    public static void greetUser() {
        System.out.println("Hello and welcome to the Calculator");
    }

    public static void printRules() {
        System.out.println("Here are the rules:");
    }

    public static void printResult(double result) {
        System.out.println("The result is: " + result);
    }

    public static int getNumber() {
        System.out.println("Your number: ");
        return IN.nextInt();
    }

    public static char getOperator() {
        System.out.println("Your operator: ");
        return IN.next().charAt(0);
    }

    public static void notifyUserAboutInvalidOperator() {
        System.out.println("Operator invalid");
    }

}
