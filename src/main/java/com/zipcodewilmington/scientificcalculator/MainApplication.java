package com.zipcodewilmington.scientificcalculator;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    static int workingValue = 0;

            public static void main(String[] args) {
                boolean on = true;
                workingValue = Console.getIntegerInput("Enter a starting value: ");
                String chooseOp = "Choose an operation:";
                String opList = "*OPERATIONS*\n+ : Addition \n- : Subtraction\n* : Multiplication\n/ : Division\nsq : Square\nsqrt : Square Root\nexp : exponentiate\ninverse: inversion\ninvert : invert\nclear : clear";
                Console.println(opList);
                String operation;
                while(on == true) {
                    operation = Console.getStringInput(chooseOp);
                    switch (operation) {
                        case "+":
                            Integer addA = Console.getIntegerInput("Enter a number to add:");
                            workingValue = BasicCalculator.addition(workingValue, addA);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "-":
                            Integer subtractA = Console.getIntegerInput("Enter a number for subtraction");
                            workingValue = BasicCalculator.subtraction(workingValue, subtractA);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "*":
                            Integer multiplyA = Console.getIntegerInput("Enter a number for multiplication");
                            workingValue = BasicCalculator.multiplication(workingValue, multiplyA);
                            Console.println(String.valueOf(workingValue));
                            operation = "";
                            break;
                        case "/":
                            Integer divideA = Console.getIntegerInput("Enter a number for division");
                            workingValue = BasicCalculator.division(workingValue, divideA);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "sq":
                            Console.println("Your number was squared to: ");
                            workingValue = BasicCalculator.square(workingValue);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "sqrt":
                            Console.println("Your number was squared to: ");
                            workingValue = BasicCalculator.squareRoot(workingValue);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "exp":
                            Integer exponentA = Console.getIntegerInput("Enter an exponent");
                            workingValue = BasicCalculator.exponentiation(workingValue, exponentA);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "inverse":
                            Console.println("The inverse of the number is: ");
                            workingValue = BasicCalculator.inversion(workingValue);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "invert":
                            Console.println("The inverted value of the number is:");
                            workingValue = BasicCalculator.invert(workingValue);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "clear":
                            workingValue = 0;
                            Console.println(String.valueOf(workingValue));
                            break;







                    } //switch
                } //while loop
    }
}
