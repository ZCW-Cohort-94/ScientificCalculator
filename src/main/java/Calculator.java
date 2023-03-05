import java.util.Scanner;
import java.util.*;

public class Calculator {

    Scanner scanner = new Scanner(System.in); // Scanner named scanner for user input

    double firstNumber = scanner.nextDouble(); //reads the input as a 'double' value
    String operator = null; // reads the input as a string
    double result = 0; // variable used to store the result of operation

    public void userInput(){
        firstNumber = scanner.nextDouble(); //reads the input as a 'double' value
        System.out.println("Enter first number:"); //prompting user to input the first number

        System.out.println("Enter operator ( + , - , * , / , sqrt, ^ ) :"); // prompting the user to enter the operator

        operator = scanner.next(); // reads the input as a string
    }

    /* Switch statement is used to perform the operation based on the input. user is asked to input the second number as
    a double and store it in the result variable.  */
    public void checkOperation() {
        double secondNumber = 0;
        switch (operator) {
            case "+":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = add(firstNumber, secondNumber);
                break;
            case "-":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = subtract(firstNumber, secondNumber);
                break;
            case "*":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = multiply(firstNumber, secondNumber);
                break;
            case "/":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = divide(firstNumber, secondNumber);
                break;
            case "sqrt":
                result = Math.sqrt(firstNumber);
                break;
            case "^":
                secondNumber = scanner.nextDouble();
                result = power(firstNumber, secondNumber);
                break;
            case "inv":
                result = inverse(firstNumber);
                if (result == 0.0){
                    System.out.println("Invalid Operation");
                }
                break;
            case "invsign":
                result = inverseSign(firstNumber);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public double sqrt(double num) {
        return Math.sqrt(num);
    }

    public double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double inverse(double num1) {
        if (num1 != 0) {
            return 1 / num1;
        } else {
            return 0.0 ;
        }
    }
    public double inverseSign(double num1){
        return num1 * -1;
    }
}

