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

                    } //switch
                } //while loop


          /* String basicChoices = "1. Addition \n2. Subtraction\n3. Multiplication\n4.Division";

           int choice = Console.getIntegerInput("Please select a mathematical function to use:\n"+basicChoices); //get input
           switch (choice) {
               case 1:
                   Integer addA =  Console.getIntegerInput("Enter the first number for addition");
                   Integer addB =  Console.getIntegerInput("Enter the second number for addition");
                   int additionAnswer = BasicCalculator.addition(BasicCalculator.workingValue, addB);
                   Console.println(String.valueOf(additionAnswer));
                   break;
               case 2:
                   Integer subtractA =  Console.getIntegerInput("Enter the first number for subtraction");
                   Integer subtractB =  Console.getIntegerInput("Enter the second number for subtraction");
                   int subtractionAnswer = BasicCalculator.subtraction(subtractA, subtractB);
                   Console.println(String.valueOf(subtractionAnswer));
                   break;
               case 3:
                   Integer multiplyA =  Console.getIntegerInput("Enter the first number for multiplication");
                   Integer multiplyB =  Console.getIntegerInput("Enter the second number for multiplication");
                   int multiplicationAnswer = BasicCalculator.multiplication(multiplyA, multiplyB);
                   Console.println(String.valueOf(multiplicationAnswer));
                   break;
               case 4:
                   Integer divideA =  Console.getIntegerInput("Enter the first number for division");
                   Integer divideB =  Console.getIntegerInput("Enter the second number for division");
                   int divisionAnswer = BasicCalculator.multiplication(divideA, divideB);
                   Console.println(String.valueOf(divisionAnswer));

           } //switch statements
           */

/*
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

 */
    }
}
