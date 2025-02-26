package BattleShip2;

public class InputConverter {
    public static int inputToIndex() {
        while (true) {
            try {
                String input = (UserInteractionHandler.in.next()).toUpperCase();
                char rowLetter = input.charAt(0);
                if (!Character.isDigit(input.charAt(1))){
                    throw new IllegalArgumentException("A mező A1-F6 lehet.");
                }
                int columnNumber = Integer.parseInt(Character.toString(input.charAt(1))) - 1;

                if ((rowLetter == 'A' || rowLetter == 'B' || rowLetter == 'C' || rowLetter == 'D' || rowLetter == 'E' || rowLetter == 'F')
                        && (columnNumber >= 0 && columnNumber < 6)) {
                    int rowNumber = switch (rowLetter) {
                        case 'A' -> 0;
                        case 'B' -> 1;
                        case 'C' -> 2;
                        case 'D' -> 3;
                        case 'E' -> 4;
                        case 'F' -> 5;
                        default -> throw new IllegalArgumentException("Hibás bemenet");
                    };
                    return rowNumber * 6 + columnNumber;
                } else {
                    throw new IllegalArgumentException("A mező A1-F6 lehet.");
                }
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (StringIndexOutOfBoundsException | IllegalArgumentException f) {
                System.out.println("A mező A1-F6 lehet.");
            }
        }
    }
}
