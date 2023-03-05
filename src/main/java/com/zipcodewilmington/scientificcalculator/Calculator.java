package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
    double num1 = 0;
    double num2 = 0;
    char operator;
    Scanner scanner = new Scanner(System.in);
    static String menu = "\nChoose an operation:\n+ Add\n- Subtract\n* Multiply\n/ Divide\n^ Exponent\n~ Square Root\n1/x Inverse\n-1 switchSign\n Exit";

    public void run(String userInput) {
        System.out.println(menu);
        operator = scanner.next().charAt(0);

        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter a second number: ");
        num2 = scanner.nextInt();

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 !=0){
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Cannot divide by "0);
                };
                break;
            case '^':
                System.out.println(Math.pow(num1,num2));
                break;
            case '~':
                System.out.println(Math.sqrt(num1));
                break;
            case "1/x":
                System.out.println(1/num1);
                break;
            case -1:
                System.out.println(num1 *-1);
                break;
            case "Exit":
                System.out.println("You have exited calculator");
                System.exit(0);
                break;
            default:
                System.out.println("Error");
                System.exit(0);
                break;
        }
    }
}


