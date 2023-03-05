package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Console; //not sure if i need to since it's in the same package
import java.util.zip.CheckedOutputStream;
import com.zipcodewilmington.scientificcalculator.BasicCalculator; //not sure if i need to since it's in the same package
import com.zipcodewilmington.scientificcalculator.ScientificCalculator; //not sure if i need to since it's in the same package

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

        public static void main(String[] args) {
        // Console console = new Console(); //instantiate the console class so i can use it. have to instantiate it because it's not static. not necessary since it's a static class
           String basicChoices = "1. Addition \n2. Subtraction\n3. Multiplication\n4.Division";


           int choice = Console.getIntegerInput("Please select a mathematical function to use:\n"+basicChoices); //get input
           switch (choice) {
               case 1:
                   Integer addA =  Console.getIntegerInput("Enter the first number for addition");
                   Integer addB =  Console.getIntegerInput("Enter the second number for addition");
                   int additionAnswer = BasicCalculator.addition(addA, addB);
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



           }


            //Integer firstUserInput =  Console.getIntegerInput("Give me the first number to add");
            //Integer secondUserInput =  Console.getIntegerInput("Give me the second number to add");
            //int answer = BasicCalculator.addition(firstUserInput, secondUserInput);
            //Console.println(String.valueOf(answer));

            //maybe some kind of switch case to choose which mathematical function




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
