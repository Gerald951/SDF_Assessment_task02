package sdf;

public class Calculator {

    public static double ToCalculate(double firstNumber, String operator, double secondNumber) {
        switch (operator) {
            case "+":
                return firstNumber+secondNumber;
                
            case "-":
                return firstNumber-secondNumber;
                
            case "*":
                return firstNumber*secondNumber;
                
            case "/":
                return firstNumber/secondNumber;
                
            default:
                System.out.println("Please input relevant operators: +,-,*,/");
                return 0;
        }
    }
}
