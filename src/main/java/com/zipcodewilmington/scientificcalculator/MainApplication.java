package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Console; //not sure if i need to since it's in the same package
import java.util.zip.CheckedOutputStream;
import com.zipcodewilmington.scientificcalculator.BasicCalculator; //not sure if i need to since it's in the same package
import com.zipcodewilmington.scientificcalculator.ScientificCalculator; //not sure if i need to since it's in the same package

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    static int workingValue = 0;

            public static void main(String[] args) {
                boolean on = true;
                String chooseOp = "Choose an operation:";
                String opList = "Choose an operation from the following:\n+ : Addition \n- : Subtraction\n* : Multiplication\n/ : Division\nsq : Square";
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
                        case "exp":
                            Integer exponentA = Console.getIntegerInput("Enter an exponent");
                            workingValue = BasicCalculator.exponentiation(workingValue, exponentA);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "inverse":
                            Console.getIntegerInput("The inverse of the number is: ");
                            workingValue = BasicCalculator.inversion(workingValue);
                            Console.println(String.valueOf(workingValue));
                            break;
                        case "invert":
                            Console.getIntegerInput("The inverted value of the number is:");
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
