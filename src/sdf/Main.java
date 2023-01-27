package sdf;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        System.out.println("Welcome.");
        System.out.println("Please key in formula based on the following format: Number (space) Operator (space) Number");
        Scanner scan = new Scanner(System.in);
        
        String firstNumber = scan.next("null");
        String operator = scan.next("null");
        String secondNumber = scan.next("null");

        System.out.println(firstNumber);
        System.out.println(operator);
        System.out.println(secondNumber);



    }
}