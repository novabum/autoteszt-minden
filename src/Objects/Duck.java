package Objects;

public class Duck extends Animals {
    private static final int LEG_COUNT = 2; //static -> konstans, nem változhat futási idő alatt
    public static void printDuckBreeds(){ //static -> mert nem egy példányra vonatkozik, haanem az egész classra
        System.out.println("asd");
    }
//haszbálata: Duck.printDuckBreeds();



    public void move(DuckMovementType movementType) {

        if (movementType == DuckMovementType.FLY) System.out.println("flap flap");
        else if (movementType == DuckMovementType.SWIM) System.out.println("nya nya");
        else if (movementType == DuckMovementType.WALK) System.out.println("blabla");

        switch (movementType){
            case FLY -> System.out.println("ssss");
            case SWIM -> System.out.println("asd");
            case WALK -> System.out.println("llllllaaa");

        }
    }

    public  void switchString(String abc){
        switch (abc) {
            case "nyunya" -> System.out.println("dadasdasd");
            case "ajdf" -> System.out.println("jnshbshdf");
            case null -> System.out.println("sadasgggg");
            default -> System.out.println("asdasdsad");

        }
    }




}
