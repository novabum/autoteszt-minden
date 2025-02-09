package Calculator.Simple.Objects;

public class Main {
    public static void main(String[] args) {
        UserInteractionHandler.greetUser();
        UserInteractionHandler.printRules();
        int a = UserInteractionHandler.getNumber();
        char operator = UserInteractionHandler.getOperator();
        int b = UserInteractionHandler.getNumber();
        Calculator calculator = new Calculator();
        double result = calculator.calculate(a, b, operator);
        try {
            UserInteractionHandler.printResult(result);
        } catch (InvalidOperatorException e) {
            UserInteractionHandler.notifyUserAboutInvalidOperator();
        }
    }


////  Exception handling
//        try
//
//    {
//        calculator.calculate(a, b, operator);
//    } catch(
//    ArithmeticException exception)
//
//    {
//        System.out.println(exception.getMessage());
//    } catch(
//    NullPointerException exception2)
//
//    {
//        System.out.println("Tette vette teremtette");
//    }

}

