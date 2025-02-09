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
        else if ('/' == operator && b != 0)
            return (double) a / (double) b;
        else {
            throw new InvalidOperatorException();
        }



//        throw new NullPointerException("asdasdasdasd asd asd asd asd ");
//         throw new ArithmeticException("Arithmetic");
    }

    private boolean isOperatorValid(char operator) {
        return operator == '+' ||
                operator == '-' ||
                operator == '*' ||
                operator == '/';
    }

}
