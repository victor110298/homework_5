package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;

public class Calculator {
    private final Map<Character, DoubleBinaryOperator> operations = new HashMap<>();

    public double calculate(double firstNumber, double secondNumber, char operation) {
        return Optional.ofNullable(operations.get(operation)).orElseThrow(()
                -> new IllegalArgumentException("Unknown operation")).applyAsDouble(firstNumber, secondNumber);
    }

    public Calculator() {
        operations.put('+', (number1, number2) -> number1 + number2);
        operations.put('-', (number1, number2) -> number1 - number2);
        operations.put('*', (number1, number2) -> number1 * number2);
        operations.put('/', (number1, number2) -> number1 / number2);
        operations.put('s', ((number1, number2) -> Math.pow(number1, (1 / number2))));
        operations.put('p', ((number1, number2) -> Math.pow(number1, number2)));
        operations.put('t', (number1, number2) -> Math.pow(((number1 + number2) / number1) + 117, number2));

    }
}

