package sdf;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        boolean input = true;
        double $last = 0;

        System.out.println("Welcome.");
        Scanner scan = new Scanner(System.in);
        //while loop 
        while (input) {
            System.out.println("Please key in formula based on the following format: Number (space) Operator (space) Number");
            String s = scan.next();
            //if scan.next() does not match with "exit" string
            if (!(s.equalsIgnoreCase("exit"))) {
                // if scan.next() matches with $last variable
                if (s.equals("$last")) {
                    double firstNumber = $last;
                    String operator = scan.next();
                    double secondNumber = scan.nextDouble();  
                    //System.out.println(String.valueOf(firstNumber) + " " + operator + " " + String.valueOf(secondNumber));
                    double result = Calculator.ToCalculate(firstNumber, operator, secondNumber);
                    $last = result;
                    System.out.println(String.valueOf($last));
                    
                   //if scan.next() is a double value (NOT variable) 
                } else {
                    double firstNumber = Double.valueOf(s);
                    String operator = scan.next();
                    double secondNumber = scan.nextDouble();  
                    //System.out.println(String.valueOf(firstNumber) + " " + operator + " " + String.valueOf(secondNumber));
                    double result = Calculator.ToCalculate(firstNumber, operator, secondNumber);
                    $last = result;
                    System.out.println(String.valueOf($last));
                       
                }
            // scan.next match with "exit" string   
            } else {
                input = false;
                System.out.println("Bye Bye");
                
                
            }
        } scan.close();
    }
}