package lambda;

public class Calculator {
    public static double operate(double a, double b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    private void addition() {
        MathOperation additionOp = (number1, number2) -> number1 + number2;
        System.out.println("50 + 10 = " + operate(50, 10, additionOp));
    }

    private void subtraction() {
        MathOperation subtractionOp = (number1, number2) -> number1 - number2;
        System.out.println("50 - 10 = " + operate(50, 10, subtractionOp));
    }

    private void multiplication() {
        MathOperation multiplicationOp = (number1, number2) -> number1 * number2;
        System.out.println("50 * 10 = " + operate(50, 10, multiplicationOp));
    }

    private void division() {
        MathOperation divisionOp = (number1, number2) -> number1 / number2;
        System.out.println("50 / 10 = " + operate(50, 10, divisionOp));
    }

    private void sqrt() {
        MathOperation sqrtOp = ((number1, number2) -> Math.pow(number1,(1/number2)));
        System.out.println("Sqrt(49, 2) = " + operate(49, 2, sqrtOp));
    }
    private void pow(){
        MathOperation powOp = ((number1, number2) -> Math.pow(number1,number2));
        System.out.println("5 ^ 2 = " + operate(5, 2, powOp));
    }
    private void mathTask(){
        MathOperation powOp = ((number1, number2) -> Math.pow(((number1+number2)/number1)+117,number2));
        System.out.println("5 ^ 2 = " + operate(5, 2, powOp));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();
        calculator.sqrt();
        calculator.pow();
        calculator.mathTask();

    }
}
