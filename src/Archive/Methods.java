package Archive;

public class Methods {
    public static void main(String[] args) {
        int valtozo = sum(5, 11);

        System.out.println(valtozo);
        System.out.println(sum(valtozo, 7));
        System.out.println(subtract(valtozo, 5));
        System.out.println(contact("Duck", "Fucker"));

        String a ="Xsdasdasd";
        char b = a.charAt(0);
        System.out.println(b);
    }

    private static int sum(int a, int b) {
        return a + b;

    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static String contact(String a, String b) {
        return a + " " + b;
    }

}
