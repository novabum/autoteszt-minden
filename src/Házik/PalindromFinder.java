import java.util.Scanner;

public class PalindromFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy szót, és megnézem, Palindrom-e");
        String myWord = scanner.nextLine();
        String reversed = wordReverser(myWord);
//        System.out.println(reversed);
        isItAPalidrom(reversed, myWord);
    }

    private static void isItAPalidrom(String reversed, String myWord) {
        if (reversed.equals(myWord)) {
            System.out.println("A megadott szó Palindrom:" + reversed);
        } else {
            System.out.println("A megadott szó nem Palindrom! Ugyanis " + myWord + " nem ugyanaz mint: " + reversed);
        }
    }

    private static String wordReverser(String myWord) {
        String reverse = "";
        //-1 mert index!; addig megyünk lefelé, kilépés: 0-ás indexnél;
        // és mindig egyel visszább lépünk a karakterek között
        for (int i = myWord.length() - 1; i >= 0; i--) {
            //Belerakosgatjuk betűnként a "reverse" stringbe
            reverse += myWord.charAt(i);
        }
        return reverse; //kiköpjük a fordított karaktersorrendű eredményt
    }

}
