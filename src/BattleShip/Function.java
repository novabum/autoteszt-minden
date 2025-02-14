package BattleShip;

public class Function {
    public static void aLotOfSpaces() {
        System.out.println("\n\n\n");
    }

    //kiszámolja a megadott cella indexét
    public static int inputToIndex() {
        while (true) {
            try {
                String input = (UserInteractionHandler.in.next()).toUpperCase();
                char rowLetter = input.charAt(0);
                if (!Character.isDigit(input.charAt(1))){
                    throw new IllegalArgumentException("A mező A1-F6 lehet.");
                }
                int columnNumber = Integer.parseInt(Character.toString(input.charAt(1))) - 1; //na fasza NumberFormatException!!!

                if (rowLetter == 'A' || rowLetter == 'B' || rowLetter == 'C' || rowLetter == 'D' || rowLetter == 'E' || rowLetter == 'F' && columnNumber > 0 && columnNumber < 7) {
                    int rowNumber = 0;
                    switch (rowLetter) {
                        case 'A' -> rowNumber = 0;
                        case 'B' -> rowNumber = 1;
                        case 'C' -> rowNumber = 2;
                        case 'D' -> rowNumber = 3;
                        case 'E' -> rowNumber = 4;
                        case 'F' -> rowNumber = 5;
                    }
                    return rowNumber * 6 + columnNumber;
                } else {
                    throw new NullPointerException("A mező A1-F6 lehet.");
                }
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (StringIndexOutOfBoundsException | IllegalArgumentException f) {
                System.out.println("A mező A1-F6 lehet.");
            }
        }
    }
}
