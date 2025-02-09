package Calculator.Simple.Objects;

public class Calculator {

    public double calculate(int a, int b, char operator) {
        if (!isOperatorValid(operator)) {
            throw new InvalidOperatorException();
        }

        if ('+' == operator)
            return a + b;
        else if ('-' == operator)
            return a - b;
        else if ('*' == operator)
            return a * b;
        else
            return (double) a / (double) b;
    }

//        throw new NullPointerException("asdasdasdasd asd asd asd asd ");
//         throw new ArithmeticException("Arithmetic");

    private boolean isOperatorValid(char operator) {
        return operator == '+' ||
                operator == '-' ||
                operator == '*' ||
                operator == '/';
    }


}
