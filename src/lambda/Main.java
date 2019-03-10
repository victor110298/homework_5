package lambda;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(4, 2, '+'));
        System.out.println(calculator.calculate(4, 2, '-'));
        System.out.println(calculator.calculate(4, 2, '*'));
        System.out.println(calculator.calculate(4, 2, '/'));
        System.out.println(calculator.calculate(4, 2, 's'));
        System.out.println(calculator.calculate(4, 2, 'p'));
        System.out.println(calculator.calculate(4, 2, 't'));
    }
}

