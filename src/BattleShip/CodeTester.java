package BattleShip;

import Calculator.Simple.Objects.InvalidOperatorException;

import java.util.Arrays;
import java.util.Scanner;

public class CodeTester {
    public static void main(String[] args) {

        boolean isItHorizontal = UserInteractionHandler.isYourShipHorizontal();
        System.out.println(isItHorizontal);

    }


}


//    public static boolean isYourShipHorizontal() {
//        Scanner in = new Scanner(System.in);
//        int shipOrientation;
//
//        while (true) {
//            try {
//                shipOrientation = Integer.parseInt(in.nextLine());
//                if (shipOrientation == 1) {
//                    return false; // Függőleges
//                } else if (shipOrientation == 2) {
//                    return true; // Vízszintes
//                } else {
//                    throw new IllegalArgumentException("Érvénytelen! 1 vagy 2!");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Érvénytelen!  1 vagy 2!");
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//        }

//public static void printAShip(Ship[] playersShip){
//    System.out.println(Arrays.toString(playersShip[0].getShipCells()));
//    System.out.println(Arrays.toString(playersShip[1].getShipCells()));
//    System.out.println(Arrays.toString(playersShip[2].getShipCells()));
//    System.out.println(Arrays.toString(playersShip[3].getShipCells()));
//    System.out.println(Arrays.toString(playersShip[4].getShipCells()));
//}

//        public static int selectionToIndex() {
//            Scanner in = new Scanner(System.in);
//            String input = (in.next()).toUpperCase();
//            char rowLetter = input.charAt(0);
//            int columnNumber = Integer.parseInt(Character.toString(input.charAt(1))) -1; //na fasza NumberFormatException!!!
//
//            while (true) {
//                try {
//                    if (rowLetter == 'A' || rowLetter == 'B' || rowLetter == 'C' || rowLetter == 'D' || rowLetter == 'E' || rowLetter == 'F' && columnNumber > 0 && columnNumber < 7) {
//                        int rowNumber = 0;
//                        switch (rowLetter) {
//                            case 'A' -> rowNumber = 0;
//                            case 'B' -> rowNumber = 1;
//                            case 'C' -> rowNumber = 2;
//                            case 'D' -> rowNumber = 3;
//                            case 'E' -> rowNumber = 4;
//                            case 'F' -> rowNumber = 5;
//                        }
//                        return rowNumber * 6 + columnNumber;
//                    } else {
//                        throw new NullPointerException("A mező A1-F6 lehet.");
//                    }
//                } catch (NullPointerException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }


//int test = 12;
//
//
//        try {
//                if (test > 12){
//        throw new InvalidOperatorException();
//            }
//                    } catch (InvalidOperatorException e) {
//        throw new RuntimeException(e);
//        }

//
//        int[] shipCells = {0, 2};
//        int player = 1;
//        boolean isItHorizontal = false;
//
//
//        Ship p1Ship2 = new Ship(
//                shipCells,
//                "Player " + player,
//                isItHorizontal,
//                false);
//
//        System.out.println(p1Ship2.getShipOwner());

//player 1 creates ship 1
//        UserInteractionHandler.makeAShipDialogue(1, 1);
//        int[] shipCells = UserInteractionHandler.selectAndToIndex();//bekérjük és konvertáljuk a hajó indexét int arraybe
//       System.out.println(Arrays.toString(selection));
//        Ship p1Ship1 = new Ship(
//                shipCells,
//                "Player1",
//                false,
//                false);
//
//        Grid.drawShipOnGrid(p1Ship1.getShipCells(), grid1); //felrajzoljuk a táblára
//        Grid.printGrid(grid1);


//        int[] shipCells = new int[shipSize];
//        int head = selectedShipHead[0];
//
//        //elfoglalt cellák megírása
//        if (horizontal & (head % 6) + shipSize <= 6) { // vízszintes és el is fér
//            for (int i = 0; i < shipSize; i++) {
//                shipCells[i] = head++;
//            }
//        } else if (!horizontal & head + (shipSize - 1) * 6 < 36) { //függőleges és el is fér
//            for (int i = 0; i < shipSize; i++) {
//                shipCells[i] = head;
//                head += 6;
//            }
//        } else {
//            System.out.println("Érvénytelen pozíció"); //HIBA
//        }
//        //validálni kell, hogy nincs-e már rajta hajó, azaz "□" a térképen a hajó celláiból
//        boolean collision = false;
//        for (int i = 0; i < shipSize; i++) {
//            if (playerMap[shipCells[i]].equals("□")) {
//                collision = true;
//                System.out.println("A hajó ütközik egy másikkal"); //HIBA
//            }
//        }
//        return shipCells; //ezt csak akkor szabad visszaadni, ha minden ok
//
//    }
//}
//        int[] array = {2,3,4};
//        for (int i = 0; i < (array.length); i++){
//
//        }
//
//        String string = "d3";
//        string = string.toUpperCase();
//        char rowLetter = string.charAt(0);
//        int columnNumber= (Character.getNumericValue(string.charAt(1))-1);
//        int rowNumber = 0;
//        switch (rowLetter) {
//            case 'A' -> rowNumber = 0;
//            case 'B' -> rowNumber = 1;
//            case 'C' -> rowNumber = 2;
//            case 'D' -> rowNumber = 3;
//            case 'E' -> rowNumber = 4;
//            case 'F' -> rowNumber = 5;
//        }
//        System.out.println(rowNumber);
//        System.out.println(columnNumber);
//        System.out.println(rowNumber * 6 + columnNumber);
//    }
//}
